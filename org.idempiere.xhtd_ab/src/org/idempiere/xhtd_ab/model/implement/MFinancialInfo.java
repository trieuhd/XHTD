package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_History;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Info;
import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
import org.idempiere.xhtd_ab.utils.FileUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;
import org.idempiere.xhtd_ab.utils.ValidateUtil;

public class MFinancialInfo extends X_TDAB_Financial_Info {

	final static Logger logger = Logger.getLogger(MFinancialInfo.class);
	private String b1Path = null;
	private String destFolderPath = null;
	private String b1Name = null;
	BigDecimal TT_0 = new BigDecimal(0);
	MFinancialInfo mbctc = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MFinancialInfo(Properties ctx, int TDAB_Financial_Info_ID, String trxName) {
		super(ctx, TDAB_Financial_Info_ID, trxName);

	}

	public MFinancialInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	private List<MFinancialInfo> getFinancialByCustomerProfile(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialInfo.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancialInfo.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).list();
	}

	private List<MFinancialInfo> getFinancialByCustomerId(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialInfo.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancialInfo.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).list();
	}

	private List<MFinancialInfoHistory> getFinancialHistories(Integer mFinancial) {
		StringBuilder whereClauseFinal = new StringBuilder(
				MFinancialInfoHistory.COLUMNNAME_TDAB_Financial_Info_ID + "=?");
		return new Query(null, MFinancialInfoHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { mFinancial }).list();
	}

	@Override
	protected boolean beforeDelete() {
		MFinancialInfo mInfoFinanceDN = new MFinancialInfo(getCtx(), getTDAB_Financial_Info_ID(), get_TrxName());
		List<MFinancialInfoHistory> listHis = getFinancialHistories(mInfoFinanceDN.getTDAB_Financial_Info_ID());

		for (MFinancialInfoHistory i : listHis) {
			i.delete(true);
		}

		mInfoFinanceDN.delete(true);
		return super.beforeDelete();
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		System.out.println("Start save");
		if (!"1".equals(getIsRecordReject())) {

			List<MFinancialInfo> mFinancial = getFinancialByCustomerProfile(getTDAB_Customer_Profile_ID());

			if (newRecord) {
				if (mFinancial.size() != 0) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_FINANCIAL));
				}
			}

			if (isCheck_Hand_Input() == true) {
				validateCellNull();
				validateCell();
				setValueCell();
			} else {
				destFolderPath = FileUtil.getPath(get_TrxName());
				b1Path = getBCTC_B1_File();
				b1Name = FileUtil.splitFileName(FileUtil.fileName(b1Path));

				if (!FileUtil.checkFileName(b1Name)) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_FINANCIAL_TYPE));
				}

				try {
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
					Date date = new Date();
					String currentDate = dateFormat.format(date);
					FileUtil.copyFile(Paths.get(getBCTC_B1_File()), Paths.get(destFolderPath,
							currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name));
					Files.delete(Paths.get(getBCTC_B1_File()));
					File file1 = new File(
							Paths.get(destFolderPath, currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name)
									.toString());
					logger.info("Path file: " + file1.getAbsolutePath());
					setBCTC_B1_File(destFolderPath + currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name);
					mbctc = insertBCTCInfo(file1, getTDAB_Customer_Profile_ID(), newRecord);

				} catch (IOException e) {
					logger.error("Error before save: " + e.getLocalizedMessage());
					e.printStackTrace();
				}
			}
		}
		else if ("1".equals(getIsRecordReject()) && !newRecord) {

			List<MFinancialInfo> mFinancial = getFinancialByCustomerProfile(getTDAB_Customer_Profile_ID());

			if (newRecord) {
				if (mFinancial.size() != 0) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_FINANCIAL));
				}
			}

			if (isCheck_Hand_Input() == true) {
				validateCellNull();
				validateCell();
				setValueCell();
			} else {
				destFolderPath = FileUtil.getPath(get_TrxName());
				b1Path = getBCTC_B1_File();
				b1Name = FileUtil.splitFileName(b1Path);

				if (!FileUtil.checkFileName(b1Name)) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_FINANCIAL_TYPE));
				}

				try {
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
					Date date = new Date();
					String currentDate = dateFormat.format(date);
					FileUtil.copyFile(Paths.get(getBCTC_B1_File()), Paths.get(destFolderPath,
							currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name));
					Files.delete(Paths.get(getBCTC_B1_File()));
					File file1 = new File(
							Paths.get(destFolderPath, currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name)
									.toString());
					logger.info("Path file: " + file1.getAbsolutePath());
					setBCTC_B1_File(destFolderPath + currentDate + "_" + getTDAB_Customer_Profile_ID() + "_" + b1Name);
					mbctc = insertBCTCInfo(file1, getTDAB_Customer_Profile_ID(), newRecord);

				} catch (IOException e) {
					logger.error("Error before save: " + e.getLocalizedMessage());
					e.printStackTrace();
				}
			}
		}
		return super.beforeSave(newRecord);
	}

