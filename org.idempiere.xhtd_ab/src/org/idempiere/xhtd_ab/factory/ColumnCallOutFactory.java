package org.idempiere.xhtd_ab.factory;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.idempiere.xhtd_ab.callout.CustomerProfileCallout;
import org.idempiere.xhtd_ab.callout.CustomerScoreCallout;
import org.idempiere.xhtd_ab.callout.TDABFinanceCallout;
import org.idempiere.xhtd_ab.callout.TDABFinanceHisCallout;
import org.idempiere.xhtd_ab.callout.TDABKOFactorTargetCallOut;
import org.idempiere.xhtd_ab.callout.TDABNonFinanceCallout;
import org.idempiere.xhtd_ab.callout.TDABWarningCallOut;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfo;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfoHistory;
import org.idempiere.xhtd_ab.model.implement.MFinancialNon;
import org.idempiere.xhtd_ab.model.implement.MTDABKOFactorTarget;
import org.idempiere.xhtd_ab.model.implement.MTDABWarning;

public class ColumnCallOutFactory implements IColumnCalloutFactory {
	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		List<IColumnCallout> list = new ArrayList<IColumnCallout>();

		if (tableName.equalsIgnoreCase(MCustomerScore.Table_Name)) {
			list.add(new CustomerScoreCallout());
		}
		if (tableName.equalsIgnoreCase(MCustomerProfile.Table_Name)) {
			list.add(new CustomerProfileCallout());
		}
		if (tableName.equalsIgnoreCase(MTDABWarning.Table_Name)) {
			list.add(new TDABWarningCallOut());
		}
		if (tableName.equalsIgnoreCase(MTDABKOFactorTarget.Table_Name)) {
			list.add(new TDABKOFactorTargetCallOut());
		}
		if (tableName.equalsIgnoreCase(MFinancialNon.Table_Name)) {
			list.add(new TDABNonFinanceCallout());
			
//		}if (tableName.equalsIgnoreCase(MCustomer.Table_Name)) {
//			list.add(new CustomerCallout());
		}
		if (tableName.equalsIgnoreCase(MFinancialInfo.Table_Name)) {
			list.add(new TDABFinanceCallout());
		}
		if (tableName.equalsIgnoreCase(MFinancialInfoHistory.Table_Name)) {
			list.add(new TDABFinanceHisCallout());
		}


		return list != null ? list.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
