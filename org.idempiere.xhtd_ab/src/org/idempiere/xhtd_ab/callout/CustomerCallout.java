package org.idempiere.xhtd_ab.callout;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.apache.log4j.Logger;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MCustomer;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MFinancialNon;
import org.idempiere.xhtd_ab.model.implement.MTDABWarning;

public class CustomerCallout implements IColumnCallout{
	Logger log = Logger.getLogger(this.getClass());
	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		return null;
	}
	
	

}