//	private boolean isCheckDuplicate(boolean newRecord, int profileId) {
//		if (!newRecord)
//			return false;
//		StringBuilder sql = new StringBuilder("SELECT COUNT(1) FROM ").append(MFinancial.Table_Name);
//		sql.append(" WHERE ").append(MFinancial.COLUMNNAME_TDAB_Customer_Score_ID);
//		sql.append(" = ? ");
//		int count = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] { profileId });
//		if (count > 0)
//			return true;
//		return false;
//	}

	public MFinancialInfo(MCustomerScore mCustomerScore) {
		this(mCustomerScore.getCtx(), 0, mCustomerScore.get_TrxName());
		if (mCustomerScore.get_ID() == 0)
			throw new IllegalArgumentException("Header not saved");
		setTDAB_Customer_Score_ID(mCustomerScore.getTDAB_Customer_Score_ID());
	}

	private List<MFinancialInfoHistory> getHistoryByIdAndUser(Integer id, Integer financial_id) {
		logger.info("Get History by User Id: " + id + " and Financial Id: " + financial_id);
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialInfoHistory.COLUMNNAME_CreatedBy + "=? AND "
				+ MFinancialInfoHistory.COLUMNNAME_TDAB_Financial_ID + "=?");
		return new Query(null, MFinancialInfoHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id, financial_id }).list();
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (!"1".equals(getIsRecordReject())) {
			MFinancialInfoHistory mFinancialHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
					MCustomerProfile.COLUMNNAME_StatusFinance);

			List<MFinancialInfoHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
					getTDAB_Financial_Info_ID());
			if (listFinanHis.size() == 0) {
				mFinancialHistory = new MFinancialInfoHistory(getCtx(), 0, get_TrxName());
				mFinancialHistory.setTDAB_Financial_Info_ID(getTDAB_Financial_Info_ID());
			} else {
				mFinancialHistory = listFinanHis.get(0);
			}
			mFinancialHistory.setCheck_Hand_Input(isCheck_Hand_Input());
			mFinancialHistory.setCheck_Upload_Excel(isCheck_Upload_Excel());
			mFinancialHistory.setYear_Report(getYear_Report());
			mFinancialHistory.setYear_Report_Ly(getYear_Report_Ly());
			mFinancialHistory.setCD100(getCD100());
			mFinancialHistory.setCD100LY(getCD100LY());
			mFinancialHistory.setCD110(getCD110());
			mFinancialHistory.setCD110LY(getCD110LY());
			mFinancialHistory.setCD111(getCD111());
			mFinancialHistory.setCD111LY(getCD111LY());
			mFinancialHistory.setCD112(getCD112());
			mFinancialHistory.setCD112LY(getCD112LY());
			mFinancialHistory.setCD120(getCD120());
			mFinancialHistory.setCD120LY(getCD120LY());
			mFinancialHistory.setCD121(getCD121());
			mFinancialHistory.setCD121LY(getCD121LY());
			mFinancialHistory.setCD122(getCD122());
			mFinancialHistory.setCD122LY(getCD122LY());
			mFinancialHistory.setCD123(getCD123());
			mFinancialHistory.setCD123LY(getCD123LY());
			mFinancialHistory.setCD124(getCD124());
			mFinancialHistory.setCD124LY(getCD124LY());
			mFinancialHistory.setCD130(getCD130());
			mFinancialHistory.setCD130LY(getCD130LY());
			mFinancialHistory.setCD131(getCD131());
			mFinancialHistory.setCD131LY(getCD131LY());
			mFinancialHistory.setCD132(getCD132());
			mFinancialHistory.setCD132LY(getCD132LY());
			mFinancialHistory.setCD133(getCD133());
			mFinancialHistory.setCD133LY(getCD133LY());
			mFinancialHistory.setCD134(getCD134());
			mFinancialHistory.setCD134LY(getCD134LY());
			mFinancialHistory.setCD135(getCD135());
			mFinancialHistory.setCD135LY(getCD135LY());
			mFinancialHistory.setCD136(getCD136());
			mFinancialHistory.setCD136LY(getCD136LY());
			mFinancialHistory.setCD137(getCD137());
			mFinancialHistory.setCD137LY(getCD137LY());
			mFinancialHistory.setCD139(getCD139());
			mFinancialHistory.setCD139LY(getCD139LY());
			mFinancialHistory.setCD140(getCD140());
			mFinancialHistory.setCD140LY(getCD140LY());
			mFinancialHistory.setCD141(getCD141());
			mFinancialHistory.setCD141LY(getCD141LY());
			mFinancialHistory.setCD149(getCD149());
			mFinancialHistory.setCD149LY(getCD149LY());
			mFinancialHistory.setCD150(getCD150());
			mFinancialHistory.setCD150LY(getCD150LY());
			mFinancialHistory.setCD151(getCD151());
			mFinancialHistory.setCD151LY(getCD151LY());
			mFinancialHistory.setCD152(getCD152());
			mFinancialHistory.setCD152LY(getCD152LY());
			mFinancialHistory.setCD153(getCD153());
			mFinancialHistory.setCD153LY(getCD153LY());
			mFinancialHistory.setCD154(getCD154());
			mFinancialHistory.setCD154LY(getCD154LY());
			mFinancialHistory.setCD155(getCD155());
			mFinancialHistory.setCD155LY(getCD155LY());
			mFinancialHistory.setCD200(getCD200());
			mFinancialHistory.setCD200LY(getCD200LY());
			mFinancialHistory.setCD210(getCD210());
			mFinancialHistory.setCD210LY(getCD210LY());
			mFinancialHistory.setCD211(getCD211());
			mFinancialHistory.setCD211LY(getCD211LY());
			mFinancialHistory.setCD212(getCD212());
			mFinancialHistory.setCD212LY(getCD212LY());
			mFinancialHistory.setCD213(getCD213());
			mFinancialHistory.setCD213LY(getCD213LY());
			mFinancialHistory.setCD214(getCD214());
			mFinancialHistory.setCD214LY(getCD214LY());
			mFinancialHistory.setCD215(getCD215());
			mFinancialHistory.setCD215LY(getCD215LY());
			mFinancialHistory.setCD216(getCD216());
			mFinancialHistory.setCD216LY(getCD216LY());
			mFinancialHistory.setCD219(getCD219());
			mFinancialHistory.setCD219LY(getCD219LY());
			mFinancialHistory.setCD220(getCD220());
			mFinancialHistory.setCD220LY(getCD220LY());
			mFinancialHistory.setCD221(getCD221());
			mFinancialHistory.setCD221LY(getCD221LY());
			mFinancialHistory.setCD222(getCD222());
			mFinancialHistory.setCD222LY(getCD222LY());
			mFinancialHistory.setCD223(getCD223());
			mFinancialHistory.setCD223LY(getCD223LY());
			mFinancialHistory.setCD224(getCD224());
			mFinancialHistory.setCD224LY(getCD224LY());
			mFinancialHistory.setCD225(getCD225());
			mFinancialHistory.setCD225LY(getCD225LY());
			mFinancialHistory.setCD226(getCD226());
			mFinancialHistory.setCD226LY(getCD226LY());
			mFinancialHistory.setCD227(getCD227());
			mFinancialHistory.setCD227LY(getCD227LY());
			mFinancialHistory.setCD228(getCD228());
			mFinancialHistory.setCD228LY(getCD228LY());
			mFinancialHistory.setCD229(getCD229());
			mFinancialHistory.setCD229LY(getCD229LY());
			mFinancialHistory.setCD230(getCD230());
			mFinancialHistory.setCD230LY(getCD230LY());
			mFinancialHistory.setCD231(getCD231());
			mFinancialHistory.setCD231LY(getCD231LY());
			mFinancialHistory.setCD232(getCD232());
			mFinancialHistory.setCD232LY(getCD232LY());
			mFinancialHistory.setCD240(getCD240());
			mFinancialHistory.setCD240LY(getCD240LY());
			mFinancialHistory.setCD241(getCD241());
			mFinancialHistory.setCD241LY(getCD241LY());
			mFinancialHistory.setCD242(getCD242());
			mFinancialHistory.setCD242LY(getCD242LY());
			mFinancialHistory.setCD250(getCD250());
			mFinancialHistory.setCD250LY(getCD250LY());
			mFinancialHistory.setCD251(getCD251());
			mFinancialHistory.setCD251LY(getCD251LY());
			mFinancialHistory.setCD252(getCD252());
			mFinancialHistory.setCD252LY(getCD252LY());
			mFinancialHistory.setCD253(getCD253());
			mFinancialHistory.setCD253LY(getCD253LY());
			mFinancialHistory.setCD254(getCD254());
			mFinancialHistory.setCD254LY(getCD254LY());
			mFinancialHistory.setCD255(getCD255());
			mFinancialHistory.setCD255LY(getCD255LY());
			mFinancialHistory.setCD260(getCD260());
			mFinancialHistory.setCD260LY(getCD260LY());
			mFinancialHistory.setCD261(getCD261());
			mFinancialHistory.setCD261LY(getCD261LY());
			mFinancialHistory.setCD262(getCD262());
			mFinancialHistory.setCD262LY(getCD262LY());
			mFinancialHistory.setCD263(getCD263());
			mFinancialHistory.setCD263LY(getCD263LY());
			mFinancialHistory.setCD268(getCD268());
			mFinancialHistory.setCD268LY(getCD268LY());
			mFinancialHistory.setCD269(getCD269());
			mFinancialHistory.setCD269LY(getCD269LY());
			mFinancialHistory.setCD270(getCD270());
			mFinancialHistory.setCD270LY(getCD270LY());
			mFinancialHistory.setCD300(getCD300());
			mFinancialHistory.setCD300LY(getCD300LY());
			mFinancialHistory.setCD310(getCD310());
			mFinancialHistory.setCD310LY(getCD310LY());
			mFinancialHistory.setCD311(getCD311());
			mFinancialHistory.setCD311LY(getCD311LY());
			mFinancialHistory.setCD312(getCD312());
			mFinancialHistory.setCD312LY(getCD312LY());
			mFinancialHistory.setCD313(getCD313());
			mFinancialHistory.setCD313LY(getCD313LY());
			mFinancialHistory.setCD314(getCD314());
			mFinancialHistory.setCD314LY(getCD314LY());
			mFinancialHistory.setCD315(getCD315());
			mFinancialHistory.setCD315LY(getCD315LY());
			mFinancialHistory.setCD316(getCD316());
			mFinancialHistory.setCD316LY(getCD316LY());
			mFinancialHistory.setCD317(getCD317());
			mFinancialHistory.setCD317LY(getCD317LY());
			mFinancialHistory.setCD318(getCD318());
			mFinancialHistory.setCD318LY(getCD318LY());
			mFinancialHistory.setCD319(getCD319());
			mFinancialHistory.setCD319LY(getCD319LY());
			mFinancialHistory.setCD320(getCD320());
			mFinancialHistory.setCD320LY(getCD320LY());
			mFinancialHistory.setCD321(getCD321());
			mFinancialHistory.setCD321LY(getCD321LY());
			mFinancialHistory.setCD322(getCD322());
			mFinancialHistory.setCD322LY(getCD322LY());
			mFinancialHistory.setCD323(getCD323());
			mFinancialHistory.setCD323LY(getCD323LY());
			mFinancialHistory.setCD324(getCD324());
			mFinancialHistory.setCD324LY(getCD324LY());
			mFinancialHistory.setCD330(getCD330());
			mFinancialHistory.setCD330LY(getCD330LY());
			mFinancialHistory.setCD331(getCD331());
			mFinancialHistory.setCD331LY(getCD331LY());
			mFinancialHistory.setCD332(getCD332());
			mFinancialHistory.setCD332LY(getCD332LY());
			mFinancialHistory.setCD333(getCD333());
			mFinancialHistory.setCD333LY(getCD333LY());
			mFinancialHistory.setCD334(getCD334());
			mFinancialHistory.setCD334LY(getCD334LY());
			mFinancialHistory.setCD335(getCD335());
			mFinancialHistory.setCD335LY(getCD335LY());
			mFinancialHistory.setCD336(getCD336());
			mFinancialHistory.setCD336LY(getCD336LY());
			mFinancialHistory.setCD337(getCD337());
			mFinancialHistory.setCD337LY(getCD337LY());
			mFinancialHistory.setCD338(getCD338());
			mFinancialHistory.setCD338LY(getCD338LY());
			mFinancialHistory.setCD339(getCD339());
			mFinancialHistory.setCD339LY(getCD339LY());
			mFinancialHistory.setCD340(getCD340());
			mFinancialHistory.setCD340LY(getCD340LY());
			mFinancialHistory.setCD341(getCD341());
			mFinancialHistory.setCD341LY(getCD341LY());
			mFinancialHistory.setCD342(getCD342());
			mFinancialHistory.setCD342LY(getCD342LY());
			mFinancialHistory.setCD343(getCD343());
			mFinancialHistory.setCD343LY(getCD343LY());
			mFinancialHistory.setCD400(getCD400());
			mFinancialHistory.setCD400LY(getCD400LY());
			mFinancialHistory.setCD410(getCD410());
			mFinancialHistory.setCD410LY(getCD410LY());
			mFinancialHistory.setCD411(getCD411());
			mFinancialHistory.setCD411LY(getCD411LY());
			mFinancialHistory.setCD411a(getCD411a());
			mFinancialHistory.setCD411aLY(getCD411aLY());
			mFinancialHistory.setCD411b(getCD411b());
			mFinancialHistory.setCD411bLY(getCD411bLY());
			mFinancialHistory.setCD412(getCD412());
			mFinancialHistory.setCD412LY(getCD412LY());
			mFinancialHistory.setCD413(getCD413());
			mFinancialHistory.setCD413LY(getCD413LY());
			mFinancialHistory.setCD414(getCD414());
			mFinancialHistory.setCD414LY(getCD414LY());
			mFinancialHistory.setCD415(getCD415());
			mFinancialHistory.setCD415LY(getCD415LY());
			mFinancialHistory.setCD416(getCD416());
			mFinancialHistory.setCD416LY(getCD416LY());
			mFinancialHistory.setCD417(getCD417());
			mFinancialHistory.setCD417LY(getCD417LY());
			mFinancialHistory.setCD418(getCD418());
			mFinancialHistory.setCD418LY(getCD418LY());
			mFinancialHistory.setCD419(getCD419());
			mFinancialHistory.setCD419LY(getCD419LY());
			mFinancialHistory.setCD420(getCD420());
			mFinancialHistory.setCD420LY(getCD420LY());
			mFinancialHistory.setCD421(getCD421());
			mFinancialHistory.setCD421LY(getCD421LY());
			mFinancialHistory.setCD421a(getCD421a());
			mFinancialHistory.setCD421aLY(getCD421aLY());
			mFinancialHistory.setCD421b(getCD421b());
			mFinancialHistory.setCD421bLY(getCD421bLY());
			mFinancialHistory.setCD422(getCD422());
			mFinancialHistory.setCD422LY(getCD422LY());
			mFinancialHistory.setCD429(getCD429());
			mFinancialHistory.setCD429LY(getCD429LY());
			mFinancialHistory.setCD430(getCD430());
			mFinancialHistory.setCD430LY(getCD430LY());
			mFinancialHistory.setCD431(getCD431());
			mFinancialHistory.setCD431LY(getCD431LY());
			mFinancialHistory.setCD432(getCD432());
			mFinancialHistory.setCD432LY(getCD432LY());
			mFinancialHistory.setCD440(getCD440());
			mFinancialHistory.setCD440LY(getCD440LY());
			mFinancialHistory.setKQ01(getKQ01());
			mFinancialHistory.setKQ01LY(getKQ01LY());
			mFinancialHistory.setKQ02(getKQ02());
			mFinancialHistory.setKQ02LY(getKQ02LY());
			mFinancialHistory.setKQ10(getKQ10());
			mFinancialHistory.setKQ10LY(getKQ10LY());
			mFinancialHistory.setKQ11(getKQ11());
			mFinancialHistory.setKQ11LY(getKQ11LY());
			mFinancialHistory.setKQ20(getKQ20());
			mFinancialHistory.setKQ20LY(getKQ20LY());
			mFinancialHistory.setKQ21(getKQ21());
			mFinancialHistory.setKQ21LY(getKQ21LY());
			mFinancialHistory.setKQ22(getKQ22());
			mFinancialHistory.setKQ22LY(getKQ22LY());
			mFinancialHistory.setKQ23(getKQ23());
			mFinancialHistory.setKQ23LY(getKQ23LY());
			mFinancialHistory.setKQ24(getKQ24());
			mFinancialHistory.setKQ24LY(getKQ24LY());
			mFinancialHistory.setKQ25(getKQ25());
			mFinancialHistory.setKQ25LY(getKQ25LY());
			mFinancialHistory.setKQ26(getKQ26());
			mFinancialHistory.setKQ26LY(getKQ26LY());
			mFinancialHistory.setKQ30(getKQ30());
			mFinancialHistory.setKQ30LY(getKQ30LY());
			mFinancialHistory.setKQ31(getKQ31());
			mFinancialHistory.setKQ31LY(getKQ31LY());
			mFinancialHistory.setKQ32(getKQ32());
			mFinancialHistory.setKQ32LY(getKQ32LY());
			mFinancialHistory.setKQ40(getKQ40());
			mFinancialHistory.setKQ40LY(getKQ40LY());
			mFinancialHistory.setKQ50(getKQ50());
			mFinancialHistory.setKQ50LY(getKQ50LY());
			mFinancialHistory.setKQ51(getKQ51());
			mFinancialHistory.setKQ51LY(getKQ51LY());
			mFinancialHistory.setKQ52(getKQ52());
			mFinancialHistory.setKQ52LY(getKQ52LY());
			mFinancialHistory.setKQ60(getKQ60());
			mFinancialHistory.setKQ60LY(getKQ60LY());
			mFinancialHistory.setKQ61(getKQ61());
			mFinancialHistory.setKQ61LY(getKQ61LY());
			mFinancialHistory.setKQ62(getKQ62());
			mFinancialHistory.setKQ62LY(getKQ62LY());
			mFinancialHistory.setKQ70(getKQ70());
			mFinancialHistory.setKQ70LY(getKQ70LY());
			mFinancialHistory.setKQ71(getKQ71());
			mFinancialHistory.setKQ71LY(getKQ71LY());
			mFinancialHistory.setLTC_20(getLTC_20());
			mFinancialHistory.setLTC_20LY(getLTC_20LY());
			if (getBCTC_B1_File() != null) {
				mFinancialHistory.setBCTC_B1_File(getBCTC_B1_File().replace(" ", ""));
			}

			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);

			Integer roleID = Env.getAD_User_ID(getCtx());
			if (roleID == 1000036 || roleID == 1000030) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
			} else if (roleID == 1000031) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_KSV);
			} else if (roleID == 1000032) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_TDTD);
			} else
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
			mFinancialHistory.setHisCreatedBy(user.getName());
			mFinancialHistory.save();
		}
		else if ("1".equals(getIsRecordReject()) && !newRecord) { {
			MFinancialInfoHistory mFinancialHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
					MCustomerProfile.COLUMNNAME_StatusFinance);

			List<MFinancialInfoHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
					getTDAB_Financial_Info_ID());
			if (listFinanHis.size() == 0) {
				mFinancialHistory = new MFinancialInfoHistory(getCtx(), 0, get_TrxName());
				mFinancialHistory.setTDAB_Financial_Info_ID(getTDAB_Financial_Info_ID());
			} else {
				mFinancialHistory = listFinanHis.get(0);
			}
			mFinancialHistory.setCheck_Hand_Input(isCheck_Hand_Input());
			mFinancialHistory.setCheck_Upload_Excel(isCheck_Upload_Excel());
			mFinancialHistory.setYear_Report(getYear_Report());
			mFinancialHistory.setYear_Report_Ly(getYear_Report_Ly());
			mFinancialHistory.setCD100(getCD100());
			mFinancialHistory.setCD100LY(getCD100LY());
			mFinancialHistory.setCD110(getCD110());
			mFinancialHistory.setCD110LY(getCD110LY());
			mFinancialHistory.setCD111(getCD111());
			mFinancialHistory.setCD111LY(getCD111LY());
			mFinancialHistory.setCD112(getCD112());
			mFinancialHistory.setCD112LY(getCD112LY());
			mFinancialHistory.setCD120(getCD120());
			mFinancialHistory.setCD120LY(getCD120LY());
			mFinancialHistory.setCD121(getCD121());
			mFinancialHistory.setCD121LY(getCD121LY());
			mFinancialHistory.setCD122(getCD122());
			mFinancialHistory.setCD122LY(getCD122LY());
			mFinancialHistory.setCD123(getCD123());
			mFinancialHistory.setCD123LY(getCD123LY());
			mFinancialHistory.setCD124(getCD124());
			mFinancialHistory.setCD124LY(getCD124LY());
			mFinancialHistory.setCD130(getCD130());
			mFinancialHistory.setCD130LY(getCD130LY());
			mFinancialHistory.setCD131(getCD131());
			mFinancialHistory.setCD131LY(getCD131LY());
			mFinancialHistory.setCD132(getCD132());
			mFinancialHistory.setCD132LY(getCD132LY());
			mFinancialHistory.setCD133(getCD133());
			mFinancialHistory.setCD133LY(getCD133LY());
			mFinancialHistory.setCD134(getCD134());
			mFinancialHistory.setCD134LY(getCD134LY());
			mFinancialHistory.setCD135(getCD135());
			mFinancialHistory.setCD135LY(getCD135LY());
			mFinancialHistory.setCD136(getCD136());
			mFinancialHistory.setCD136LY(getCD136LY());
			mFinancialHistory.setCD137(getCD137());
			mFinancialHistory.setCD137LY(getCD137LY());
			mFinancialHistory.setCD139(getCD139());
			mFinancialHistory.setCD139LY(getCD139LY());
			mFinancialHistory.setCD140(getCD140());
			mFinancialHistory.setCD140LY(getCD140LY());
			mFinancialHistory.setCD141(getCD141());
			mFinancialHistory.setCD141LY(getCD141LY());
			mFinancialHistory.setCD149(getCD149());
			mFinancialHistory.setCD149LY(getCD149LY());
			mFinancialHistory.setCD150(getCD150());
			mFinancialHistory.setCD150LY(getCD150LY());
			mFinancialHistory.setCD151(getCD151());
			mFinancialHistory.setCD151LY(getCD151LY());
			mFinancialHistory.setCD152(getCD152());
			mFinancialHistory.setCD152LY(getCD152LY());
			mFinancialHistory.setCD153(getCD153());
			mFinancialHistory.setCD153LY(getCD153LY());
			mFinancialHistory.setCD154(getCD154());
			mFinancialHistory.setCD154LY(getCD154LY());
			mFinancialHistory.setCD155(getCD155());
			mFinancialHistory.setCD155LY(getCD155LY());
			mFinancialHistory.setCD200(getCD200());
			mFinancialHistory.setCD200LY(getCD200LY());
			mFinancialHistory.setCD210(getCD210());
			mFinancialHistory.setCD210LY(getCD210LY());
			mFinancialHistory.setCD211(getCD211());
			mFinancialHistory.setCD211LY(getCD211LY());
			mFinancialHistory.setCD212(getCD212());
			mFinancialHistory.setCD212LY(getCD212LY());
			mFinancialHistory.setCD213(getCD213());
			mFinancialHistory.setCD213LY(getCD213LY());
			mFinancialHistory.setCD214(getCD214());
			mFinancialHistory.setCD214LY(getCD214LY());
			mFinancialHistory.setCD215(getCD215());
			mFinancialHistory.setCD215LY(getCD215LY());
			mFinancialHistory.setCD216(getCD216());
			mFinancialHistory.setCD216LY(getCD216LY());
			mFinancialHistory.setCD219(getCD219());
			mFinancialHistory.setCD219LY(getCD219LY());
			mFinancialHistory.setCD220(getCD220());
			mFinancialHistory.setCD220LY(getCD220LY());
			mFinancialHistory.setCD221(getCD221());
			mFinancialHistory.setCD221LY(getCD221LY());
			mFinancialHistory.setCD222(getCD222());
			mFinancialHistory.setCD222LY(getCD222LY());
			mFinancialHistory.setCD223(getCD223());
			mFinancialHistory.setCD223LY(getCD223LY());
			mFinancialHistory.setCD224(getCD224());
			mFinancialHistory.setCD224LY(getCD224LY());
			mFinancialHistory.setCD225(getCD225());
			mFinancialHistory.setCD225LY(getCD225LY());
			mFinancialHistory.setCD226(getCD226());
			mFinancialHistory.setCD226LY(getCD226LY());
			mFinancialHistory.setCD227(getCD227());
			mFinancialHistory.setCD227LY(getCD227LY());
			mFinancialHistory.setCD228(getCD228());
			mFinancialHistory.setCD228LY(getCD228LY());
			mFinancialHistory.setCD229(getCD229());
			mFinancialHistory.setCD229LY(getCD229LY());
			mFinancialHistory.setCD230(getCD230());
			mFinancialHistory.setCD230LY(getCD230LY());
			mFinancialHistory.setCD231(getCD231());
			mFinancialHistory.setCD231LY(getCD231LY());
			mFinancialHistory.setCD232(getCD232());
			mFinancialHistory.setCD232LY(getCD232LY());
			mFinancialHistory.setCD240(getCD240());
			mFinancialHistory.setCD240LY(getCD240LY());
			mFinancialHistory.setCD241(getCD241());
			mFinancialHistory.setCD241LY(getCD241LY());
			mFinancialHistory.setCD242(getCD242());
			mFinancialHistory.setCD242LY(getCD242LY());
			mFinancialHistory.setCD250(getCD250());
			mFinancialHistory.setCD250LY(getCD250LY());
			mFinancialHistory.setCD251(getCD251());
			mFinancialHistory.setCD251LY(getCD251LY());
			mFinancialHistory.setCD252(getCD252());
			mFinancialHistory.setCD252LY(getCD252LY());
			mFinancialHistory.setCD253(getCD253());
			mFinancialHistory.setCD253LY(getCD253LY());
			mFinancialHistory.setCD254(getCD254());
			mFinancialHistory.setCD254LY(getCD254LY());
			mFinancialHistory.setCD255(getCD255());
			mFinancialHistory.setCD255LY(getCD255LY());
			mFinancialHistory.setCD260(getCD260());
			mFinancialHistory.setCD260LY(getCD260LY());
			mFinancialHistory.setCD261(getCD261());
			mFinancialHistory.setCD261LY(getCD261LY());
			mFinancialHistory.setCD262(getCD262());
			mFinancialHistory.setCD262LY(getCD262LY());
			mFinancialHistory.setCD263(getCD263());
			mFinancialHistory.setCD263LY(getCD263LY());
			mFinancialHistory.setCD268(getCD268());
			mFinancialHistory.setCD268LY(getCD268LY());
			mFinancialHistory.setCD269(getCD269());
			mFinancialHistory.setCD269LY(getCD269LY());
			mFinancialHistory.setCD270(getCD270());
			mFinancialHistory.setCD270LY(getCD270LY());
			mFinancialHistory.setCD300(getCD300());
			mFinancialHistory.setCD300LY(getCD300LY());
			mFinancialHistory.setCD310(getCD310());
			mFinancialHistory.setCD310LY(getCD310LY());
			mFinancialHistory.setCD311(getCD311());
			mFinancialHistory.setCD311LY(getCD311LY());
			mFinancialHistory.setCD312(getCD312());
			mFinancialHistory.setCD312LY(getCD312LY());
			mFinancialHistory.setCD313(getCD313());
			mFinancialHistory.setCD313LY(getCD313LY());
			mFinancialHistory.setCD314(getCD314());
			mFinancialHistory.setCD314LY(getCD314LY());
			mFinancialHistory.setCD315(getCD315());
			mFinancialHistory.setCD315LY(getCD315LY());
			mFinancialHistory.setCD316(getCD316());
			mFinancialHistory.setCD316LY(getCD316LY());
			mFinancialHistory.setCD317(getCD317());
			mFinancialHistory.setCD317LY(getCD317LY());
			mFinancialHistory.setCD318(getCD318());
			mFinancialHistory.setCD318LY(getCD318LY());
			mFinancialHistory.setCD319(getCD319());
			mFinancialHistory.setCD319LY(getCD319LY());
			mFinancialHistory.setCD320(getCD320());
			mFinancialHistory.setCD320LY(getCD320LY());
			mFinancialHistory.setCD321(getCD321());
			mFinancialHistory.setCD321LY(getCD321LY());
			mFinancialHistory.setCD322(getCD322());
			mFinancialHistory.setCD322LY(getCD322LY());
			mFinancialHistory.setCD323(getCD323());
			mFinancialHistory.setCD323LY(getCD323LY());
			mFinancialHistory.setCD324(getCD324());
			mFinancialHistory.setCD324LY(getCD324LY());
			mFinancialHistory.setCD330(getCD330());
			mFinancialHistory.setCD330LY(getCD330LY());
			mFinancialHistory.setCD331(getCD331());
			mFinancialHistory.setCD331LY(getCD331LY());
			mFinancialHistory.setCD332(getCD332());
			mFinancialHistory.setCD332LY(getCD332LY());
			mFinancialHistory.setCD333(getCD333());
			mFinancialHistory.setCD333LY(getCD333LY());
			mFinancialHistory.setCD334(getCD334());
			mFinancialHistory.setCD334LY(getCD334LY());
			mFinancialHistory.setCD335(getCD335());
			mFinancialHistory.setCD335LY(getCD335LY());
			mFinancialHistory.setCD336(getCD336());
			mFinancialHistory.setCD336LY(getCD336LY());
			mFinancialHistory.setCD337(getCD337());
			mFinancialHistory.setCD337LY(getCD337LY());
			mFinancialHistory.setCD338(getCD338());
			mFinancialHistory.setCD338LY(getCD338LY());
			mFinancialHistory.setCD339(getCD339());
			mFinancialHistory.setCD339LY(getCD339LY());
			mFinancialHistory.setCD340(getCD340());
			mFinancialHistory.setCD340LY(getCD340LY());
			mFinancialHistory.setCD341(getCD341());
			mFinancialHistory.setCD341LY(getCD341LY());
			mFinancialHistory.setCD342(getCD342());
			mFinancialHistory.setCD342LY(getCD342LY());
			mFinancialHistory.setCD343(getCD343());
			mFinancialHistory.setCD343LY(getCD343LY());
			mFinancialHistory.setCD400(getCD400());
			mFinancialHistory.setCD400LY(getCD400LY());
			mFinancialHistory.setCD410(getCD410());
			mFinancialHistory.setCD410LY(getCD410LY());
			mFinancialHistory.setCD411(getCD411());
			mFinancialHistory.setCD411LY(getCD411LY());
			mFinancialHistory.setCD411a(getCD411a());
			mFinancialHistory.setCD411aLY(getCD411aLY());
			mFinancialHistory.setCD411b(getCD411b());
			mFinancialHistory.setCD411bLY(getCD411bLY());
			mFinancialHistory.setCD412(getCD412());
			mFinancialHistory.setCD412LY(getCD412LY());
			mFinancialHistory.setCD413(getCD413());
			mFinancialHistory.setCD413LY(getCD413LY());
			mFinancialHistory.setCD414(getCD414());
			mFinancialHistory.setCD414LY(getCD414LY());
			mFinancialHistory.setCD415(getCD415());
			mFinancialHistory.setCD415LY(getCD415LY());
			mFinancialHistory.setCD416(getCD416());
			mFinancialHistory.setCD416LY(getCD416LY());
			mFinancialHistory.setCD417(getCD417());
			mFinancialHistory.setCD417LY(getCD417LY());
			mFinancialHistory.setCD418(getCD418());
			mFinancialHistory.setCD418LY(getCD418LY());
			mFinancialHistory.setCD419(getCD419());
			mFinancialHistory.setCD419LY(getCD419LY());
			mFinancialHistory.setCD420(getCD420());
			mFinancialHistory.setCD420LY(getCD420LY());
			mFinancialHistory.setCD421(getCD421());
			mFinancialHistory.setCD421LY(getCD421LY());
			mFinancialHistory.setCD421a(getCD421a());
			mFinancialHistory.setCD421aLY(getCD421aLY());
			mFinancialHistory.setCD421b(getCD421b());
			mFinancialHistory.setCD421bLY(getCD421bLY());
			mFinancialHistory.setCD422(getCD422());
			mFinancialHistory.setCD422LY(getCD422LY());
			mFinancialHistory.setCD429(getCD429());
			mFinancialHistory.setCD429LY(getCD429LY());
			mFinancialHistory.setCD430(getCD430());
			mFinancialHistory.setCD430LY(getCD430LY());
			mFinancialHistory.setCD431(getCD431());
			mFinancialHistory.setCD431LY(getCD431LY());
			mFinancialHistory.setCD432(getCD432());
			mFinancialHistory.setCD432LY(getCD432LY());
			mFinancialHistory.setCD440(getCD440());
			mFinancialHistory.setCD440LY(getCD440LY());
			mFinancialHistory.setKQ01(getKQ01());
			mFinancialHistory.setKQ01LY(getKQ01LY());
			mFinancialHistory.setKQ02(getKQ02());
			mFinancialHistory.setKQ02LY(getKQ02LY());
			mFinancialHistory.setKQ10(getKQ10());
			mFinancialHistory.setKQ10LY(getKQ10LY());
			mFinancialHistory.setKQ11(getKQ11());
			mFinancialHistory.setKQ11LY(getKQ11LY());
			mFinancialHistory.setKQ20(getKQ20());
			mFinancialHistory.setKQ20LY(getKQ20LY());
			mFinancialHistory.setKQ21(getKQ21());
			mFinancialHistory.setKQ21LY(getKQ21LY());
			mFinancialHistory.setKQ22(getKQ22());
			mFinancialHistory.setKQ22LY(getKQ22LY());
			mFinancialHistory.setKQ23(getKQ23());
			mFinancialHistory.setKQ23LY(getKQ23LY());
			mFinancialHistory.setKQ24(getKQ24());
			mFinancialHistory.setKQ24LY(getKQ24LY());
			mFinancialHistory.setKQ25(getKQ25());
			mFinancialHistory.setKQ25LY(getKQ25LY());
			mFinancialHistory.setKQ26(getKQ26());
			mFinancialHistory.setKQ26LY(getKQ26LY());
			mFinancialHistory.setKQ30(getKQ30());
			mFinancialHistory.setKQ30LY(getKQ30LY());
			mFinancialHistory.setKQ31(getKQ31());
			mFinancialHistory.setKQ31LY(getKQ31LY());
			mFinancialHistory.setKQ32(getKQ32());
			mFinancialHistory.setKQ32LY(getKQ32LY());
			mFinancialHistory.setKQ40(getKQ40());
			mFinancialHistory.setKQ40LY(getKQ40LY());
			mFinancialHistory.setKQ50(getKQ50());
			mFinancialHistory.setKQ50LY(getKQ50LY());
			mFinancialHistory.setKQ51(getKQ51());
			mFinancialHistory.setKQ51LY(getKQ51LY());
			mFinancialHistory.setKQ52(getKQ52());
			mFinancialHistory.setKQ52LY(getKQ52LY());
			mFinancialHistory.setKQ60(getKQ60());
			mFinancialHistory.setKQ60LY(getKQ60LY());
			mFinancialHistory.setKQ61(getKQ61());
			mFinancialHistory.setKQ61LY(getKQ61LY());
			mFinancialHistory.setKQ62(getKQ62());
			mFinancialHistory.setKQ62LY(getKQ62LY());
			mFinancialHistory.setKQ70(getKQ70());
			mFinancialHistory.setKQ70LY(getKQ70LY());
			mFinancialHistory.setKQ71(getKQ71());
			mFinancialHistory.setKQ71LY(getKQ71LY());
			mFinancialHistory.setLTC_20(getLTC_20());
			mFinancialHistory.setLTC_20LY(getLTC_20LY());
			if (getBCTC_B1_File() != null) {
				mFinancialHistory.setBCTC_B1_File(getBCTC_B1_File().replace(" ", ""));
			}

			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);

			Integer roleID = Env.getAD_User_ID(getCtx());
			if (roleID == 1000036 || roleID == 1000030) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
			} else if (roleID == 1000031) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_KSV);
			} else if (roleID == 1000032) {
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_TDTD);
			} else
				mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
			mFinancialHistory.setHisCreatedBy(user.getName());
			mFinancialHistory.save();
		}
		}
		return super.afterSave(newRecord, success);
	}

	private X_AD_User getUserById(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_AD_User.COLUMNNAME_AD_User_ID + "=?");
		return new Query(null, X_AD_User.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}

	private Integer validateCell(double cell) {
		if (cell > 0) {
			return 1;
		} else if (cell < 0) {
			return -1;
		} else
			return 0;
	}

	private Integer validateBigDecimal(BigDecimal cell) {
		if (cell.compareTo(TT_0) == 1) {
			return 1;
		} else if (cell.compareTo(TT_0) == -1) {
			return -1;
		} else
			return 0;
	}

	private Exception throwException(Workbook workbook, String msg) throws IOException {
		workbook.close();
		throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), msg));
	}

	protected MFinancialInfo insertMFinancialInfo(File file, int TDAB_Customer_Profile_ID, boolean newRecord)
			throws IOException {
		MFinancialInfo mfinancialInfo = null;

		return mfinancialInfo;
	}

	protected MFinancialInfo insertBCTCInfo(File file, int TDAB_Customer_Profile_ID, boolean newRecord)
			throws IOException {
		if (newRecord) {
			mbctc = new MFinancialInfo(getCtx(), 0, get_TrxName());

		} else {
			MFinancialInfo old = new MFinancialInfo(getCtx(), getTDAB_Financial_ID(), get_TrxName());
			mbctc = old;
		}
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = null;
		if (file.getPath().endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (file.getPath().endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			inputStream.close();
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_FILE_BCTC_TYPE));
		}
		Sheet firstSheet = workbook.getSheetAt(0);

		// validate cho cÃ¡c chá»‰ tiÃªu

		String error = "";
			
				Cell cell = firstSheet.getRow(11).getCell(6);
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_YEAR_NUM);
				}
				
				Cell cell1 = firstSheet.getRow(11).getCell(4);
				switch (cell1.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_YEAR_LY_NUM);
				}
			if (validateCell(firstSheet.getRow(17).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(17).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD100);
			}

			if (validateCell(firstSheet.getRow(18).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(18).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD110);
			}

			if (validateCell(firstSheet.getRow(19).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(19).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD111);
			}

			if (validateCell(firstSheet.getRow(20).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(20).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD112);
			}

			if (validateCell(firstSheet.getRow(21).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(21).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD120);
			}

			if (validateCell(firstSheet.getRow(22).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(22).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD121);
			}

			if (validateCell(firstSheet.getRow(23).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(23).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD122);
			}

			if (validateCell(firstSheet.getRow(24).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(24).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD123);
			}

			if (validateCell(firstSheet.getRow(26).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(26).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD130);
			}

			if (validateCell(firstSheet.getRow(27).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(27).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD131);
			}

			if (validateCell(firstSheet.getRow(28).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(28).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD132);
			}

			if (validateCell(firstSheet.getRow(29).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(29).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD133);
			}

			if (validateCell(firstSheet.getRow(30).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(30).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD134);
			}

			if (validateCell(firstSheet.getRow(31).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(31).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD135);
			}

			if (validateCell(firstSheet.getRow(32).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(32).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD136);
			}

			if (validateCell(firstSheet.getRow(33).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(33).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD137);
			}

			if (validateCell(firstSheet.getRow(34).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(34).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD139);
			}

			if (validateCell(firstSheet.getRow(35).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(35).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD140);
			}

			if (validateCell(firstSheet.getRow(36).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(36).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD141);
			}

			if (validateCell(firstSheet.getRow(37).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(37).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD149);
			}

			if (validateCell(firstSheet.getRow(38).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(38).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD150);
			}

			if (validateCell(firstSheet.getRow(39).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(39).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD151);
			}

			if (validateCell(firstSheet.getRow(40).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(40).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD152);
			}

			if (validateCell(firstSheet.getRow(41).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(41).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD153);
			}

			if (validateCell(firstSheet.getRow(42).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(42).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD154);
			}

			if (validateCell(firstSheet.getRow(43).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(43).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD155);
			}

			if (validateCell(firstSheet.getRow(45).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(45).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD200);
			}

			if (validateCell(firstSheet.getRow(46).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(46).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD210);
			}

			if (validateCell(firstSheet.getRow(47).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(47).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD211);
			}

			if (validateCell(firstSheet.getRow(48).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(48).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD212);
			}

			if (validateCell(firstSheet.getRow(49).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(49).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD213);
			}

			if (validateCell(firstSheet.getRow(50).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(50).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD214);
			}
			if (validateCell(firstSheet.getRow(51).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(51).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD215);
			}
			if (validateCell(firstSheet.getRow(52).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(52).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD216);
			}
			if (validateCell(firstSheet.getRow(53).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(53).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD219);
			}
			if (validateCell(firstSheet.getRow(54).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(54).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD220);
			}
			if (validateCell(firstSheet.getRow(55).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(55).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD221);
			}
			if (validateCell(firstSheet.getRow(56).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(56).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD222);
			}
			if (validateCell(firstSheet.getRow(57).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(57).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD223);
			}
			if (validateCell(firstSheet.getRow(58).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(58).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD224);
			}
			if (validateCell(firstSheet.getRow(59).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(59).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD225);
			}
			if (validateCell(firstSheet.getRow(60).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(60).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD226);
			}
			if (validateCell(firstSheet.getRow(61).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(61).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD227);
			}
			if (validateCell(firstSheet.getRow(62).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(62).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD228);
			}
			if (validateCell(firstSheet.getRow(63).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(63).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD229);
			}
			if (validateCell(firstSheet.getRow(64).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(64).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD230);
			}
			if (validateCell(firstSheet.getRow(65).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(65).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD231);
			}
			if (validateCell(firstSheet.getRow(66).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(66).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD232);
			}
			if (validateCell(firstSheet.getRow(67).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(67).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD240);
			}
			if (validateCell(firstSheet.getRow(68).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(68).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD241);
			}
			if (validateCell(firstSheet.getRow(69).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(69).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD242);
			}
			if (validateCell(firstSheet.getRow(70).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(70).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD250);
			}
			if (validateCell(firstSheet.getRow(71).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(71).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD251);
			}
			if (validateCell(firstSheet.getRow(72).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(72).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD252);
			}
			if (validateCell(firstSheet.getRow(73).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(73).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD253);
			}
			if (validateCell(firstSheet.getRow(74).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(74).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD254);
			}
			if (validateCell(firstSheet.getRow(75).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(75).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD255);
			}
			if (validateCell(firstSheet.getRow(76).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(76).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD260);
			}
			if (validateCell(firstSheet.getRow(77).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(77).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD261);
			}
			if (validateCell(firstSheet.getRow(78).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(78).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD262);
			}
			if (validateCell(firstSheet.getRow(79).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(79).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD263);
			}
			if (validateCell(firstSheet.getRow(80).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(80).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD268);
			}
