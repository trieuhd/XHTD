package org.idempiere.xhtd_ab.process;

import java.util.Properties;

import org.compiere.model.PO;
import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.implement.MTDABBCTCTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABBusinessAreasTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABConfigValueTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOQL;
import org.idempiere.xhtd_ab.model.implement.MTDABLogistic;
import org.idempiere.xhtd_ab.model.implement.MTDABMedianMean;
import org.idempiere.xhtd_ab.model.implement.MTDABMinMax;
import org.idempiere.xhtd_ab.model.implement.MTDABNormalizedParameters;
import org.idempiere.xhtd_ab.model.implement.MTDABPCTQ;
import org.idempiere.xhtd_ab.model.implement.MTDABPTCCIC;
import org.idempiere.xhtd_ab.model.implement.MTDABPointRate;
import org.idempiere.xhtd_ab.model.implement.MTDABRating;
import org.idempiere.xhtd_ab.model.implement.MTDABWarningQuestionQL;
import org.idempiere.xhtd_ab.utils.Constants;

public class SubmitTarget extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		checkTableId(getCtx(), getTable_ID(), get_TrxName(), getRecord_ID());

		return null;
	}

	public static PO checkTableId(Properties getCtx, int tableId, String get_TrxName, int getRecord_ID) {
		if (tableId == MTDABMinMax.Table_ID) {
			MTDABMinMax mTDABMinMax = new MTDABMinMax(getCtx, getRecord_ID, get_TrxName);
			mTDABMinMax.setStatus_Check(Constants.CD);
			mTDABMinMax.setapproval("Y");
			mTDABMinMax.setsubmit("N");
			mTDABMinMax.save();
			return null;
		}
		if (tableId == MTDABMedianMean.Table_ID) {
			MTDABMedianMean mTDAB = new MTDABMedianMean(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABBCTCTQ.Table_ID) {
			MTDABBCTCTQ mTDAB = new MTDABBCTCTQ(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABBusinessAreasTQ.Table_ID) {
			MTDABBusinessAreasTQ mTDAB = new MTDABBusinessAreasTQ(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABConfigValueTQ.Table_ID) {
			MTDABConfigValueTQ mTDAB = new MTDABConfigValueTQ(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABDirectKOQL.Table_ID) {
			MTDABDirectKOQL mTDAB = new MTDABDirectKOQL(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABLogistic.Table_ID) {
			MTDABLogistic mTDAB = new MTDABLogistic(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABNormalizedParameters.Table_ID) {
			MTDABNormalizedParameters mTDAB = new MTDABNormalizedParameters(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABPCTQ.Table_ID) {
			MTDABPCTQ mTDAB = new MTDABPCTQ(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABPointRate.Table_ID) {
			MTDABPointRate mTDAB = new MTDABPointRate(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABPTCCIC.Table_ID) {
			MTDABPTCCIC mTDAB = new MTDABPTCCIC(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABRating.Table_ID) {
			MTDABRating mTDAB = new MTDABRating(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}
		if (tableId == MTDABWarningQuestionQL.Table_ID) {
			MTDABWarningQuestionQL mTDAB = new MTDABWarningQuestionQL(getCtx, getRecord_ID, get_TrxName);
			mTDAB.setStatus_Check(Constants.CD);
			mTDAB.setapproval("Y");
			mTDAB.setsubmit("N");
			mTDAB.save();
			return null;
		}

		return null;
	}

}
