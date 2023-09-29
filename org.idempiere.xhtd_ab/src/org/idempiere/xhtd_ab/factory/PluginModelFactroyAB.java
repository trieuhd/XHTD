package org.idempiere.xhtd_ab.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC;
import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value;
import org.idempiere.xhtd_ab.model.X_TDAB_GROUP_STANDARD;
import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_PC;
import org.idempiere.xhtd_ab.model.X_TDAB_PTC_CIC_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_CONFIG;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_DETAIL;
import org.idempiere.xhtd_ab.model.X_TDAB_SET_OF_STANDARD;
import org.idempiere.xhtd_ab.model.X_TDAB_STANDARD;
import org.idempiere.xhtd_ab.model.implement.MBCTC_DN_B1;
import org.idempiere.xhtd_ab.model.implement.MBCTC_DN_B2;
import org.idempiere.xhtd_ab.model.implement.MCICHistory;
import org.idempiere.xhtd_ab.model.implement.MCustomer;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;
import org.idempiere.xhtd_ab.model.implement.MFinancial;
import org.idempiere.xhtd_ab.model.implement.MFinancialHistory;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfo;
import org.idempiere.xhtd_ab.model.implement.MFinancialNon;
import org.idempiere.xhtd_ab.model.implement.MImportUser;
import org.idempiere.xhtd_ab.model.implement.MInfoCIC;
import org.idempiere.xhtd_ab.model.implement.MNonFinancialHistory;
import org.idempiere.xhtd_ab.model.implement.MOrgDetail;
import org.idempiere.xhtd_ab.model.implement.MOrgXHTD;
import org.idempiere.xhtd_ab.model.implement.MReadFile;
import org.idempiere.xhtd_ab.model.implement.MSuggestException;
import org.idempiere.xhtd_ab.model.implement.MSuggestExceptionHistory;
import org.idempiere.xhtd_ab.model.implement.MTDABBCTC;
import org.idempiere.xhtd_ab.model.implement.MTDABBCTCTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABBusinessAreas;
import org.idempiere.xhtd_ab.model.implement.MTDABBusinessAreasTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABConfigValue;
import org.idempiere.xhtd_ab.model.implement.MTDABConfigValueTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKO;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOHS;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOQL;
import org.idempiere.xhtd_ab.model.implement.MTDABEarlyWarningQuestion;
import org.idempiere.xhtd_ab.model.implement.MTDABFileUpload;
import org.idempiere.xhtd_ab.model.implement.MTDABKOFactorTarget;
import org.idempiere.xhtd_ab.model.implement.MTDABListBusiness;
import org.idempiere.xhtd_ab.model.implement.MTDABLogistic;
import org.idempiere.xhtd_ab.model.implement.MTDABLogisticInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABMedianMean;
import org.idempiere.xhtd_ab.model.implement.MTDABMinMax;
import org.idempiere.xhtd_ab.model.implement.MTDABNormalizedParamInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABNormalizedParameters;
import org.idempiere.xhtd_ab.model.implement.MTDABPC;
import org.idempiere.xhtd_ab.model.implement.MTDABPCTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABPTCCIC;
import org.idempiere.xhtd_ab.model.implement.MTDABPTCCICInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABPointRate;
import org.idempiere.xhtd_ab.model.implement.MTDABPointRateInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABRating;
import org.idempiere.xhtd_ab.model.implement.MTDABRatingInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABRejectInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABWarning;
import org.idempiere.xhtd_ab.model.implement.MTDABWarningQuestionHS;
import org.idempiere.xhtd_ab.model.implement.MTDABWarningQuestionInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABWarningQuestionQL;
import org.idempiere.xhtd_ab.model.implement.MTDAB_Org_Access;
import org.idempiere.xhtd_ab.model.implement.MTDValueUtilsDN;
import org.idempiere.xhtd_ab.model.implement.MUserImport;
import org.idempiere.xhtd_ab.model.implement.MUserImportAll;
import org.idempiere.xhtd_ab.model.implement.MWarningQuestionHis;
import org.idempiere.xhtd_ab.model.implement.MXHTD;