//		if (validateCell(firstSheet.getRow(80).getCell(6).getNumericCellValue()) == -1
//				|| validateCell(firstSheet.getRow(80).getCell(4).getNumericCellValue()) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD269);
//		}
			if (validateCell(firstSheet.getRow(82).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(82).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD270);
			}
			if (validateCell(firstSheet.getRow(83).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(83).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD300);
			}
			if (validateCell(firstSheet.getRow(84).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(84).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD310);
			}
			if (validateCell(firstSheet.getRow(85).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(85).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD311);
			}
			if (validateCell(firstSheet.getRow(86).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(87).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD312);
			}
//		if (validateCell(firstSheet.getRow(87).getCell(6).getNumericCellValue()) == -1
//				|| validateCell(firstSheet.getRow(87).getCell(4).getNumericCellValue()) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD313);
//		}
			if (validateCell(firstSheet.getRow(88).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(88).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD314);
			}
			if (validateCell(firstSheet.getRow(91).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(91).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD315);
			}
			if (validateCell(firstSheet.getRow(92).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(92).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD316);
			}
			if (validateCell(firstSheet.getRow(93).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(93).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD317);
			}
			if (validateCell(firstSheet.getRow(94).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(94).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD318);
			}
			if (validateCell(firstSheet.getRow(95).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(95).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD319);
			}
			if (validateCell(firstSheet.getRow(96).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(96).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD320);
			}
			if (validateCell(firstSheet.getRow(97).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(97).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD321);
			}
			if (validateCell(firstSheet.getRow(98).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(98).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD322);
			}
