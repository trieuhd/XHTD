package org.idempiere.xhtd_ab.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKO;
import org.idempiere.xhtd_ab.model.implement.MTDABKOFactorTarget;

public class TDABKOFactorTargetCallOut implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		if (MTDABKOFactorTarget.COLUMNNAME_Name_ID.equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MTDABDirectKO mTDABDirectKO = new MTDABDirectKO(ctx, Integer.valueOf(String.valueOf(value)), null);

			setKOFactor(mTab, mTDABDirectKO);
		}
		return null;
	}
	private void setKOFactor(GridTab mTab, MTDABDirectKO mTDABDirectKO) {
		
		mTab.setValue(MTDABKOFactorTarget.COLUMNNAME_Code, mTDABDirectKO.getCriteria_Code());
		mTab.setValue(MTDABKOFactorTarget.COLUMNNAME_Type_Answer, mTDABDirectKO.getType_Answer());
		mTab.setValue(MTDABKOFactorTarget.COLUMNNAME_Type_Answer, mTDABDirectKO.getType_Answer());
		
		
	}
}
