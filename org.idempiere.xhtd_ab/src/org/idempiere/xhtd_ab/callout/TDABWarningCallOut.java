package org.idempiere.xhtd_ab.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MTDABEarlyWarningQuestion;
import org.idempiere.xhtd_ab.model.implement.MTDABWarning;

public class TDABWarningCallOut implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		
		if (MTDABWarning.COLUMNNAME_Name_ID.equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MTDABEarlyWarningQuestion mTDABEarlyWarningQuestion = new MTDABEarlyWarningQuestion(ctx, Integer.valueOf(String.valueOf(value)), null);

			setWarning(mTab, mTDABEarlyWarningQuestion);
		}
		return null;
	}
	private void setWarning(GridTab mTab, MTDABEarlyWarningQuestion mWarning) {
		
		mTab.setValue(MTDABWarning.COLUMNNAME_Code, mWarning.getCode());
		mTab.setValue(MTDABWarning.COLUMNNAME_Warning_Question_Level, mWarning.getWarning_Question_Level());
		
	}
}