//		if (validateCell(firstSheet.getRow(99).getCell(6).getNumericCellValue()) == -1
//				|| validateCell(firstSheet.getRow(99).getCell(4).getNumericCellValue()) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD323);
//		}
			if (validateCell(firstSheet.getRow(100).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(100).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD324);
			}
			if (validateCell(firstSheet.getRow(101).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(101).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD330);
			}
			if (validateCell(firstSheet.getRow(102).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(102).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD331);
			}
			if (validateCell(firstSheet.getRow(103).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(103).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD332);
			}
			if (validateCell(firstSheet.getRow(104).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(104).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD333);
			}
			if (validateCell(firstSheet.getRow(105).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(105).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD334);
			}
			if (validateCell(firstSheet.getRow(106).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(106).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD335);
			}
			if (validateCell(firstSheet.getRow(107).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(107).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD336);
			}
//		if (validateCell(firstSheet.getRow(108).getCell(6).getNumericCellValue()) == -1
//				|| validateCell(firstSheet.getRow(108).getCell(4).getNumericCellValue()) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD337);
//		}
			if (validateCell(firstSheet.getRow(109).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(109).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD338);
			}
			if (validateCell(firstSheet.getRow(110).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(110).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD339);
			}
			if (validateCell(firstSheet.getRow(111).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(111).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD340);
			}
			if (validateCell(firstSheet.getRow(112).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(112).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD341);
			}
			if (validateCell(firstSheet.getRow(113).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(113).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD342);
			}
			if (validateCell(firstSheet.getRow(114).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(114).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD343);
			}
			if (validateCell(firstSheet.getRow(117).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(117).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411);
			}
			if (validateCell(firstSheet.getRow(118).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(118).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411a);
			}
			if (validateCell(firstSheet.getRow(119).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(119).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411b);
			}

			if (validateCell(firstSheet.getRow(121).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(121).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD413);
			}
			if (validateCell(firstSheet.getRow(122).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(122).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD414);
			}
			if (validateCell(firstSheet.getRow(123).getCell(6).getNumericCellValue()) == 1
					|| validateCell(firstSheet.getRow(123).getCell(4).getNumericCellValue()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD415);
			}
			if (validateCell(firstSheet.getRow(126).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(126).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD418);
			}
			if (validateCell(firstSheet.getRow(127).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(127).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD419);
			}
			if (validateCell(firstSheet.getRow(128).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(128).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD420);
			}
			if (validateCell(firstSheet.getRow(132).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(132).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD422);
			}
			if (validateCell(firstSheet.getRow(133).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(133).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD429);
			}
			if (validateCell(firstSheet.getRow(134).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(134).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD430);
			}
			if (validateCell(firstSheet.getRow(135).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(135).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD431);
			}
			if (validateCell(firstSheet.getRow(136).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(136).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD432);
			}
			if (validateCell(firstSheet.getRow(137).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(137).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD440);
			}
			if (validateCell(firstSheet.getRow(142).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(142).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ01);
			}
			if (validateCell(firstSheet.getRow(143).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(143).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ02);
			}
			if (validateCell(firstSheet.getRow(144).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(144).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ10);
			}
			if (validateCell(firstSheet.getRow(145).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(145).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ11);
			}
			if (validateCell(firstSheet.getRow(147).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(147).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ21);
			}
			if (validateCell(firstSheet.getRow(154).getCell(6).getNumericCellValue()) == -1
					|| validateCell(firstSheet.getRow(154).getCell(4).getNumericCellValue()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ31);
			}

			if (firstSheet.getRow(82).getCell(6).getNumericCellValue() != firstSheet.getRow(137).getCell(6)
					.getNumericCellValue()
					|| firstSheet.getRow(82).getCell(4).getNumericCellValue() != firstSheet.getRow(137).getCell(4)
							.getNumericCellValue()) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_BCTC);
			}
		
		if (error != "") {
			throw new IllegalArgumentException(error);
		}

		// set giÃ¡ trá»‹ cho tá»«ng trÆ°á»�ng trong báº£ng info
		try {
			setCD100LY(new BigDecimal(firstSheet.getRow(17).getCell(4).getNumericCellValue()));
			setCD100(new BigDecimal(firstSheet.getRow(17).getCell(6).getNumericCellValue()));
			setCD110LY(new BigDecimal(firstSheet.getRow(18).getCell(4).getNumericCellValue()));
			setCD110(new BigDecimal(firstSheet.getRow(18).getCell(6).getNumericCellValue()));
			setCD111LY(new BigDecimal(firstSheet.getRow(19).getCell(4).getNumericCellValue()));
			setCD111(new BigDecimal(firstSheet.getRow(19).getCell(6).getNumericCellValue()));
			setCD112LY(new BigDecimal(firstSheet.getRow(20).getCell(4).getNumericCellValue()));
			setCD112(new BigDecimal(firstSheet.getRow(20).getCell(6).getNumericCellValue()));
			setCD120LY(new BigDecimal(firstSheet.getRow(21).getCell(4).getNumericCellValue()));
			setCD120(new BigDecimal(firstSheet.getRow(21).getCell(6).getNumericCellValue()));
			setCD121LY(new BigDecimal(firstSheet.getRow(22).getCell(4).getNumericCellValue()));
			setCD121(new BigDecimal(firstSheet.getRow(22).getCell(6).getNumericCellValue()));
			setCD122LY(new BigDecimal(firstSheet.getRow(23).getCell(4).getNumericCellValue()));
			setCD122(new BigDecimal(firstSheet.getRow(23).getCell(6).getNumericCellValue()));
			setCD123LY(new BigDecimal(firstSheet.getRow(24).getCell(4).getNumericCellValue()));
			setCD123(new BigDecimal(firstSheet.getRow(24).getCell(6).getNumericCellValue()));
			setCD124LY(new BigDecimal(firstSheet.getRow(25).getCell(4).getNumericCellValue()));
			setCD124(new BigDecimal(firstSheet.getRow(25).getCell(6).getNumericCellValue()));
			setCD130LY(new BigDecimal(firstSheet.getRow(26).getCell(4).getNumericCellValue()));
			setCD130(new BigDecimal(firstSheet.getRow(26).getCell(6).getNumericCellValue()));
			setCD131LY(new BigDecimal(firstSheet.getRow(27).getCell(4).getNumericCellValue()));
			setCD131(new BigDecimal(firstSheet.getRow(27).getCell(6).getNumericCellValue()));
			setCD132LY(new BigDecimal(firstSheet.getRow(28).getCell(4).getNumericCellValue()));
			setCD132(new BigDecimal(firstSheet.getRow(28).getCell(6).getNumericCellValue()));
			setCD133LY(new BigDecimal(firstSheet.getRow(29).getCell(4).getNumericCellValue()));
			setCD133(new BigDecimal(firstSheet.getRow(29).getCell(6).getNumericCellValue()));
			setCD134LY(new BigDecimal(firstSheet.getRow(30).getCell(4).getNumericCellValue()));
			setCD134(new BigDecimal(firstSheet.getRow(30).getCell(6).getNumericCellValue()));
			setCD135LY(new BigDecimal(firstSheet.getRow(31).getCell(4).getNumericCellValue()));
			setCD135(new BigDecimal(firstSheet.getRow(31).getCell(6).getNumericCellValue()));
			setCD136LY(new BigDecimal(firstSheet.getRow(32).getCell(4).getNumericCellValue()));
			setCD136(new BigDecimal(firstSheet.getRow(32).getCell(6).getNumericCellValue()));
			setCD137LY(new BigDecimal(firstSheet.getRow(33).getCell(4).getNumericCellValue()));
			setCD137(new BigDecimal(firstSheet.getRow(33).getCell(6).getNumericCellValue()));
			setCD139LY(new BigDecimal(firstSheet.getRow(34).getCell(4).getNumericCellValue()));
			setCD139(new BigDecimal(firstSheet.getRow(34).getCell(6).getNumericCellValue()));
			setCD140LY(new BigDecimal(firstSheet.getRow(35).getCell(4).getNumericCellValue()));
			setCD140(new BigDecimal(firstSheet.getRow(35).getCell(6).getNumericCellValue()));
			setCD141LY(new BigDecimal(firstSheet.getRow(36).getCell(4).getNumericCellValue()));
			setCD141(new BigDecimal(firstSheet.getRow(36).getCell(6).getNumericCellValue()));
			setCD149LY(new BigDecimal(firstSheet.getRow(37).getCell(4).getNumericCellValue()));
			setCD149(new BigDecimal(firstSheet.getRow(37).getCell(6).getNumericCellValue()));
			setCD150LY(new BigDecimal(firstSheet.getRow(38).getCell(4).getNumericCellValue()));
			setCD150(new BigDecimal(firstSheet.getRow(38).getCell(6).getNumericCellValue()));
			setCD151LY(new BigDecimal(firstSheet.getRow(39).getCell(4).getNumericCellValue()));
			setCD151(new BigDecimal(firstSheet.getRow(39).getCell(6).getNumericCellValue()));
			setCD152LY(new BigDecimal(firstSheet.getRow(40).getCell(4).getNumericCellValue()));
			setCD152(new BigDecimal(firstSheet.getRow(40).getCell(6).getNumericCellValue()));
			setCD153LY(new BigDecimal(firstSheet.getRow(41).getCell(4).getNumericCellValue()));
			setCD153(new BigDecimal(firstSheet.getRow(41).getCell(6).getNumericCellValue()));
			setCD154LY(new BigDecimal(firstSheet.getRow(42).getCell(4).getNumericCellValue()));
			setCD154(new BigDecimal(firstSheet.getRow(42).getCell(6).getNumericCellValue()));
			setCD155LY(new BigDecimal(firstSheet.getRow(43).getCell(4).getNumericCellValue()));
			setCD155(new BigDecimal(firstSheet.getRow(43).getCell(6).getNumericCellValue()));

			setCD200LY(new BigDecimal(firstSheet.getRow(45).getCell(4).getNumericCellValue()));
			setCD200(new BigDecimal(firstSheet.getRow(45).getCell(6).getNumericCellValue()));
			setCD210LY(new BigDecimal(firstSheet.getRow(46).getCell(4).getNumericCellValue()));
			setCD210(new BigDecimal(firstSheet.getRow(46).getCell(6).getNumericCellValue()));
			setCD211LY(new BigDecimal(firstSheet.getRow(47).getCell(4).getNumericCellValue()));
			setCD211(new BigDecimal(firstSheet.getRow(47).getCell(6).getNumericCellValue()));
			setCD212LY(new BigDecimal(firstSheet.getRow(48).getCell(4).getNumericCellValue()));
			setCD212(new BigDecimal(firstSheet.getRow(48).getCell(6).getNumericCellValue()));
			setCD213LY(new BigDecimal(firstSheet.getRow(49).getCell(4).getNumericCellValue()));
			setCD213(new BigDecimal(firstSheet.getRow(49).getCell(6).getNumericCellValue()));
			setCD214LY(new BigDecimal(firstSheet.getRow(50).getCell(4).getNumericCellValue()));
			setCD214(new BigDecimal(firstSheet.getRow(50).getCell(6).getNumericCellValue()));
			setCD215LY(new BigDecimal(firstSheet.getRow(51).getCell(4).getNumericCellValue()));
			setCD215(new BigDecimal(firstSheet.getRow(51).getCell(6).getNumericCellValue()));
			setCD216LY(new BigDecimal(firstSheet.getRow(52).getCell(4).getNumericCellValue()));
			setCD216(new BigDecimal(firstSheet.getRow(52).getCell(6).getNumericCellValue()));
			setCD219LY(new BigDecimal(firstSheet.getRow(53).getCell(4).getNumericCellValue()));
			setCD219(new BigDecimal(firstSheet.getRow(53).getCell(6).getNumericCellValue()));
			setCD220LY(new BigDecimal(firstSheet.getRow(54).getCell(4).getNumericCellValue()));
			setCD220(new BigDecimal(firstSheet.getRow(54).getCell(6).getNumericCellValue()));
			setCD221LY(new BigDecimal(firstSheet.getRow(55).getCell(4).getNumericCellValue()));
			setCD221(new BigDecimal(firstSheet.getRow(55).getCell(6).getNumericCellValue()));
			setCD222LY(new BigDecimal(firstSheet.getRow(56).getCell(4).getNumericCellValue()));
			setCD222(new BigDecimal(firstSheet.getRow(56).getCell(6).getNumericCellValue()));
			setCD223LY(new BigDecimal(firstSheet.getRow(57).getCell(4).getNumericCellValue()));
			setCD223(new BigDecimal(firstSheet.getRow(57).getCell(6).getNumericCellValue()));
			setCD224LY(new BigDecimal(firstSheet.getRow(58).getCell(4).getNumericCellValue()));
			setCD224(new BigDecimal(firstSheet.getRow(58).getCell(6).getNumericCellValue()));
			setCD225LY(new BigDecimal(firstSheet.getRow(59).getCell(4).getNumericCellValue()));
			setCD225(new BigDecimal(firstSheet.getRow(59).getCell(6).getNumericCellValue()));
			setCD226LY(new BigDecimal(firstSheet.getRow(60).getCell(4).getNumericCellValue()));
			setCD226(new BigDecimal(firstSheet.getRow(60).getCell(6).getNumericCellValue()));
			setCD227LY(new BigDecimal(firstSheet.getRow(61).getCell(4).getNumericCellValue()));
			setCD227(new BigDecimal(firstSheet.getRow(61).getCell(6).getNumericCellValue()));
			setCD228LY(new BigDecimal(firstSheet.getRow(62).getCell(4).getNumericCellValue()));
			setCD228(new BigDecimal(firstSheet.getRow(62).getCell(6).getNumericCellValue()));
			setCD229LY(new BigDecimal(firstSheet.getRow(63).getCell(4).getNumericCellValue()));
			setCD229(new BigDecimal(firstSheet.getRow(63).getCell(6).getNumericCellValue()));
			setCD230LY(new BigDecimal(firstSheet.getRow(64).getCell(4).getNumericCellValue()));
			setCD230(new BigDecimal(firstSheet.getRow(64).getCell(6).getNumericCellValue()));
			setCD231LY(new BigDecimal(firstSheet.getRow(65).getCell(4).getNumericCellValue()));
			setCD231(new BigDecimal(firstSheet.getRow(65).getCell(6).getNumericCellValue()));
			setCD232LY(new BigDecimal(firstSheet.getRow(66).getCell(4).getNumericCellValue()));
			setCD232(new BigDecimal(firstSheet.getRow(66).getCell(6).getNumericCellValue()));
			setCD240LY(new BigDecimal(firstSheet.getRow(67).getCell(4).getNumericCellValue()));
			setCD240(new BigDecimal(firstSheet.getRow(67).getCell(6).getNumericCellValue()));
			setCD241LY(new BigDecimal(firstSheet.getRow(68).getCell(4).getNumericCellValue()));
			setCD241(new BigDecimal(firstSheet.getRow(68).getCell(6).getNumericCellValue()));
			setCD242LY(new BigDecimal(firstSheet.getRow(69).getCell(4).getNumericCellValue()));
			setCD242(new BigDecimal(firstSheet.getRow(69).getCell(6).getNumericCellValue()));
			setCD250LY(new BigDecimal(firstSheet.getRow(70).getCell(4).getNumericCellValue()));
			setCD250(new BigDecimal(firstSheet.getRow(70).getCell(6).getNumericCellValue()));
			setCD251LY(new BigDecimal(firstSheet.getRow(71).getCell(4).getNumericCellValue()));
			setCD251(new BigDecimal(firstSheet.getRow(71).getCell(6).getNumericCellValue()));
			setCD252LY(new BigDecimal(firstSheet.getRow(72).getCell(4).getNumericCellValue()));
			setCD252(new BigDecimal(firstSheet.getRow(72).getCell(6).getNumericCellValue()));
			setCD253LY(new BigDecimal(firstSheet.getRow(73).getCell(4).getNumericCellValue()));
			setCD253(new BigDecimal(firstSheet.getRow(73).getCell(6).getNumericCellValue()));
			setCD254LY(new BigDecimal(firstSheet.getRow(74).getCell(4).getNumericCellValue()));
			setCD254(new BigDecimal(firstSheet.getRow(74).getCell(6).getNumericCellValue()));
			setCD255LY(new BigDecimal(firstSheet.getRow(75).getCell(4).getNumericCellValue()));
			setCD255(new BigDecimal(firstSheet.getRow(75).getCell(6).getNumericCellValue()));
			setCD260LY(new BigDecimal(firstSheet.getRow(76).getCell(4).getNumericCellValue()));
			setCD260(new BigDecimal(firstSheet.getRow(76).getCell(6).getNumericCellValue()));
			setCD261LY(new BigDecimal(firstSheet.getRow(77).getCell(4).getNumericCellValue()));
			setCD261(new BigDecimal(firstSheet.getRow(77).getCell(6).getNumericCellValue()));
			setCD262LY(new BigDecimal(firstSheet.getRow(78).getCell(4).getNumericCellValue()));
			setCD262(new BigDecimal(firstSheet.getRow(78).getCell(6).getNumericCellValue()));
			setCD263LY(new BigDecimal(firstSheet.getRow(79).getCell(4).getNumericCellValue()));
			setCD263(new BigDecimal(firstSheet.getRow(79).getCell(6).getNumericCellValue()));
			setCD268LY(new BigDecimal(firstSheet.getRow(80).getCell(4).getNumericCellValue()));
			setCD268(new BigDecimal(firstSheet.getRow(80).getCell(6).getNumericCellValue()));
			setCD269LY(new BigDecimal(firstSheet.getRow(81).getCell(4).getNumericCellValue()));
			setCD269(new BigDecimal(firstSheet.getRow(81).getCell(6).getNumericCellValue()));
			setCD270LY(new BigDecimal(firstSheet.getRow(82).getCell(4).getNumericCellValue()));
			setCD270(new BigDecimal(firstSheet.getRow(82).getCell(6).getNumericCellValue()));

			setCD300LY(new BigDecimal(firstSheet.getRow(85).getCell(4).getNumericCellValue()));
			setCD300(new BigDecimal(firstSheet.getRow(85).getCell(6).getNumericCellValue()));
			setCD310LY(new BigDecimal(firstSheet.getRow(86).getCell(4).getNumericCellValue()));
			setCD310(new BigDecimal(firstSheet.getRow(86).getCell(6).getNumericCellValue()));
			setCD311LY(new BigDecimal(firstSheet.getRow(87).getCell(4).getNumericCellValue()));
			setCD311(new BigDecimal(firstSheet.getRow(87).getCell(6).getNumericCellValue()));
			setCD312LY(new BigDecimal(firstSheet.getRow(88).getCell(4).getNumericCellValue()));
			setCD312(new BigDecimal(firstSheet.getRow(88).getCell(6).getNumericCellValue()));
			setCD313LY(new BigDecimal(firstSheet.getRow(89).getCell(4).getNumericCellValue()));
			setCD313(new BigDecimal(firstSheet.getRow(89).getCell(6).getNumericCellValue()));
			setCD314LY(new BigDecimal(firstSheet.getRow(90).getCell(4).getNumericCellValue()));
			setCD314(new BigDecimal(firstSheet.getRow(90).getCell(6).getNumericCellValue()));
			setCD315LY(new BigDecimal(firstSheet.getRow(91).getCell(4).getNumericCellValue()));
			setCD315(new BigDecimal(firstSheet.getRow(91).getCell(6).getNumericCellValue()));
			setCD316LY(new BigDecimal(firstSheet.getRow(92).getCell(4).getNumericCellValue()));
			setCD316(new BigDecimal(firstSheet.getRow(92).getCell(6).getNumericCellValue()));
			setCD317LY(new BigDecimal(firstSheet.getRow(93).getCell(4).getNumericCellValue()));
			setCD317(new BigDecimal(firstSheet.getRow(93).getCell(6).getNumericCellValue()));
			setCD318LY(new BigDecimal(firstSheet.getRow(94).getCell(4).getNumericCellValue()));
			setCD318(new BigDecimal(firstSheet.getRow(94).getCell(6).getNumericCellValue()));
			setCD319LY(new BigDecimal(firstSheet.getRow(95).getCell(4).getNumericCellValue()));
			setCD319(new BigDecimal(firstSheet.getRow(95).getCell(6).getNumericCellValue()));
			setCD320LY(new BigDecimal(firstSheet.getRow(96).getCell(4).getNumericCellValue()));
			setCD320(new BigDecimal(firstSheet.getRow(96).getCell(6).getNumericCellValue()));
			setCD321LY(new BigDecimal(firstSheet.getRow(97).getCell(4).getNumericCellValue()));
			setCD321(new BigDecimal(firstSheet.getRow(97).getCell(6).getNumericCellValue()));
			setCD322LY(new BigDecimal(firstSheet.getRow(98).getCell(4).getNumericCellValue()));
			setCD322(new BigDecimal(firstSheet.getRow(98).getCell(6).getNumericCellValue()));
			setCD323LY(new BigDecimal(firstSheet.getRow(99).getCell(4).getNumericCellValue()));
			setCD323(new BigDecimal(firstSheet.getRow(99).getCell(6).getNumericCellValue()));
			setCD324LY(new BigDecimal(firstSheet.getRow(100).getCell(4).getNumericCellValue()));
			setCD324(new BigDecimal(firstSheet.getRow(100).getCell(6).getNumericCellValue()));
			setCD330LY(new BigDecimal(firstSheet.getRow(101).getCell(4).getNumericCellValue()));
			setCD330(new BigDecimal(firstSheet.getRow(101).getCell(6).getNumericCellValue()));
			setCD331LY(new BigDecimal(firstSheet.getRow(102).getCell(4).getNumericCellValue()));
			setCD331(new BigDecimal(firstSheet.getRow(102).getCell(6).getNumericCellValue()));
			setCD332LY(new BigDecimal(firstSheet.getRow(103).getCell(4).getNumericCellValue()));
			setCD332(new BigDecimal(firstSheet.getRow(103).getCell(6).getNumericCellValue()));
			setCD333LY(new BigDecimal(firstSheet.getRow(104).getCell(4).getNumericCellValue()));
			setCD333(new BigDecimal(firstSheet.getRow(104).getCell(6).getNumericCellValue()));
			setCD334LY(new BigDecimal(firstSheet.getRow(105).getCell(4).getNumericCellValue()));
			setCD334(new BigDecimal(firstSheet.getRow(105).getCell(6).getNumericCellValue()));
			setCD335LY(new BigDecimal(firstSheet.getRow(106).getCell(4).getNumericCellValue()));
			setCD335(new BigDecimal(firstSheet.getRow(106).getCell(6).getNumericCellValue()));
			setCD336LY(new BigDecimal(firstSheet.getRow(107).getCell(4).getNumericCellValue()));
			setCD336(new BigDecimal(firstSheet.getRow(107).getCell(6).getNumericCellValue()));
			setCD337LY(new BigDecimal(firstSheet.getRow(108).getCell(4).getNumericCellValue()));
			setCD337(new BigDecimal(firstSheet.getRow(108).getCell(6).getNumericCellValue()));
			setCD338LY(new BigDecimal(firstSheet.getRow(109).getCell(4).getNumericCellValue()));
			setCD338(new BigDecimal(firstSheet.getRow(109).getCell(6).getNumericCellValue()));
			setCD339LY(new BigDecimal(firstSheet.getRow(110).getCell(4).getNumericCellValue()));
			setCD339(new BigDecimal(firstSheet.getRow(110).getCell(6).getNumericCellValue()));
			setCD340LY(new BigDecimal(firstSheet.getRow(111).getCell(4).getNumericCellValue()));
			setCD340(new BigDecimal(firstSheet.getRow(111).getCell(6).getNumericCellValue()));
			setCD341LY(new BigDecimal(firstSheet.getRow(112).getCell(4).getNumericCellValue()));
			setCD341(new BigDecimal(firstSheet.getRow(112).getCell(6).getNumericCellValue()));
			setCD342LY(new BigDecimal(firstSheet.getRow(113).getCell(4).getNumericCellValue()));
			setCD342(new BigDecimal(firstSheet.getRow(113).getCell(6).getNumericCellValue()));
			setCD343LY(new BigDecimal(firstSheet.getRow(114).getCell(4).getNumericCellValue()));
			setCD343(new BigDecimal(firstSheet.getRow(114).getCell(6).getNumericCellValue()));
			setCD400LY(new BigDecimal(firstSheet.getRow(115).getCell(4).getNumericCellValue()));
			setCD400(new BigDecimal(firstSheet.getRow(115).getCell(6).getNumericCellValue()));
			setCD410LY(new BigDecimal(firstSheet.getRow(116).getCell(4).getNumericCellValue()));
			setCD410(new BigDecimal(firstSheet.getRow(116).getCell(6).getNumericCellValue()));
			setCD411LY(new BigDecimal(firstSheet.getRow(117).getCell(4).getNumericCellValue()));
			setCD411(new BigDecimal(firstSheet.getRow(117).getCell(6).getNumericCellValue()));
			setCD411aLY(new BigDecimal(firstSheet.getRow(118).getCell(4).getNumericCellValue()));
			setCD411a(new BigDecimal(firstSheet.getRow(118).getCell(6).getNumericCellValue()));
			setCD411bLY(new BigDecimal(firstSheet.getRow(119).getCell(4).getNumericCellValue()));
			setCD411b(new BigDecimal(firstSheet.getRow(119).getCell(6).getNumericCellValue()));
			setCD412LY(new BigDecimal(firstSheet.getRow(120).getCell(4).getNumericCellValue()));
			setCD412(new BigDecimal(firstSheet.getRow(120).getCell(6).getNumericCellValue()));
			setCD413LY(new BigDecimal(firstSheet.getRow(121).getCell(4).getNumericCellValue()));
			setCD413(new BigDecimal(firstSheet.getRow(121).getCell(6).getNumericCellValue()));
			setCD414LY(new BigDecimal(firstSheet.getRow(122).getCell(4).getNumericCellValue()));
			setCD414(new BigDecimal(firstSheet.getRow(122).getCell(6).getNumericCellValue()));
			setCD415LY(new BigDecimal(firstSheet.getRow(123).getCell(4).getNumericCellValue()));
			setCD415(new BigDecimal(firstSheet.getRow(123).getCell(6).getNumericCellValue()));
			setCD416LY(new BigDecimal(firstSheet.getRow(124).getCell(4).getNumericCellValue()));
			setCD416(new BigDecimal(firstSheet.getRow(124).getCell(6).getNumericCellValue()));
			setCD417LY(new BigDecimal(firstSheet.getRow(125).getCell(4).getNumericCellValue()));
			setCD417(new BigDecimal(firstSheet.getRow(125).getCell(6).getNumericCellValue()));
			setCD418LY(new BigDecimal(firstSheet.getRow(126).getCell(4).getNumericCellValue()));
			setCD418(new BigDecimal(firstSheet.getRow(126).getCell(6).getNumericCellValue()));
			setCD419LY(new BigDecimal(firstSheet.getRow(127).getCell(4).getNumericCellValue()));
			setCD419(new BigDecimal(firstSheet.getRow(127).getCell(6).getNumericCellValue()));
			setCD420LY(new BigDecimal(firstSheet.getRow(128).getCell(4).getNumericCellValue()));
			setCD420(new BigDecimal(firstSheet.getRow(128).getCell(6).getNumericCellValue()));
			setCD421LY(new BigDecimal(firstSheet.getRow(129).getCell(4).getNumericCellValue()));
			setCD421(new BigDecimal(firstSheet.getRow(129).getCell(6).getNumericCellValue()));
			setCD421aLY(new BigDecimal(firstSheet.getRow(130).getCell(4).getNumericCellValue()));
			setCD421a(new BigDecimal(firstSheet.getRow(130).getCell(6).getNumericCellValue()));
			setCD421bLY(new BigDecimal(firstSheet.getRow(131).getCell(4).getNumericCellValue()));
			setCD421b(new BigDecimal(firstSheet.getRow(131).getCell(6).getNumericCellValue()));
			setCD422LY(new BigDecimal(firstSheet.getRow(132).getCell(4).getNumericCellValue()));
			setCD422(new BigDecimal(firstSheet.getRow(132).getCell(6).getNumericCellValue()));
			setCD429LY(new BigDecimal(firstSheet.getRow(133).getCell(4).getNumericCellValue()));
			setCD429(new BigDecimal(firstSheet.getRow(133).getCell(6).getNumericCellValue()));
			setCD430LY(new BigDecimal(firstSheet.getRow(134).getCell(4).getNumericCellValue()));
			setCD430(new BigDecimal(firstSheet.getRow(134).getCell(6).getNumericCellValue()));
			setCD431LY(new BigDecimal(firstSheet.getRow(135).getCell(4).getNumericCellValue()));
			setCD431(new BigDecimal(firstSheet.getRow(135).getCell(6).getNumericCellValue()));
			setCD432LY(new BigDecimal(firstSheet.getRow(136).getCell(4).getNumericCellValue()));
			setCD432(new BigDecimal(firstSheet.getRow(136).getCell(6).getNumericCellValue()));
			setCD440LY(new BigDecimal(firstSheet.getRow(137).getCell(4).getNumericCellValue()));
			setCD440(new BigDecimal(firstSheet.getRow(137).getCell(6).getNumericCellValue()));

			setKQ01LY(new BigDecimal(firstSheet.getRow(142).getCell(4).getNumericCellValue()));
			setKQ01(new BigDecimal(firstSheet.getRow(142).getCell(6).getNumericCellValue()));
			setKQ02LY(new BigDecimal(firstSheet.getRow(143).getCell(4).getNumericCellValue()));
			setKQ02(new BigDecimal(firstSheet.getRow(143).getCell(6).getNumericCellValue()));
			setKQ10LY(new BigDecimal(firstSheet.getRow(144).getCell(4).getNumericCellValue()));
			setKQ10(new BigDecimal(firstSheet.getRow(144).getCell(6).getNumericCellValue()));
			setKQ11LY(new BigDecimal(firstSheet.getRow(145).getCell(4).getNumericCellValue()));
			setKQ11(new BigDecimal(firstSheet.getRow(145).getCell(6).getNumericCellValue()));
			setKQ20LY(new BigDecimal(firstSheet.getRow(146).getCell(4).getNumericCellValue()));
			setKQ20(new BigDecimal(firstSheet.getRow(146).getCell(6).getNumericCellValue()));
			setKQ21LY(new BigDecimal(firstSheet.getRow(147).getCell(4).getNumericCellValue()));
			setKQ21(new BigDecimal(firstSheet.getRow(147).getCell(6).getNumericCellValue()));
			setKQ22LY(new BigDecimal(firstSheet.getRow(148).getCell(4).getNumericCellValue()));
			setKQ22(new BigDecimal(firstSheet.getRow(148).getCell(6).getNumericCellValue()));
			setKQ23LY(new BigDecimal(firstSheet.getRow(149).getCell(4).getNumericCellValue()));
			setKQ23(new BigDecimal(firstSheet.getRow(149).getCell(6).getNumericCellValue()));
			setKQ24LY(new BigDecimal(firstSheet.getRow(150).getCell(4).getNumericCellValue()));
			setKQ24(new BigDecimal(firstSheet.getRow(150).getCell(6).getNumericCellValue()));
			setKQ25LY(new BigDecimal(firstSheet.getRow(151).getCell(4).getNumericCellValue()));
			setKQ25(new BigDecimal(firstSheet.getRow(151).getCell(6).getNumericCellValue()));
			setKQ26LY(new BigDecimal(firstSheet.getRow(152).getCell(4).getNumericCellValue()));
			setKQ26(new BigDecimal(firstSheet.getRow(152).getCell(6).getNumericCellValue()));
			setKQ30LY(new BigDecimal(firstSheet.getRow(153).getCell(4).getNumericCellValue()));
			setKQ30(new BigDecimal(firstSheet.getRow(153).getCell(6).getNumericCellValue()));
			setKQ31LY(new BigDecimal(firstSheet.getRow(154).getCell(4).getNumericCellValue()));
			setKQ31(new BigDecimal(firstSheet.getRow(154).getCell(6).getNumericCellValue()));
			setKQ32LY(new BigDecimal(firstSheet.getRow(155).getCell(4).getNumericCellValue()));
			setKQ32(new BigDecimal(firstSheet.getRow(155).getCell(6).getNumericCellValue()));
			setKQ40LY(new BigDecimal(firstSheet.getRow(156).getCell(4).getNumericCellValue()));
			setKQ40(new BigDecimal(firstSheet.getRow(156).getCell(6).getNumericCellValue()));
			setKQ50LY(new BigDecimal(firstSheet.getRow(157).getCell(4).getNumericCellValue()));
			setKQ50(new BigDecimal(firstSheet.getRow(157).getCell(6).getNumericCellValue()));
			setKQ51LY(new BigDecimal(firstSheet.getRow(158).getCell(4).getNumericCellValue()));
			setKQ51(new BigDecimal(firstSheet.getRow(158).getCell(6).getNumericCellValue()));
			setKQ52LY(new BigDecimal(firstSheet.getRow(159).getCell(4).getNumericCellValue()));
			setKQ52(new BigDecimal(firstSheet.getRow(159).getCell(6).getNumericCellValue()));
			setKQ60LY(new BigDecimal(firstSheet.getRow(160).getCell(4).getNumericCellValue()));
			setKQ60(new BigDecimal(firstSheet.getRow(160).getCell(6).getNumericCellValue()));
			setKQ61LY(new BigDecimal(firstSheet.getRow(161).getCell(4).getNumericCellValue()));
			setKQ61(new BigDecimal(firstSheet.getRow(161).getCell(6).getNumericCellValue()));
			setKQ62LY(new BigDecimal(firstSheet.getRow(162).getCell(4).getNumericCellValue()));
			setKQ62(new BigDecimal(firstSheet.getRow(162).getCell(6).getNumericCellValue()));
			setKQ70LY(new BigDecimal(firstSheet.getRow(163).getCell(4).getNumericCellValue()));
			setKQ70(new BigDecimal(firstSheet.getRow(163).getCell(6).getNumericCellValue()));
			setKQ71LY(new BigDecimal(firstSheet.getRow(164).getCell(4).getNumericCellValue()));
			setKQ71(new BigDecimal(firstSheet.getRow(164).getCell(6).getNumericCellValue()));
			setLTC_20LY(new BigDecimal(firstSheet.getRow(168).getCell(4).getNumericCellValue()));
			setLTC_20(new BigDecimal(firstSheet.getRow(168).getCell(6).getNumericCellValue()));

			setYear_Report(String.valueOf((int)firstSheet.getRow(11).getCell(6).getNumericCellValue()));
			
			setYear_Report_Ly(String.valueOf((int)firstSheet.getRow(11).getCell(6).getNumericCellValue()-1));
		
		} catch (Exception e) {
			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_NUMBER);
		}
		if (error != "") {
			throw new IllegalArgumentException(error);
		}
