package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Customer_Profile;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MCustomerProfile extends X_TDAB_Customer_Profile {
	private static final long serialVersionUID = 1L;
	private static final String REVENUE_MAX = "200000000000";
	private static final String REVENUE_MIN = "25000000000";

	public MCustomerProfile(Properties ctx, int TDAB_Customer_Profile_ID, String trxName) {
		super(ctx, TDAB_Customer_Profile_ID, trxName);
	}

	public MCustomerProfile(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// check doanh thu
		if (new BigDecimal(REVENUE_MIN).compareTo(getRevenue()) > 0
				|| new BigDecimal(REVENUE_MAX).compareTo(getRevenue()) < 0) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DOANH_THU));
		}

		// check ngay hoi tin cic
		if (getDate_CiC().compareTo(getDate_Loan()) > 0) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DATE_CIC));
		}
		// check length note
		if(getNote() != null) {
			if (getNote().length() > 1000) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_MAXLENGTH_NOTE));
			}
		}
		
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		if (newRecord) {
			if (("1".equals(getIsRecordReject()))) {
				if (findByCustomerProfileIdReject(getTDAB_Customer_ID()).size() == 0) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_REJECT));
				}
				genListFinNon(getTDAB_Customer_ID());
				genCIC(getTDAB_Customer_ID());
				genListFinancial(getTDAB_Customer_ID());
				genListDirectKoInfo(getTDAB_Customer_ID());
				genListEarlyWarningQuestionInfo(getTDAB_Customer_ID());
			} else {
				genListDirectKo();
				genListEarlyWarningQuestion();
			}

		}
		return super.afterSave(newRecord, success);
	}

	private void genListEarlyWarningQuestion() {
		// TODO Auto-generated method stub
		StringBuilder whereClauseFinal = new StringBuilder(
				"TDAB_WARNING_QUESTION_QL_ID IN (SELECT TDAB_WARNING_QUESTION_QL_ID FROM TDAB_WARNING_QUESTION_QL WHERE STATUS_CHECK = 'HD')");
		List<MTDABWarningQuestionInfo> earlyQuestions = new Query(null, MTDABWarningQuestionInfo.Table_Name,
				whereClauseFinal.toString(), null).list();
		for (MTDABWarningQuestionInfo earlyQuestion : earlyQuestions) {
			MTDABWarningQuestionHS earlyQuestionHs = new MTDABWarningQuestionHS(getCtx(), 0, get_TrxName());
			earlyQuestionHs.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
			earlyQuestionHs.setWarning_Question_Info_ID(earlyQuestion.getTDAB_Warning_Question_Info_ID());
			earlyQuestionHs.setAnswer_CV(MTDABWarningQuestionHS.ANSWER_CV_No);
			earlyQuestionHs.setWarning_Question_Level(earlyQuestion.getWarning_Question_Level());
			earlyQuestionHs.set_TrxName(get_TrxName());
			earlyQuestionHs.setValue(earlyQuestion.getCode());

			earlyQuestionHs.save(get_TrxName());
		}
	}

	private void genListDirectKoInfo(int id) {
		List<MCustomerProfile> mCus = findByCustomerProfileIdReject(id);
		List<MTDABDirectKOHS> directKos = getListDirectKO(mCus.get(0).getTDAB_Customer_Profile_ID());
		for (MTDABDirectKOHS mtdabDirectKO : directKos) {
			MTDABDirectKOHS directKoHs = new MTDABDirectKOHS(getCtx(), 0, get_TrxName());
			directKoHs.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
			directKoHs.setAnswer_CV(mtdabDirectKO.getAnswer_CV());
			directKoHs.set_TrxName(get_TrxName());
			directKoHs.setDirect_KO_Info_ID(mtdabDirectKO.getDirect_KO_Info_ID());
			directKoHs.setValue(mtdabDirectKO.getValue());

			directKoHs.setIsRecordReject("1");
			directKoHs.save(get_TrxName());
		}

	}

	private void genListEarlyWarningQuestionInfo(int id) {
		List<MCustomerProfile> mCus = findByCustomerProfileIdReject(id);
		List<MTDABWarningQuestionHS> earlyQuestions = getListWarningQuestion(mCus.get(0).getTDAB_Customer_Profile_ID());
		for (MTDABWarningQuestionHS earlyQuestion : earlyQuestions) {
			MTDABWarningQuestionHS earlyQuestionHs = new MTDABWarningQuestionHS(getCtx(), 0, get_TrxName());
			earlyQuestionHs.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
			earlyQuestionHs.setWarning_Question_Info_ID(earlyQuestion.getWarning_Question_Info_ID());
			earlyQuestionHs.setAnswer_CV(earlyQuestion.getAnswer_CV());
			earlyQuestionHs.setWarning_Question_Level(earlyQuestion.getWarning_Question_Level());
			earlyQuestionHs.set_TrxName(get_TrxName());
			earlyQuestionHs.setValue(earlyQuestion.getValue());
			earlyQuestionHs.setIsRecordReject("1");
			earlyQuestionHs.save(get_TrxName());
		}
	}

	private void genListFinNon(int id) {
		List<MCustomerProfile> mCus = findByCustomerProfileIdReject(id);
		MFinancialNon mFinanon = findByCustomerProId(mCus.get(0).getTDAB_Customer_Profile_ID());
		MFinancialNon mFinInfo = new MFinancialNon(getCtx(), 0, get_TrxName());
		mFinInfo.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
		mFinInfo.set_TrxName(get_TrxName());
		mFinInfo.setTDAB_Business_Areas_ID(mFinanon.getTDAB_Business_Areas_ID());
		mFinInfo.setROCE_Index(mFinanon.getROCE_Index());
		mFinInfo.setDate_First_Business_Regist(mFinanon.getDate_First_Business_Regist());
		mFinInfo.setYears_Operation(mFinanon.getYears_Operation());
		mFinInfo.setOwnership_Location_Business(mFinanon.getOwnership_Location_Business());
		mFinInfo.setYears_Experience_CEO(mFinanon.getYears_Experience_CEO());
		mFinInfo.setFinancial_Statements_Audited(mFinanon.getFinancial_Statements_Audited());
		mFinInfo.setType_Business(mFinanon.getType_Business());
		mFinInfo.setComment_On_Audit_Report(mFinanon.getComment_On_Audit_Report());
		mFinInfo.setAverage_Balance_12_Month(mFinanon.getAverage_Balance_12_Month());
		mFinInfo.setIsRecordReject("1");

		mFinInfo.save(get_TrxName());
	}

	private void genCIC(int id) {
		List<MCustomerProfile> mCus = findByCustomerProfileIdReject(id);
		MInfoCIC mCic = findCIC(mCus.get(0).getTDAB_Customer_Profile_ID());
		MInfoCIC mCicInfo = new MInfoCIC(getCtx(), 0, get_TrxName());
		mCicInfo.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
		mCicInfo.setNumber_loan_2_12m(mCic.getNumber_loan_2_12m());
		mCicInfo.setNumber_CIC_Request_12m(mCic.getNumber_CIC_Request_12m());
		mCicInfo.setTotal_Loan_Arising_Date(mCic.getTotal_Loan_Arising_Date());
		mCicInfo.setIsRecordReject("1");
		mCicInfo.save(get_TrxName());
	}

	private void genListFinancial(int id) {

		List<MCustomerProfile> mCus = findByCustomerProfileIdReject(id);
		MFinancialInfo mFin = getByCustomerProfileId(mCus.get(0).getTDAB_Customer_Profile_ID());

		MFinancialInfo mFinInfo = new MFinancialInfo(getCtx(), 0, get_TrxName());

		mFinInfo.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
		mFinInfo.set_TrxName(get_TrxName());

		mFinInfo.setCheck_Upload_Excel(mFin.isCheck_Upload_Excel());
		mFinInfo.setCheck_Hand_Input(mFin.isCheck_Hand_Input());
		mFinInfo.setBCTC_B1_File(mFin.getBCTC_B1_File());
		mFinInfo.setYear_Report_Ly(mFin.getYear_Report_Ly());
		mFinInfo.setYear_Report(mFin.getYear_Report());
		mFinInfo.setCD100LY(mFin.getCD100LY());
		mFinInfo.setCD100(mFin.getCD100());
		mFinInfo.setCD110LY(mFin.getCD110LY());
		mFinInfo.setCD110(mFin.getCD110());
		mFinInfo.setCD111LY(mFin.getCD111LY());
		mFinInfo.setCD111(mFin.getCD111());
		mFinInfo.setCD112LY(mFin.getCD112LY());
		mFinInfo.setCD112(mFin.getCD112());
		mFinInfo.setCD120LY(mFin.getCD120LY());
		mFinInfo.setCD120(mFin.getCD120());
		mFinInfo.setCD121LY(mFin.getCD121LY());
		mFinInfo.setCD121(mFin.getCD121());
		mFinInfo.setCD122LY(mFin.getCD122LY());
		mFinInfo.setCD122(mFin.getCD122());
		mFinInfo.setCD123LY(mFin.getCD123LY());
		mFinInfo.setCD123(mFin.getCD123());
		mFinInfo.setCD124LY(mFin.getCD124LY());
		mFinInfo.setCD124(mFin.getCD124());
		mFinInfo.setCD130LY(mFin.getCD130LY());
		mFinInfo.setCD130(mFin.getCD130());
		mFinInfo.setCD131LY(mFin.getCD131LY());
		mFinInfo.setCD131(mFin.getCD131());
		mFinInfo.setCD132LY(mFin.getCD132LY());
		mFinInfo.setCD132(mFin.getCD132());
		mFinInfo.setCD133LY(mFin.getCD133LY());
		mFinInfo.setCD133(mFin.getCD133());
		mFinInfo.setCD134LY(mFin.getCD134LY());
		mFinInfo.setCD134(mFin.getCD134());
		mFinInfo.setCD135LY(mFin.getCD135LY());
		mFinInfo.setCD135(mFin.getCD135());
		mFinInfo.setCD136LY(mFin.getCD136LY());
		mFinInfo.setCD136(mFin.getCD136());
		mFinInfo.setCD137LY(mFin.getCD137LY());
		mFinInfo.setCD137(mFin.getCD137());
		mFinInfo.setCD139LY(mFin.getCD139LY());
		mFinInfo.setCD139(mFin.getCD139());
		mFinInfo.setCD140LY(mFin.getCD140LY());
		mFinInfo.setCD140(mFin.getCD140());
		mFinInfo.setCD141LY(mFin.getCD141LY());
		mFinInfo.setCD141(mFin.getCD141());
		mFinInfo.setCD149LY(mFin.getCD149LY());
		mFinInfo.setCD149(mFin.getCD149());
		mFinInfo.setCD150LY(mFin.getCD150LY());
		mFinInfo.setCD150(mFin.getCD150());
		mFinInfo.setCD151LY(mFin.getCD151LY());
		mFinInfo.setCD151(mFin.getCD151());
		mFinInfo.setCD152LY(mFin.getCD152LY());
		mFinInfo.setCD152(mFin.getCD152());
		mFinInfo.setCD153LY(mFin.getCD153LY());
		mFinInfo.setCD153(mFin.getCD153());
		mFinInfo.setCD154LY(mFin.getCD154LY());
		mFinInfo.setCD154(mFin.getCD154());
		mFinInfo.setCD155LY(mFin.getCD155LY());
		mFinInfo.setCD155(mFin.getCD155());
		mFinInfo.setCD200LY(mFin.getCD200LY());
		mFinInfo.setCD200(mFin.getCD200());
		mFinInfo.setCD210LY(mFin.getCD210LY());
		mFinInfo.setCD210(mFin.getCD210());
		mFinInfo.setCD211LY(mFin.getCD211LY());
		mFinInfo.setCD211(mFin.getCD211());
		mFinInfo.setCD212LY(mFin.getCD212LY());
		mFinInfo.setCD212(mFin.getCD212());
		mFinInfo.setCD213LY(mFin.getCD213LY());
		mFinInfo.setCD213(mFin.getCD213());
		mFinInfo.setCD214LY(mFin.getCD214LY());
		mFinInfo.setCD214(mFin.getCD214());
		mFinInfo.setCD215LY(mFin.getCD215LY());
		mFinInfo.setCD215(mFin.getCD215());
		mFinInfo.setCD216LY(mFin.getCD216LY());
		mFinInfo.setCD216(mFin.getCD216());
		mFinInfo.setCD219LY(mFin.getCD219LY());
		mFinInfo.setCD219(mFin.getCD219());
		mFinInfo.setCD220LY(mFin.getCD220LY());
		mFinInfo.setCD220(mFin.getCD220());
		mFinInfo.setCD221LY(mFin.getCD221LY());
		mFinInfo.setCD221(mFin.getCD221());
		mFinInfo.setCD222LY(mFin.getCD222LY());
		mFinInfo.setCD222(mFin.getCD222());
		mFinInfo.setCD223LY(mFin.getCD223LY());
		mFinInfo.setCD223(mFin.getCD223());
		mFinInfo.setCD224LY(mFin.getCD224LY());
		mFinInfo.setCD224(mFin.getCD224());
		mFinInfo.setCD225LY(mFin.getCD225LY());
		mFinInfo.setCD225(mFin.getCD225());
		mFinInfo.setCD226LY(mFin.getCD226LY());
		mFinInfo.setCD226(mFin.getCD226());
		mFinInfo.setCD227LY(mFin.getCD227LY());
		mFinInfo.setCD227(mFin.getCD227());
		mFinInfo.setCD228LY(mFin.getCD228LY());
		mFinInfo.setCD228(mFin.getCD228());
		mFinInfo.setCD229LY(mFin.getCD229LY());
		mFinInfo.setCD229(mFin.getCD229());
		mFinInfo.setCD230LY(mFin.getCD230LY());
		mFinInfo.setCD230(mFin.getCD230());
		mFinInfo.setCD231LY(mFin.getCD231LY());
		mFinInfo.setCD231(mFin.getCD231());
		mFinInfo.setCD232LY(mFin.getCD232LY());
		mFinInfo.setCD232(mFin.getCD232());
		mFinInfo.setCD240LY(mFin.getCD240LY());
		mFinInfo.setCD240(mFin.getCD240());
		mFinInfo.setCD241LY(mFin.getCD241LY());
		mFinInfo.setCD241(mFin.getCD241());
		mFinInfo.setCD242LY(mFin.getCD242LY());
		mFinInfo.setCD242(mFin.getCD242());
		mFinInfo.setCD250LY(mFin.getCD250LY());
		mFinInfo.setCD250(mFin.getCD250());
		mFinInfo.setCD251LY(mFin.getCD251LY());
		mFinInfo.setCD251(mFin.getCD251());
		mFinInfo.setCD252LY(mFin.getCD252LY());
		mFinInfo.setCD252(mFin.getCD252());
		mFinInfo.setCD253LY(mFin.getCD253LY());
		mFinInfo.setCD253(mFin.getCD253());
		mFinInfo.setCD254LY(mFin.getCD254LY());
		mFinInfo.setCD254(mFin.getCD254());
		mFinInfo.setCD255LY(mFin.getCD255LY());
		mFinInfo.setCD255(mFin.getCD255());
		mFinInfo.setCD260LY(mFin.getCD260LY());
		mFinInfo.setCD260(mFin.getCD260());
		mFinInfo.setCD261LY(mFin.getCD261LY());
		mFinInfo.setCD261(mFin.getCD261());
		mFinInfo.setCD262LY(mFin.getCD262LY());
		mFinInfo.setCD262(mFin.getCD262());
		mFinInfo.setCD263LY(mFin.getCD263LY());
		mFinInfo.setCD263(mFin.getCD263());
		mFinInfo.setCD268LY(mFin.getCD268LY());
		mFinInfo.setCD268(mFin.getCD268());
		mFinInfo.setCD269LY(mFin.getCD269LY());
		mFinInfo.setCD269(mFin.getCD269());
		mFinInfo.setCD270LY(mFin.getCD270LY());
		mFinInfo.setCD270(mFin.getCD270());
		mFinInfo.setCD300LY(mFin.getCD300LY());
		mFinInfo.setCD300(mFin.getCD300());
		mFinInfo.setCD310LY(mFin.getCD310LY());
		mFinInfo.setCD310(mFin.getCD310());
		mFinInfo.setCD311LY(mFin.getCD311LY());
		mFinInfo.setCD311(mFin.getCD311());
		mFinInfo.setCD312LY(mFin.getCD312LY());
		mFinInfo.setCD312(mFin.getCD312());
		mFinInfo.setCD313LY(mFin.getCD313LY());
		mFinInfo.setCD313(mFin.getCD313());
		mFinInfo.setCD314LY(mFin.getCD314LY());
		mFinInfo.setCD314(mFin.getCD314());
		mFinInfo.setCD315LY(mFin.getCD315LY());
		mFinInfo.setCD315(mFin.getCD315());
		mFinInfo.setCD316LY(mFin.getCD316LY());
		mFinInfo.setCD316(mFin.getCD316());
		mFinInfo.setCD317LY(mFin.getCD317LY());
		mFinInfo.setCD317(mFin.getCD317());
		mFinInfo.setCD318LY(mFin.getCD318LY());
		mFinInfo.setCD318(mFin.getCD318());
		mFinInfo.setCD319LY(mFin.getCD319LY());
		mFinInfo.setCD319(mFin.getCD319());
		mFinInfo.setCD320LY(mFin.getCD320LY());
		mFinInfo.setCD320(mFin.getCD320());
		mFinInfo.setCD321LY(mFin.getCD321LY());
		mFinInfo.setCD321(mFin.getCD321());
		mFinInfo.setCD322LY(mFin.getCD322LY());
		mFinInfo.setCD322(mFin.getCD322());
		mFinInfo.setCD323LY(mFin.getCD323LY());
		mFinInfo.setCD323(mFin.getCD323());
		mFinInfo.setCD324LY(mFin.getCD324LY());
		mFinInfo.setCD324(mFin.getCD324());
		mFinInfo.setCD330LY(mFin.getCD330LY());
		mFinInfo.setCD330(mFin.getCD330());
		mFinInfo.setCD331LY(mFin.getCD331LY());
		mFinInfo.setCD331(mFin.getCD331());
		mFinInfo.setCD332LY(mFin.getCD332LY());
		mFinInfo.setCD332(mFin.getCD332());
		mFinInfo.setCD333LY(mFin.getCD333LY());
		mFinInfo.setCD333(mFin.getCD333());
		mFinInfo.setCD334LY(mFin.getCD334LY());
		mFinInfo.setCD334(mFin.getCD334());
		mFinInfo.setCD335LY(mFin.getCD335LY());
		mFinInfo.setCD335(mFin.getCD335());
		mFinInfo.setCD336LY(mFin.getCD336LY());
		mFinInfo.setCD336(mFin.getCD336());
		mFinInfo.setCD337LY(mFin.getCD337LY());
		mFinInfo.setCD337(mFin.getCD337());
		mFinInfo.setCD338LY(mFin.getCD338LY());
		mFinInfo.setCD338(mFin.getCD338());
		mFinInfo.setCD339LY(mFin.getCD339LY());
		mFinInfo.setCD339(mFin.getCD339());
		mFinInfo.setCD340LY(mFin.getCD340LY());
		mFinInfo.setCD340(mFin.getCD340());
		mFinInfo.setCD341LY(mFin.getCD341LY());
		mFinInfo.setCD341(mFin.getCD341());
		mFinInfo.setCD342LY(mFin.getCD342LY());
		mFinInfo.setCD342(mFin.getCD342());
		mFinInfo.setCD343LY(mFin.getCD343LY());
		mFinInfo.setCD343(mFin.getCD343());
		mFinInfo.setCD400LY(mFin.getCD400LY());
		mFinInfo.setCD400(mFin.getCD400());
		mFinInfo.setCD410LY(mFin.getCD410LY());
		mFinInfo.setCD410(mFin.getCD410());
		mFinInfo.setCD411LY(mFin.getCD411LY());
		mFinInfo.setCD411(mFin.getCD411());
		mFinInfo.setCD411aLY(mFin.getCD411aLY());
		mFinInfo.setCD411a(mFin.getCD411a());
		mFinInfo.setCD411bLY(mFin.getCD411bLY());
		mFinInfo.setCD411b(mFin.getCD411b());
		mFinInfo.setCD412LY(mFin.getCD412LY());
		mFinInfo.setCD412(mFin.getCD412());
		mFinInfo.setCD413LY(mFin.getCD413LY());
		mFinInfo.setCD413(mFin.getCD413());
		mFinInfo.setCD414LY(mFin.getCD414LY());
		mFinInfo.setCD414(mFin.getCD414());
		mFinInfo.setCD415LY(mFin.getCD415LY());
		mFinInfo.setCD415(mFin.getCD415());
		mFinInfo.setCD416LY(mFin.getCD416LY());
		mFinInfo.setCD416(mFin.getCD416());
		mFinInfo.setCD417LY(mFin.getCD417LY());
		mFinInfo.setCD417(mFin.getCD417());
		mFinInfo.setCD418LY(mFin.getCD418LY());
		mFinInfo.setCD418(mFin.getCD418());
		mFinInfo.setCD419LY(mFin.getCD419LY());
		mFinInfo.setCD419(mFin.getCD419());
		mFinInfo.setCD420LY(mFin.getCD420LY());
		mFinInfo.setCD420(mFin.getCD420());
		mFinInfo.setCD421LY(mFin.getCD421LY());
		mFinInfo.setCD421(mFin.getCD421());
		mFinInfo.setCD421aLY(mFin.getCD421aLY());
		mFinInfo.setCD421a(mFin.getCD421a());
		mFinInfo.setCD421bLY(mFin.getCD421bLY());
		mFinInfo.setCD421b(mFin.getCD421b());
		mFinInfo.setCD422LY(mFin.getCD422LY());
		mFinInfo.setCD422(mFin.getCD422());
		mFinInfo.setCD429LY(mFin.getCD429LY());
		mFinInfo.setCD429(mFin.getCD429());
		mFinInfo.setCD430LY(mFin.getCD430LY());
		mFinInfo.setCD430(mFin.getCD430());
		mFinInfo.setCD431LY(mFin.getCD431LY());
		mFinInfo.setCD431(mFin.getCD431());
		mFinInfo.setCD432LY(mFin.getCD432LY());
		mFinInfo.setCD432(mFin.getCD432());
		mFinInfo.setCD440LY(mFin.getCD440LY());
		mFinInfo.setCD440(mFin.getCD440());
		mFinInfo.setKQ01LY(mFin.getKQ01LY());
		mFinInfo.setKQ01(mFin.getKQ01());
		mFinInfo.setKQ02LY(mFin.getKQ02LY());
		mFinInfo.setKQ02(mFin.getKQ02());
		mFinInfo.setKQ10LY(mFin.getKQ10LY());
		mFinInfo.setKQ10(mFin.getKQ10());
		mFinInfo.setKQ11LY(mFin.getKQ11LY());
		mFinInfo.setKQ11(mFin.getKQ11());
		mFinInfo.setKQ20LY(mFin.getKQ20LY());
		mFinInfo.setKQ20(mFin.getKQ20());
		mFinInfo.setKQ21LY(mFin.getKQ21LY());
		mFinInfo.setKQ21(mFin.getKQ21());
		mFinInfo.setKQ22LY(mFin.getKQ22LY());
		mFinInfo.setKQ22(mFin.getKQ22());
		mFinInfo.setKQ23LY(mFin.getKQ23LY());
		mFinInfo.setKQ23(mFin.getKQ23());
		mFinInfo.setKQ24LY(mFin.getKQ24LY());
		mFinInfo.setKQ24(mFin.getKQ24());
		mFinInfo.setKQ25LY(mFin.getKQ25LY());
		mFinInfo.setKQ25(mFin.getKQ25());
		mFinInfo.setKQ26LY(mFin.getKQ26LY());
		mFinInfo.setKQ26(mFin.getKQ26());
		mFinInfo.setKQ30LY(mFin.getKQ30LY());
		mFinInfo.setKQ30(mFin.getKQ30());
		mFinInfo.setKQ31LY(mFin.getKQ31LY());
		mFinInfo.setKQ31(mFin.getKQ31());
		mFinInfo.setKQ32LY(mFin.getKQ32LY());
		mFinInfo.setKQ32(mFin.getKQ32());
		mFinInfo.setKQ40LY(mFin.getKQ40LY());
		mFinInfo.setKQ40(mFin.getKQ40());
		mFinInfo.setKQ50LY(mFin.getKQ50LY());
		mFinInfo.setKQ50(mFin.getKQ50());
		mFinInfo.setKQ51LY(mFin.getKQ51LY());
		mFinInfo.setKQ51(mFin.getKQ51());
		mFinInfo.setKQ52LY(mFin.getKQ52LY());
		mFinInfo.setKQ52(mFin.getKQ52());
		mFinInfo.setKQ60LY(mFin.getKQ60LY());
		mFinInfo.setKQ60(mFin.getKQ60());
		mFinInfo.setKQ61LY(mFin.getKQ61LY());
		mFinInfo.setKQ61(mFin.getKQ61());
		mFinInfo.setKQ62LY(mFin.getKQ62LY());
		mFinInfo.setKQ62(mFin.getKQ62());
		mFinInfo.setKQ70LY(mFin.getKQ70LY());
		mFinInfo.setKQ70(mFin.getKQ70());
		mFinInfo.setKQ71LY(mFin.getKQ71LY());
		mFinInfo.setKQ71(mFin.getKQ71());
		mFinInfo.setLTC_20LY(mFin.getLTC_20LY());
		mFinInfo.setLTC_20(mFin.getLTC_20());

		mFinInfo.setIsRecordReject("1");
		mFinInfo.save();
	}

	private void genListDirectKo() {
		// TODO Auto-generated method stub
		StringBuilder whereClauseFinal = new StringBuilder(
				"TDAB_DIRECT_KO_QL_ID IN (SELECT TDAB_DIRECT_KO_QL_ID FROM TDAB_DIRECT_KO_QL WHERE STATUS_CHECK = 'HD')");
		List<MTDABDirectKOInfo> directKos = new Query(null, MTDABDirectKOInfo.Table_Name, whereClauseFinal.toString(),
				null).list();

		for (MTDABDirectKOInfo mtdabDirectKO : directKos) {
			MTDABDirectKOHS directKoHs = new MTDABDirectKOHS(getCtx(), 0, get_TrxName());
			directKoHs.setTDAB_Customer_Profile_ID(getTDAB_Customer_Profile_ID());
//			if (mtdabDirectKO.getCode().equalsIgnoreCase("KO_1")
//					|| mtdabDirectKO.getCode().equalsIgnoreCase("KO_2")) {
//				directKoHs.setAnswer_CV("1");
//			} else {
//				directKoHs.setAnswer_CV("0");
//			}
			directKoHs.setAnswer_CV("0");
			directKoHs.set_TrxName(get_TrxName());
			directKoHs.setDirect_KO_Info_ID(mtdabDirectKO.getTDAB_Direct_KO_Info_ID());
			directKoHs.setValue(mtdabDirectKO.getCode());

			directKoHs.save(get_TrxName());
		}
	}

	public static List<MTDABDirectKOHS> getListDirectKO(int profileID) {
		StringBuilder whereClauseFinal = new StringBuilder(MTDABDirectKOHS.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MTDABDirectKOHS.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileID }).list();
	}

	public static List<MTDABWarningQuestionHS> getListWarningQuestion(int profileID) {
		StringBuilder whereClauseFinal = new StringBuilder(
				MTDABWarningQuestionHS.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MTDABWarningQuestionHS.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileID }).list();
	}

	public static List<MCustomerProfile> getListMCustomer(String string) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_Value + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { string }).list();
	}

	public static MCustomerProfile findByCustomerProfileId(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

	public static List<MCustomerProfile> findByCustomerId(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_ID + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).list();
	}

	public static MFinancialInfo getByCustomerProfileId(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialInfo.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancialInfo.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

	public static MFinancialNon findByCustomerProId(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialNon.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancialNon.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

	public static MInfoCIC findCIC(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MInfoCIC.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MInfoCIC.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

	// lay ho so bi tu choi
	public static List<MCustomerProfile> findByCustomerProfileIdReject(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_ID + "=?");
		whereClauseFinal.append(" and " + MCustomerProfile.COLUMNNAME_DocStatus + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId, MCustomerProfile.DOCSTATUS_ThamDinhTuChoi })
				.setOrderBy(MCustomerProfile.COLUMNNAME_Date_Create + " DESC").list();
	}
}