public class PluginModelFactroyAB implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		if (tableName.equals(MCustomer.Table_Name)) {
			return MCustomer.class;
		}
		if (tableName.equals(X_TDAB_SET_OF_STANDARD.Table_Name)) {
			return X_TDAB_SET_OF_STANDARD.class;
		}
		if (tableName.equals(X_TDAB_GROUP_STANDARD.Table_Name)) {
			return X_TDAB_GROUP_STANDARD.class;
		}
		if (tableName.equals(X_TDAB_STANDARD.Table_Name)) {
			return X_TDAB_STANDARD.class;
		}
		if (tableName.equals(X_TDAB_SCORE_CONFIG.Table_Name)) {
			return X_TDAB_SCORE_CONFIG.class;
		}

		if (tableName.equals(MBCTC_DN_B1.Table_Name)) {
			return MBCTC_DN_B1.class;
		}
		if (tableName.equals(MBCTC_DN_B2.Table_Name)) {
			return MBCTC_DN_B2.class;
		}
		if (tableName.equals(MCustomerProfile.Table_Name)) {
			return MCustomerProfile.class;
		}
		if (tableName.equals(MFinancial.Table_Name)) {
			return MFinancial.class;
		}
		if (tableName.equals(MFinancialInfo.Table_Name)) {
			return MFinancialInfo.class;
		}
		if (tableName.equals(MFinancialNon.Table_Name)) {
			return MFinancialNon.class;
		}
		if (tableName.equals(MInfoCIC.Table_Name)) {
			return MInfoCIC.class;
		}
		if (tableName.equals(MTDABBusinessAreas.Table_Name)) {
			return MTDABBusinessAreas.class;
		}
		if (tableName.equals(MTDValueUtilsDN.Table_Name)) {
			return MTDValueUtilsDN.class;
		}
		if (tableName.equals(MCustomerScore.Table_Name)) {
			return MCustomerScore.class;
		}
		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return MTDABEarlyWarningQuestion.class;
		}
		if (tableName.equals(MTDABRejectInfo.Table_Name)) {
			return MTDABRejectInfo.class;
		}
		if (tableName.equals(X_TDAB_BCTC.Table_Name)) {
			return X_TDAB_BCTC.class;
		}
		if (tableName.equals(X_TDAB_Config_Value.Table_Name)) {
			return X_TDAB_Config_Value.class;
		}
		if (tableName.equals(X_TDAB_PC.Table_Name)) {
			return X_TDAB_PC.class;
		}
		if (tableName.equals(MTDABListBusiness.Table_Name)) {
			return MTDABListBusiness.class;
		}
		if (tableName.equals(MTDABDirectKOHS.Table_Name)) {
			return MTDABDirectKOHS.class;
		}
		if (tableName.equals(MTDABDirectKO.Table_Name)) {
			return MTDABDirectKO.class;
		}
		if (tableName.equals(MTDABWarning.Table_Name)) {
			return MTDABWarning.class;
		}
		if (tableName.equals(MTDABKOFactorTarget.Table_Name)) {
			return MTDABKOFactorTarget.class;
		}
		if (tableName.equals(MTDABMinMax.Table_Name)) {
			return MTDABMinMax.class;
		}
		if (tableName.equals(MTDABMedianMean.Table_Name)) {
			return MTDABMedianMean.class;
		}

		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return MTDABEarlyWarningQuestion.class;
		}
		if (tableName.equals(MTDABWarningQuestionHS.Table_Name)) {
			return MTDABWarningQuestionHS.class;
		}
		if (tableName.equals(X_TDAB_SCORE.Table_Name)) {
			return X_TDAB_SCORE.class;
		}
		if (tableName.equals(X_TDAB_SCORE_DETAIL.Table_Name)) {
			return X_TDAB_SCORE_DETAIL.class;
		}
		if (tableName.equals(MFinancialHistory.Table_Name)) {
			return MFinancialHistory.class;
		}
		if (tableName.equals(MNonFinancialHistory.Table_Name)) {
			return MNonFinancialHistory.class;
		}
		if (tableName.equals(MCICHistory.Table_Name)) {
			return MCICHistory.class;
		}
		if (tableName.equals(X_TDAB_PTC_CIC_Info.Table_Name)) {
			return X_TDAB_PTC_CIC_Info.class;
		}
		if (tableName.equals(X_TDAB_Min_Max_Info.Table_Name)) {
			return X_TDAB_Min_Max_Info.class;
		}
		if (tableName.equals(X_TDAB_Median_Mean_Info.Table_Name)) {
			return X_TDAB_Median_Mean_Info.class;
		}

		if (tableName.equals(MTDABLogistic.Table_Name)) {
			return MTDABLogistic.class;
		}
		if (tableName.equals(MTDABLogisticInfo.Table_Name)) {
			return MTDABLogisticInfo.class;
		}

		if (tableName.equals(MTDABPTCCIC.Table_Name)) {
			return MTDABPTCCIC.class;
		}
		if (tableName.equals(MTDABPTCCICInfo.Table_Name)) {
			return MTDABPTCCICInfo.class;
		}

		if (tableName.equals(MTDABNormalizedParameters.Table_Name)) {
			return MTDABNormalizedParameters.class;
		}
		if (tableName.equals(MTDABNormalizedParamInfo.Table_Name)) {
			return MTDABNormalizedParamInfo.class;
		}

		if (tableName.equals(MTDABRating.Table_Name)) {
			return MTDABRating.class;
		}
		if (tableName.equals(MTDABRatingInfo.Table_Name)) {
			return MTDABRatingInfo.class;
		}
		if (tableName.equals(MTDABBCTCTQ.Table_Name)) {
			return MTDABBCTCTQ.class;
		}
		if (tableName.equals(MTDABBCTC.Table_Name)) {
			return MTDABBCTC.class;
		}
		if (tableName.equals(MTDABConfigValueTQ.Table_Name)) {
			return MTDABConfigValueTQ.class;
		}
		if (tableName.equals(MTDABConfigValue.Table_Name)) {
			return MTDABConfigValue.class;
		}
		if (tableName.equals(MTDABPCTQ.Table_Name)) {
			return MTDABPCTQ.class;
		}
		if (tableName.equals(MTDABPC.Table_Name)) {
			return MTDABPC.class;
		}

		if (tableName.equals(MTDABDirectKOQL.Table_Name)) {
			return MTDABDirectKOQL.class;
		}
		if (tableName.equals(MTDABDirectKOInfo.Table_Name)) {
			return MTDABDirectKOInfo.class;
		}
		if (tableName.equals(MTDABWarningQuestionInfo.Table_Name)) {
			return MTDABWarningQuestionInfo.class;
		}
		if (tableName.equals(MTDABWarningQuestionQL.Table_Name)) {
			return MTDABWarningQuestionQL.class;
		}
		if (tableName.equals(MTDABBusinessAreasTQ.Table_Name)) {
			return MTDABBusinessAreasTQ.class;
		}
		if (tableName.equals(MSuggestException.Table_Name)) {
			return MSuggestException.class;
		}
		if (tableName.equals(MSuggestExceptionHistory.Table_Name)) {
			return MSuggestExceptionHistory.class;
		}

		if (tableName.equals(MOrgXHTD.Table_Name)) {
			return MOrgXHTD.class;
		}

		if (tableName.equals(MOrgDetail.Table_Name)) {
			return MOrgDetail.class;
		}

		if (tableName.equals(MTDAB_Org_Access.Table_Name)) {
			return MTDAB_Org_Access.class;
		}

		if (tableName.equals(MWarningQuestionHis.Table_Name)) {
			return MWarningQuestionHis.class;
		}
		if (tableName.equals(MXHTD.Table_Name)) {
			return MXHTD.class;
		}
		
		if (tableName.equals(MUserImport.Table_Name)) {
			return MUserImport.class;
		}

		if (tableName.equals(MImportUser.Table_Name)) {
			return MImportUser.class;
		}
		if (tableName.equals(MUserImportAll.Table_Name)) {
			return MUserImportAll.class;
		}
		if (tableName.equals(MReadFile.Table_Name)) {
			return MUserImportAll.class;
		}
		if (tableName.equals(MTDABFileUpload.Table_Name)) {
			return MTDABFileUpload.class;
		}
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		if (tableName.equals(MCustomer.Table_Name)) {
			return new MCustomer(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_SET_OF_STANDARD.Table_Name)) {
			return new X_TDAB_SET_OF_STANDARD(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_GROUP_STANDARD.Table_Name)) {
			return new X_TDAB_GROUP_STANDARD(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_STANDARD.Table_Name)) {
			return new X_TDAB_STANDARD(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE_CONFIG.Table_Name)) {
			return new X_TDAB_SCORE_CONFIG(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MBCTC_DN_B1.Table_Name)) {
			return new MBCTC_DN_B1(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MBCTC_DN_B2.Table_Name)) {
			return new MBCTC_DN_B2(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MFinancial.Table_Name)) {
			return new MFinancial(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MFinancialInfo.Table_Name)) {
			return new MFinancialInfo(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MCustomerProfile.Table_Name)) {
			return new MCustomerProfile(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MFinancialNon.Table_Name)) {
			return new MFinancialNon(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MInfoCIC.Table_Name)) {
			return new MInfoCIC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABBusinessAreas.Table_Name)) {
			return new MTDABBusinessAreas(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDValueUtilsDN.Table_Name)) {
			return new MTDValueUtilsDN(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MCustomerScore.Table_Name)) {
			return new MCustomerScore(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return new MTDABEarlyWarningQuestion(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABRejectInfo.Table_Name)) {
			return new MTDABRejectInfo(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(X_TDAB_BCTC.Table_Name)) {
			return new X_TDAB_BCTC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_Config_Value.Table_Name)) {
			return new X_TDAB_Config_Value(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_PC.Table_Name)) {
			return new X_TDAB_PC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABListBusiness.Table_Name)) {
			return new MTDABListBusiness(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABDirectKOHS.Table_Name)) {
			return new MTDABDirectKOHS(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABDirectKO.Table_Name)) {
			return new MTDABDirectKO(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABWarning.Table_Name)) {
			return new MTDABWarning(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABKOFactorTarget.Table_Name)) {
			return new MTDABKOFactorTarget(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABMinMax.Table_Name)) {
			return new MTDABMinMax(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABMedianMean.Table_Name)) {
			return new MTDABMedianMean(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return new MTDABEarlyWarningQuestion(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABWarningQuestionHS.Table_Name)) {
			return new MTDABWarningQuestionHS(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE.Table_Name)) {
			return new X_TDAB_SCORE(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE_DETAIL.Table_Name)) {
			return new X_TDAB_SCORE_DETAIL(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MFinancialHistory.Table_Name)) {
			return new MFinancialHistory(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MNonFinancialHistory.Table_Name)) {
			return new MCICHistory(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MCICHistory.Table_Name)) {
			return new MCICHistory(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_PTC_CIC_Info.Table_Name)) {
			return new X_TDAB_PTC_CIC_Info(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(X_TDAB_Min_Max_Info.Table_Name)) {
			return new X_TDAB_Min_Max_Info(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(X_TDAB_Median_Mean_Info.Table_Name)) {
			return new X_TDAB_Median_Mean_Info(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDABLogistic.Table_Name)) {
			return new MTDABLogistic(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABLogisticInfo.Table_Name)) {
			return new MTDABLogisticInfo(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDABPTCCIC.Table_Name)) {
			return new MTDABPTCCIC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABPTCCICInfo.Table_Name)) {
			return new MTDABPTCCICInfo(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDABNormalizedParameters.Table_Name)) {
			return new MTDABNormalizedParameters(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABNormalizedParamInfo.Table_Name)) {
			return new MTDABNormalizedParamInfo(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDABRating.Table_Name)) {
			return new MTDABRating(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABRatingInfo.Table_Name)) {
			return new MTDABRatingInfo(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABPointRate.Table_Name)) {
			return new MTDABPointRate(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABPointRateInfo.Table_Name)) {
			return new MTDABPointRateInfo(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABBCTC.Table_Name)) {
			return new MTDABBCTC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABBCTCTQ.Table_Name)) {
			return new MTDABBCTCTQ(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABConfigValueTQ.Table_Name)) {
			return new MTDABConfigValueTQ(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABConfigValue.Table_Name)) {
			return new MTDABConfigValue(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABPC.Table_Name)) {
			return new MTDABPC(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABPCTQ.Table_Name)) {
			return new MTDABPCTQ(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDABWarningQuestionQL.Table_Name)) {
			return new MTDABWarningQuestionQL(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABWarningQuestionInfo.Table_Name)) {
			return new MTDABWarningQuestionInfo(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABDirectKOInfo.Table_Name)) {
			return new MTDABDirectKOInfo(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABDirectKOQL.Table_Name)) {
			return new MTDABDirectKOQL(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABBusinessAreasTQ.Table_Name)) {
			return new MTDABBusinessAreasTQ(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MSuggestException.Table_Name)) {
			return new MSuggestException(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MSuggestExceptionHistory.Table_Name)) {
			return new MSuggestExceptionHistory(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MOrgXHTD.Table_Name)) {
			return new MOrgXHTD(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MWarningQuestionHis.Table_Name)) {
			return new MWarningQuestionHis(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MOrgDetail.Table_Name)) {
			return new MOrgDetail(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MTDAB_Org_Access.Table_Name)) {
			return new MTDAB_Org_Access(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MXHTD.Table_Name)) {
			return new MXHTD(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MUserImport.Table_Name)) {
			return new MUserImport(Env.getCtx(), Record_ID, trxName);
		}

		if (tableName.equals(MImportUser.Table_Name)) {
			return new MImportUser(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MUserImportAll.Table_Name)) {
			return new MUserImportAll(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MReadFile.Table_Name)) {
			return new MReadFile(Env.getCtx(), Record_ID, trxName);
		}
		if (tableName.equals(MTDABFileUpload.Table_Name)) {
			return new MTDABFileUpload(Env.getCtx(), Record_ID, trxName);
		}

		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		if (tableName.equals(MCustomer.Table_Name)) {
			return new MCustomer(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_SET_OF_STANDARD.Table_Name)) {
			return new X_TDAB_SET_OF_STANDARD(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_GROUP_STANDARD.Table_Name)) {
			return new X_TDAB_GROUP_STANDARD(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_STANDARD.Table_Name)) {
			return new X_TDAB_STANDARD(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE_CONFIG.Table_Name)) {
			return new X_TDAB_SCORE_CONFIG(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MBCTC_DN_B1.Table_Name)) {
			return new MBCTC_DN_B1(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MBCTC_DN_B2.Table_Name)) {
			return new MBCTC_DN_B2(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MFinancial.Table_Name)) {
			return new MFinancial(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MFinancialInfo.Table_Name)) {
			return new MFinancialInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MCustomerProfile.Table_Name)) {
			return new MCustomerProfile(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MFinancialNon.Table_Name)) {
			return new MFinancialNon(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MInfoCIC.Table_Name)) {
			return new MInfoCIC(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABBusinessAreas.Table_Name)) {
			return new MTDABBusinessAreas(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDValueUtilsDN.Table_Name)) {
			return new MTDValueUtilsDN(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MCustomerScore.Table_Name)) {
			return new MCustomerScore(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return new MTDABEarlyWarningQuestion(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABRejectInfo.Table_Name)) {
			return new MTDABRejectInfo(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(X_TDAB_BCTC.Table_Name)) {
			return new X_TDAB_BCTC(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_Config_Value.Table_Name)) {
			return new X_TDAB_Config_Value(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_PC.Table_Name)) {
			return new X_TDAB_PC(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABListBusiness.Table_Name)) {
			return new MTDABListBusiness(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABDirectKOHS.Table_Name)) {
			return new MTDABDirectKOHS(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABDirectKO.Table_Name)) {
			return new MTDABDirectKO(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABWarning.Table_Name)) {
			return new MTDABWarning(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABKOFactorTarget.Table_Name)) {
			return new MTDABKOFactorTarget(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABMinMax.Table_Name)) {
			return new MTDABMinMax(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABMedianMean.Table_Name)) {
			return new MTDABMedianMean(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABEarlyWarningQuestion.Table_Name)) {
			return new MTDABEarlyWarningQuestion(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABWarningQuestionHS.Table_Name)) {
			return new MTDABWarningQuestionHS(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE.Table_Name)) {
			return new X_TDAB_SCORE(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_SCORE_DETAIL.Table_Name)) {
			return new X_TDAB_SCORE_DETAIL(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MFinancialHistory.Table_Name)) {
			return new MFinancialHistory(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MNonFinancialHistory.Table_Name)) {
			return new MNonFinancialHistory(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MCICHistory.Table_Name)) {
			return new MCICHistory(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_PTC_CIC_Info.Table_Name)) {
			return new X_TDAB_PTC_CIC_Info(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(X_TDAB_Min_Max_Info.Table_Name)) {
			return new X_TDAB_Min_Max_Info(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(X_TDAB_Median_Mean_Info.Table_Name)) {
			return new X_TDAB_Median_Mean_Info(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABLogistic.Table_Name)) {
			return new MTDABLogistic(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABLogisticInfo.Table_Name)) {
			return new MTDABLogisticInfo(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABPTCCIC.Table_Name)) {
			return new MTDABPTCCIC(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABPTCCICInfo.Table_Name)) {
			return new MTDABPTCCICInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABNormalizedParameters.Table_Name)) {
			return new MTDABNormalizedParameters(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABNormalizedParamInfo.Table_Name)) {
			return new MTDABNormalizedParamInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABRating.Table_Name)) {
			return new MTDABRating(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABRatingInfo.Table_Name)) {
			return new MTDABRatingInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABPointRate.Table_Name)) {
			return new MTDABPointRate(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABPointRateInfo.Table_Name)) {
			return new MTDABPointRateInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABBCTC.Table_Name)) {
			return new MTDABBCTC(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABBCTCTQ.Table_Name)) {
			return new MTDABBCTCTQ(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABConfigValue.Table_Name)) {
			return new MTDABConfigValue(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABConfigValueTQ.Table_Name)) {
			return new MTDABConfigValueTQ(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABPCTQ.Table_Name)) {
			return new MTDABPCTQ(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABPC.Table_Name)) {
			return new MTDABPC(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABDirectKOQL.Table_Name)) {
			return new MTDABDirectKOQL(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABDirectKOInfo.Table_Name)) {
			return new MTDABDirectKOInfo(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDABWarningQuestionInfo.Table_Name)) {
			return new MTDABWarningQuestionInfo(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABWarningQuestionQL.Table_Name)) {
			return new MTDABWarningQuestionQL(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABBusinessAreasTQ.Table_Name)) {
			return new MTDABBusinessAreasTQ(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MSuggestExceptionHistory.Table_Name)) {
			return new MSuggestExceptionHistory(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MSuggestException.Table_Name)) {
			return new MSuggestException(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MOrgXHTD.Table_Name)) {
			return new MOrgXHTD(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MOrgDetail.Table_Name)) {
			return new MOrgDetail(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MWarningQuestionHis.Table_Name)) {
			return new MWarningQuestionHis(Env.getCtx(), rs, trxName);
		}

		if (tableName.equals(MTDAB_Org_Access.Table_Name)) {
			return new MTDAB_Org_Access(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MXHTD.Table_Name)) {
			return new MXHTD(Env.getCtx(), rs, trxName);
		}
		
		if (tableName.equals(MImportUser.Table_Name)) {
			return new MImportUser(Env.getCtx(), rs, trxName);
		}
		
		if (tableName.equals(MUserImport.Table_Name)) {
			return new MUserImport(Env.getCtx(), rs, trxName);
		}
		
		if (tableName.equals(MUserImportAll.Table_Name)) {
			return new MUserImportAll(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MReadFile.Table_Name)) {
			return new MReadFile(Env.getCtx(), rs, trxName);
		}
		if (tableName.equals(MTDABFileUpload.Table_Name)) {
			return new MTDABFileUpload(Env.getCtx(), rs, trxName);
		}

		return null;
	}

}