//		mbctc.save();

		workbook.close();

		if (!getBCTC_B1_File().equalsIgnoreCase(getBCTC_B1_File().replace(" ", ""))) {
			// File (or directory) with old name
			File file1 = new File(getBCTC_B1_File());

			// File (or directory) with new name
			File file2 = new File(getBCTC_B1_File().replace(" ", ""));

			if (file2.exists())
				throw new java.io.IOException("file exists");

			// Rename file (or directory)
			file1.renameTo(file2);

			setBCTC_B1_File(file2.getAbsolutePath());
		}
		return mbctc;

	}

	private void validateCell() {
		// TODO Auto-generated method stub
		String error = "";
		try {
			if (validateBigDecimal(getCD100()) == -1 || validateBigDecimal(getCD100LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD100);
			}

			if (validateBigDecimal(getCD110()) == -1 || validateBigDecimal(getCD110LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD110);
			}

			if (validateBigDecimal(getCD111()) == -1 || validateBigDecimal(getCD111LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD111);
			}

			if (validateBigDecimal(getCD112()) == -1 || validateBigDecimal(getCD112LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD112);
			}

			if (validateBigDecimal(getCD120()) == -1 || validateBigDecimal(getCD120LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD120);
			}

			if (validateBigDecimal(getCD121()) == -1 || validateBigDecimal(getCD121LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD121);
			}

			if (validateBigDecimal(getCD122()) == 1 || validateBigDecimal(getCD122LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD122);
			}

			if (validateBigDecimal(getCD123()) == -1 || validateBigDecimal(getCD123LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD123);
			}

			if (validateBigDecimal(getCD130()) == -1 || validateBigDecimal(getCD130LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD130);
			}

			if (validateBigDecimal(getCD131()) == -1 || validateBigDecimal(getCD131LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD131);
			}

			if (validateBigDecimal(getCD132()) == -1 || validateBigDecimal(getCD132LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD132);
			}

			if (validateBigDecimal(getCD133()) == -1 || validateBigDecimal(getCD133LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD133);
			}

			if (validateBigDecimal(getCD134()) == -1 || validateBigDecimal(getCD134LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD134);
			}

			if (validateBigDecimal(getCD135()) == -1 || validateBigDecimal(getCD135LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD135);
			}

			if (validateBigDecimal(getCD136()) == -1 || validateBigDecimal(getCD136LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD136);
			}

			if (validateBigDecimal(getCD137()) == 1 || validateBigDecimal(getCD137LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD137);
			}

			if (validateBigDecimal(getCD139()) == -1 || validateBigDecimal(getCD139LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD139);
			}

			if (validateBigDecimal(getCD140()) == -1 || validateBigDecimal(getCD140LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD140);
			}

			if (validateBigDecimal(getCD141()) == -1 || validateBigDecimal(getCD141LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD141);
			}

			if (validateBigDecimal(getCD149()) == 1 || validateBigDecimal(getCD149LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD149);
			}

			if (validateBigDecimal(getCD150()) == -1 || validateBigDecimal(getCD150LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD150);
			}

			if (validateBigDecimal(getCD151()) == -1 || validateBigDecimal(getCD151LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD151);
			}

			if (validateBigDecimal(getCD152()) == -1 || validateBigDecimal(getCD152LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD152);
			}

			if (validateBigDecimal(getCD153()) == -1 || validateBigDecimal(getCD153LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD153);
			}

			if (validateBigDecimal(getCD154()) == -1 || validateBigDecimal(getCD154LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD154);
			}

			if (validateBigDecimal(getCD155()) == -1 || validateBigDecimal(getCD155LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD155);
			}

			if (validateBigDecimal(getCD200()) == -1 || validateBigDecimal(getCD200LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD200);
			}

			if (validateBigDecimal(getCD210()) == -1 || validateBigDecimal(getCD210LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD210);
			}

			if (validateBigDecimal(getCD211()) == -1 || validateBigDecimal(getCD211LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD211);
			}

			if (validateBigDecimal(getCD212()) == -1 || validateBigDecimal(getCD212LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD212);
			}

			if (validateBigDecimal(getCD213()) == -1 || validateBigDecimal(getCD213LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD213);
			}

			if (validateBigDecimal(getCD214()) == -1 || validateBigDecimal(getCD214LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD214);
			}
			if (validateBigDecimal(getCD215()) == -1 || validateBigDecimal(getCD215LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD215);
			}
			if (validateBigDecimal(getCD216()) == -1 || validateBigDecimal(getCD216LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD216);
			}
			if (validateBigDecimal(getCD219()) == 1 || validateBigDecimal(getCD219LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD219);
			}
			if (validateBigDecimal(getCD220()) == -1 || validateBigDecimal(getCD220LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD220);
			}
			if (validateBigDecimal(getCD221()) == -1 || validateBigDecimal(getCD221LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD221);
			}
			if (validateBigDecimal(getCD222()) == -1 || validateBigDecimal(getCD222LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD222);
			}
			if (validateBigDecimal(getCD223()) == 1 || validateBigDecimal(getCD223LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD223);
			}
			if (validateBigDecimal(getCD224()) == -1 || validateBigDecimal(getCD224LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD224);
			}
			if (validateBigDecimal(getCD225()) == -1 || validateBigDecimal(getCD225LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD225);
			}
			if (validateBigDecimal(getCD226()) == 1 || validateBigDecimal(getCD226LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD226);
			}
			if (validateBigDecimal(getCD227()) == -1 || validateBigDecimal(getCD227LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD227);
			}
			if (validateBigDecimal(getCD228()) == -1 || validateBigDecimal(getCD228LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD228);
			}
			if (validateBigDecimal(getCD229()) == 1 || validateBigDecimal(getCD229LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD229);
			}
			if (validateBigDecimal(getCD230()) == -1 || validateBigDecimal(getCD230LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD230);
			}
			if (validateBigDecimal(getCD231()) == -1 || validateBigDecimal(getCD231LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD231);
			}
			if (validateBigDecimal(getCD232()) == 1 || validateBigDecimal(getCD232LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD232);
			}
			if (validateBigDecimal(getCD240()) == -1 || validateBigDecimal(getCD240LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD240);
			}
			if (validateBigDecimal(getCD241()) == -1 || validateBigDecimal(getCD241LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD241);
			}
			if (validateBigDecimal(getCD242()) == -1 || validateBigDecimal(getCD242LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD242);
			}
			if (validateBigDecimal(getCD250()) == -1 || validateBigDecimal(getCD250LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD250);
			}
			if (validateBigDecimal(getCD251()) == -1 || validateBigDecimal(getCD251LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD251);
			}
			if (validateBigDecimal(getCD252()) == -1 || validateBigDecimal(getCD252LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD252);
			}
			if (validateBigDecimal(getCD253()) == -1 || validateBigDecimal(getCD253LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD253);
			}
			if (validateBigDecimal(getCD254()) == 1 || validateBigDecimal(getCD254LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD254);
			}
			if (validateBigDecimal(getCD255()) == -1 || validateBigDecimal(getCD255LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD255);
			}
			if (validateBigDecimal(getCD260()) == -1 || validateBigDecimal(getCD260LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD260);
			}
			if (validateBigDecimal(getCD261()) == -1 || validateBigDecimal(getCD261LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD261);
			}
			if (validateBigDecimal(getCD262()) == -1 || validateBigDecimal(getCD262LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD262);
			}
			if (validateBigDecimal(getCD263()) == -1 || validateBigDecimal(getCD263LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD263);
			}
			if (validateBigDecimal(getCD268()) == -1 || validateBigDecimal(getCD268LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD268);
			}
//		if (validateBigDecimal(80) == -1
//				|| validateBigDecimal(80) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD269);
//		}
			if (validateBigDecimal(getCD270()) == -1 || validateBigDecimal(getCD270LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD270);
			}
			if (validateBigDecimal(getCD300()) == -1 || validateBigDecimal(getCD300LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD300);
			}
			if (validateBigDecimal(getCD310()) == -1 || validateBigDecimal(getCD310LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD310);
			}
			if (validateBigDecimal(getCD311()) == -1 || validateBigDecimal(getCD311LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD311);
			}
			if (validateBigDecimal(getCD312()) == -1 || validateBigDecimal(getCD312LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD312);
			}
//		if (validateBigDecimal(88) == -1
//				|| validateBigDecimal(88) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD313);
//		}
			if (validateBigDecimal(getCD314()) == -1 || validateBigDecimal(getCD314LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD314);
			}
			if (validateBigDecimal(getCD315()) == -1 || validateBigDecimal(getCD315LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD315);
			}
			if (validateBigDecimal(getCD316()) == -1 || validateBigDecimal(getCD316LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD316);
			}
			if (validateBigDecimal(getCD317()) == -1 || validateBigDecimal(getCD317LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD317);
			}
			if (validateBigDecimal(getCD318()) == -1 || validateBigDecimal(getCD318LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD318);
			}
			if (validateBigDecimal(getCD319()) == -1 || validateBigDecimal(getCD319LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD319);
			}
			if (validateBigDecimal(getCD320()) == -1 || validateBigDecimal(getCD320LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD320);
			}
			if (validateBigDecimal(getCD321()) == -1 || validateBigDecimal(getCD321LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD321);
			}
			if (validateBigDecimal(getCD322()) == -1 || validateBigDecimal(getCD322LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD322);
			}
			if (validateBigDecimal(getCD324()) == -1 || validateBigDecimal(getCD324LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD324);
			}
			if (validateBigDecimal(getCD330()) == -1 || validateBigDecimal(getCD330LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD330);
			}
			if (validateBigDecimal(getCD331()) == -1 || validateBigDecimal(getCD331LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD331);
			}
			if (validateBigDecimal(getCD332()) == -1 || validateBigDecimal(getCD332LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD332);
			}
			if (validateBigDecimal(getCD333()) == -1 || validateBigDecimal(getCD333LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD333);
			}
			if (validateBigDecimal(getCD334()) == -1 || validateBigDecimal(getCD334LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD334);
			}
			if (validateBigDecimal(getCD335()) == -1 || validateBigDecimal(getCD335LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD335);
			}
			if (validateBigDecimal(getCD336()) == -1 || validateBigDecimal(getCD336LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD336);
			}
//		if (validateBigDecimal(107) == -1
//				|| validateBigDecimal(107) == -1) {
//			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD337);
//		}
			if (validateBigDecimal(getCD338()) == -1 || validateBigDecimal(getCD338LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD338);
			}
			if (validateBigDecimal(getCD339()) == -1 || validateBigDecimal(getCD339LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD339);
			}
			if (validateBigDecimal(getCD340()) == -1 || validateBigDecimal(getCD340LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD340);
			}
			if (validateBigDecimal(getCD341()) == -1 || validateBigDecimal(getCD341LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD341);
			}
			if (validateBigDecimal(getCD342()) == -1 || validateBigDecimal(getCD342LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD342);
			}
			if (validateBigDecimal(getCD343()) == -1 || validateBigDecimal(getCD343LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD343);
			}
			if (validateBigDecimal(getCD411()) == -1 || validateBigDecimal(getCD411LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411);
			}
			if (validateBigDecimal(getCD411a()) == -1 || validateBigDecimal(getCD411aLY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411a);
			}
			if (validateBigDecimal(getCD411b()) == -1 || validateBigDecimal(getCD411bLY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD411b);
			}

			if (validateBigDecimal(getCD413()) == -1 || validateBigDecimal(getCD413LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD413);
			}
			if (validateBigDecimal(getCD414()) == -1 || validateBigDecimal(getCD414LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD414);
			}
			if (validateBigDecimal(getCD415()) == 1 || validateBigDecimal(getCD415LY()) == 1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD415);
			}
			if (validateBigDecimal(getCD418()) == -1 || validateBigDecimal(getCD418LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD418);
			}
			if (validateBigDecimal(getCD419()) == -1 || validateBigDecimal(getCD419LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD419);
			}
			if (validateBigDecimal(getCD420()) == -1 || validateBigDecimal(getCD420LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD420);
			}
			if (validateBigDecimal(getCD422()) == -1 || validateBigDecimal(getCD422LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD422);
			}
			if (validateBigDecimal(getCD429()) == -1 || validateBigDecimal(getCD429LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD429);
			}
			if (validateBigDecimal(getCD430()) == -1 || validateBigDecimal(getCD430LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD430);
			}
			if (validateBigDecimal(getCD431()) == -1 || validateBigDecimal(getCD431LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD431);
			}
			if (validateBigDecimal(getCD432()) == -1 || validateBigDecimal(getCD432LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD432);
			}
			if (validateBigDecimal(getCD440()) == -1 || validateBigDecimal(getCD440LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD440);
			}
			if (validateBigDecimal(getKQ01()) == -1 || validateBigDecimal(getKQ01LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ01);
			}
			if (validateBigDecimal(getKQ02()) == -1 || validateBigDecimal(getKQ02LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ02);
			}
			if (validateBigDecimal(getKQ10()) == -1 || validateBigDecimal(getKQ10LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ10);
			}
			if (validateBigDecimal(getKQ11()) == -1 || validateBigDecimal(getKQ11LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ11);
			}
			if (validateBigDecimal(getKQ21()) == -1 || validateBigDecimal(getKQ21LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ21);
			}
			if (validateBigDecimal(getKQ31()) == -1 || validateBigDecimal(getKQ31LY()) == -1) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ31);
			}
		} catch (Exception e) {
			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_NUMBER);
		}
		if (error != "") {
			throw new IllegalArgumentException(error);
		}
	}

	private void validateCellNull() {
		// TODO Auto-generated method stub
		String error = "";
		try {
			if (ValidateUtil.isCheckStringNull(getYear_Report_Ly())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_YEAR_LY);
			}
			if (ValidateUtil.isCheckStringNull(getYear_Report())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_YEAR_NULL);
			}
			if (ValidateUtil.isBigThan(getCD122()) || ValidateUtil.isBigThan(getCD122LY())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD122_NULL);
			}
			if (ValidateUtil.isBigThan(getCD137()) || ValidateUtil.isBigThan(getCD137LY())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD137_NULL);
			}
			if (ValidateUtil.isBigThan((getCD149())) || ValidateUtil.isBigThan((getCD149LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD149_NULL);
			}
			if (ValidateUtil.isBigThan((getCD219())) || ValidateUtil.isBigThan((getCD219LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD219_NULL);
			}
			if (ValidateUtil.isBigThan((getCD223())) || ValidateUtil.isBigThan((getCD223LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD223_NULL);
			}
			if (ValidateUtil.isBigThan((getCD226())) || ValidateUtil.isBigThan((getCD226LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD226_NULL);
			}
			if (ValidateUtil.isBigThan((getCD229())) || ValidateUtil.isBigThan((getCD229LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD229_NULL);
			}
			if (ValidateUtil.isBigThan((getCD232())) || ValidateUtil.isBigThan((getCD232LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD232_NULL);
			}
			if (ValidateUtil.isBigThan((getCD254())) || ValidateUtil.isBigThan((getCD254LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD254_NULL);
			}
			if (ValidateUtil.isBigThan((getCD415())) || ValidateUtil.isBigThan((getCD415LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CD415_NULL);
			}
			if (ValidateUtil.isBigThan((getKQ70())) || ValidateUtil.isBigThan((getKQ70LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ70_NULL);
			}
			if (ValidateUtil.isBigThan((getKQ71())) || ValidateUtil.isBigThan((getKQ71LY()))) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KQ71_NULL);
			}

			if (error != "") {
				throw new IllegalArgumentException(error);
			}
		} catch (Exception e) {
			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_NUMBER);
		}
	}

	private void setValueCell() {
		// TODO Auto-generated method stub
		// set gia tri nam hien tai

		setCD110(getCD111().add(getCD112()));
		setCD120(getCD121().add(getCD122()).add(getCD123()).add(getCD124()));
		setCD130(getCD131().add(getCD132()).add(getCD133()).add(getCD134()).add(getCD135()).add(getCD136())
				.add(getCD137()).add(getCD139()));
		setCD140(getCD141().add(getCD149()));
		setCD150(getCD151().add(getCD152()).add(getCD153()).add(getCD154()).add(getCD155()));
		setCD100(getCD110().add(getCD120()).add(getCD130()).add(getCD140()).add(getCD150()));

//		setCD200(getCD210().add(getCD220()).add(getCD230()).add(getCD240()).add(getCD250()).add(getCD260()));
		setCD210(getCD211().add(getCD212()).add(getCD213()).add(getCD214()).add(getCD215()).add(getCD216())
				.add(getCD219()));

		setCD221(getCD222().add(getCD223()));
		setCD224(getCD225().add(getCD226()));
		setCD227(getCD228().add(getCD229()));
		setCD220(getCD221().add(getCD224()).add(getCD227()));
		setCD230(getCD231().add(getCD232()));
		setCD240(getCD241().add(getCD242()));
		setCD250(getCD251().add(getCD252()).add(getCD253()).add(getCD254()).add(getCD255()));
		setCD260(getCD261().add(getCD262()).add(getCD263()).add(getCD268()).add(getCD269()));
		setCD200(getCD210().add(getCD220()).add(getCD230()).add(getCD240()).add(getCD250()).add(getCD260()));

		setCD270(getCD100().add(getCD200()));

		setCD310(getCD311().add(getCD312()).add(getCD313()).add(getCD314()).add(getCD315()).add(getCD316())
				.add(getCD317()).add(getCD318()).add(getCD319()).add(getCD320()).add(getCD321()).add(getCD322())
				.add(getCD323()).add(getCD324()));
		setCD330(getCD331().add(getCD332()).add(getCD333()).add(getCD334()).add(getCD335()).add(getCD336())
				.add(getCD337()).add(getCD338()).add(getCD339()).add(getCD340()).add(getCD341()).add(getCD342())
				.add(getCD343()));
		setCD300(getCD310().add(getCD330()));

		setCD411(getCD411a().add(getCD411b()));
		setCD421(getCD421a().add(getCD421b()));
		setCD410(getCD411().add(getCD412().add(getCD413()).add(getCD414()).add(getCD415()).add(getCD416())
				.add(getCD417()).add(getCD418()).add(getCD419()).add(getCD420())).add(getCD421().add(getCD429())));

		setCD430(getCD431().add(getCD432()));

		setCD400(getCD410().add(getCD430()));

		setCD440(getCD300().add(getCD400()));

		setKQ10(getKQ01().subtract(getKQ02()));
		setKQ20(getKQ10().subtract(getKQ11()));
		setKQ30((getKQ20().add(getKQ21().subtract(getKQ22()))).subtract(getKQ25().add(getKQ26())));
		setKQ40(getKQ31().subtract(getKQ32()));
		setKQ50(getKQ30().add(getKQ40()));
		setKQ60((getKQ50().subtract(getKQ51())).subtract(getKQ52()));
		// set gia tri nam nay LCTT
		setLTC_20(getKQ60().add(getCD223().add(getCD226()).add(getCD229()).add(getCD232()))
				.subtract(getCD223LY().add(getCD226LY()).add(getCD229LY()).add(getCD232LY()))
				.subtract(getCD130().subtract(getCD130LY())).subtract(getCD140().subtract(getCD140LY()))
				.subtract(getCD150().subtract(getCD150LY())).add(getCD310().subtract(getCD320()))
				.subtract(getCD310LY().subtract(getCD320LY())));

		// set gia tri nam truoc
		setCD110LY(getCD111LY().add(getCD112LY()));
		setCD120LY(getCD121LY().add(getCD122LY()).add(getCD123LY()).add(getCD124LY()));
		setCD130LY(getCD131LY().add(getCD132LY()).add(getCD133LY()).add(getCD134LY()).add(getCD135LY())
				.add(getCD136LY()).add(getCD137LY()).add(getCD139LY()));
		setCD140LY(getCD141LY().add(getCD149LY()));
		setCD150LY(getCD151LY().add(getCD152LY()).add(getCD153LY()).add(getCD154LY()).add(getCD155LY()));
		setCD100LY(getCD110LY().add(getCD120LY()).add(getCD130LY()).add(getCD140LY()).add(getCD150LY()));

//		setCD200LY(getCD210LY().add(getCD220LY()).add(getCD230LY()).add(getCD240LY()).add(getCD250LY()).add(getCD260LY()));
		setCD210LY(getCD211LY().add(getCD212LY()).add(getCD213LY()).add(getCD214LY()).add(getCD215LY())
				.add(getCD216LY()).add(getCD219LY()));

		setCD221LY(getCD222LY().add(getCD223LY()));
		setCD224LY(getCD225LY().add(getCD226LY()));
		setCD227LY(getCD228LY().add(getCD229LY()));
		setCD220LY(getCD221LY().add(getCD224LY()).add(getCD227LY()));
		setCD230LY(getCD231LY().add(getCD232LY()));
		setCD240LY(getCD241LY().add(getCD242LY()));
		setCD250LY(getCD251LY().add(getCD252LY()).add(getCD253LY()).add(getCD254LY()).add(getCD255LY()));
		setCD260LY(getCD261LY().add(getCD262LY()).add(getCD263LY()).add(getCD268LY()).add(getCD269LY()));

		setCD200LY(
				getCD210LY().add(getCD220LY()).add(getCD230LY()).add(getCD240LY()).add(getCD250LY()).add(getCD260LY()));

		setCD270LY(getCD100LY().add(getCD200LY()));

		setCD310LY(getCD311LY().add(getCD312LY()).add(getCD313LY()).add(getCD314LY()).add(getCD315LY())
				.add(getCD316LY()).add(getCD317LY()).add(getCD318LY()).add(getCD319LY()).add(getCD320LY())
				.add(getCD321LY()).add(getCD322LY()).add(getCD323LY()).add(getCD324LY()));
		setCD330LY(getCD331LY().add(getCD332LY()).add(getCD333LY()).add(getCD334LY()).add(getCD335LY())
				.add(getCD336LY()).add(getCD337LY()).add(getCD338LY()).add(getCD339LY()).add(getCD340LY())
				.add(getCD341LY()).add(getCD342LY()).add(getCD343LY()));
		setCD300LY(getCD310LY().add(getCD330LY()));

		setCD411LY(getCD411aLY().add(getCD411bLY()));
		setCD421LY(getCD421aLY().add(getCD421bLY()));

		setCD410LY(getCD411LY()
				.add(getCD412LY().add(getCD413LY()).add(getCD414LY()).add(getCD415LY()).add(getCD416LY())
						.add(getCD417LY()).add(getCD418LY()).add(getCD419LY()).add(getCD420LY()))
				.add(getCD421LY().add(getCD429LY())));

		setCD430LY(getCD431LY().add(getCD432LY()));
		setCD400LY(getCD410LY().add(getCD430LY()));

		setCD440LY(getCD300LY().add(getCD400LY()));

		setKQ10LY(getKQ01LY().subtract(getKQ02LY()));
		setKQ20LY(getKQ10LY().subtract(getKQ11LY()));
		setKQ30LY((getKQ20LY().add(getKQ21LY().subtract(getKQ22LY()))).subtract(getKQ25LY().add(getKQ26LY())));
		setKQ40LY(getKQ31LY().subtract(getKQ32LY()));
		setKQ50LY(getKQ30LY().add(getKQ40LY()));
		setKQ60LY((getKQ50LY().subtract(getKQ51LY())).subtract(getKQ52LY()));
		// set gia tri nam nay LCTT
		setLTC_20(getKQ60().add(getCD223().add(getCD226()).add(getCD229()).add(getCD232()))
				.subtract(getCD223LY().add(getCD226LY()).add(getCD229LY()).add(getCD232LY()))
				.subtract(getCD130().subtract(getCD130LY())).subtract(getCD140().subtract(getCD140LY()))
				.subtract(getCD150().subtract(getCD150LY())).add(getCD310().subtract(getCD320()))
				.subtract(getCD310LY().subtract(getCD320LY())));

		String error = "";
		if (getCD270().compareTo(getCD440()) != 0 || getCD270LY().compareTo(getCD440LY()) != 0) {
			error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_BCTC);
		}
		if (error != "") {
			throw new IllegalArgumentException(error);
		}
	}

}
