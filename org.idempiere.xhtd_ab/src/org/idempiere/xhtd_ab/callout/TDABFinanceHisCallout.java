package org.idempiere.xhtd_ab.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.apache.log4j.Logger;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfo;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfoHistory;

public class TDABFinanceHisCallout implements IColumnCallout {
	Logger log = Logger.getLogger(this.getClass());

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		for (GridField fieldTab : mTab.getFields()) {
			//System.out.println("mFinInfo.set"+fieldTab.getColumnName()+"(mFin.get"+fieldTab.getColumnName()+"());");		
			if (fieldTab.getColumnName().equals("Btn_Download_BCTC")) {
				mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = false;
			} else {
				mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = true;
			}
			
		}
		return null;
	}
		
}
