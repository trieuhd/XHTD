package org.idempiere.xhtd_ab.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.apache.log4j.Logger;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfo;

public class TDABFinanceCallout implements IColumnCallout {
	Logger log = Logger.getLogger(this.getClass());

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {

		if (mField.getColumnName().equalsIgnoreCase("Check_Upload_Excel")) {

			if (mField.getValue().equals(true)) {
				mTab.setValue(MFinancialInfo.COLUMNNAME_Check_Hand_Input, false);
				int i =1;
				for (GridField fieldTab : mTab.getFields()) {
					mTab.setValue(MFinancialInfo.COLUMNNAME_CD100, null);
//					System.out.println("mFinInfo.set"+fieldTab.getColumnName()+"(mFin.get"+fieldTab.getColumnName()+"());");
//					System.out.println("mFinancialHistory.set"+ fieldTab.getColumnName()+"(get"+fieldTab.getColumnName()+"());");
					if (fieldTab.getColumnName().equals("BCTC_B1_File")) {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = false;
					} else {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = true;
					}
					clearValue(mTab);
				}

			} else {
				mTab.setValue(MFinancialInfo.COLUMNNAME_Check_Hand_Input, true);
				for (GridField fieldTab : mTab.getFields()) {
					if (fieldTab.getColumnName().equals("BCTC_B1_File")) {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = true;
					} else {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = false;
					}
					clearValue(mTab);
				}
			}

		} else if (mField.getColumnName().equalsIgnoreCase("Check_Hand_Input")) {
			if (mField.getValue().equals(true)) {
				mTab.setValue(MFinancialInfo.COLUMNNAME_Check_Upload_Excel, false);
				mTab.setValue(MFinancialInfo.COLUMNNAME_BCTC_B1_File, null);
				for (GridField fieldTab : mTab.getFields()) {
					if (fieldTab.getColumnName().equals("BCTC_B1_File")) {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = true;
					} else {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = false;
					}
					clearValue(mTab);
				}
			} else {
				mTab.setValue(MFinancialInfo.COLUMNNAME_Check_Upload_Excel, true);
				for (GridField fieldTab : mTab.getFields()) {
					if (fieldTab.getColumnName().equals("BCTC_B1_File")) {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = false;
					} else {
						mTab.getField(fieldTab.getColumnName()).getVO().IsReadOnly = true;
					}
					clearValue(mTab);
				}
			}
		}
		mTab.getField("Check_Hand_Input").getVO().IsReadOnly = false;
		mTab.getField("Check_Upload_Excel").getVO().IsReadOnly = false;

		mTab.getField("CD100").getVO().IsReadOnly = true;
		mTab.getField("CD110").getVO().IsReadOnly = true;
		mTab.getField("CD120").getVO().IsReadOnly = true;
		mTab.getField("CD130").getVO().IsReadOnly = true;
		mTab.getField("CD140").getVO().IsReadOnly = true;
		mTab.getField("CD150").getVO().IsReadOnly = true;
		mTab.getField("CD200").getVO().IsReadOnly = true;
		mTab.getField("CD210").getVO().IsReadOnly = true;
		mTab.getField("CD220").getVO().IsReadOnly = true;
		mTab.getField("CD221").getVO().IsReadOnly = true;
		mTab.getField("CD224").getVO().IsReadOnly = true;
		mTab.getField("CD227").getVO().IsReadOnly = true;
		mTab.getField("CD230").getVO().IsReadOnly = true;
		mTab.getField("CD240").getVO().IsReadOnly = true;
		mTab.getField("CD250").getVO().IsReadOnly = true;
		mTab.getField("CD260").getVO().IsReadOnly = true;
		mTab.getField("CD270").getVO().IsReadOnly = true;
		mTab.getField("CD300").getVO().IsReadOnly = true;
		mTab.getField("CD310").getVO().IsReadOnly = true;
		mTab.getField("CD330").getVO().IsReadOnly = true;
		mTab.getField("CD400").getVO().IsReadOnly = true;
		mTab.getField("CD410").getVO().IsReadOnly = true;
		mTab.getField("CD411").getVO().IsReadOnly = true;
		mTab.getField("CD421").getVO().IsReadOnly = true;
		mTab.getField("CD430").getVO().IsReadOnly = true;
		mTab.getField("CD440").getVO().IsReadOnly = true;
		mTab.getField("KQ10").getVO().IsReadOnly = true;
		mTab.getField("KQ20").getVO().IsReadOnly = true;
		mTab.getField("KQ30").getVO().IsReadOnly = true;
		mTab.getField("KQ40").getVO().IsReadOnly = true;
		mTab.getField("KQ50").getVO().IsReadOnly = true;
		mTab.getField("KQ60").getVO().IsReadOnly = true;
		mTab.getField("LTC_20").getVO().IsReadOnly = true;
		mTab.getField("CD100LY").getVO().IsReadOnly = true;
		mTab.getField("CD110LY").getVO().IsReadOnly = true;
		mTab.getField("CD120LY").getVO().IsReadOnly = true;
		mTab.getField("CD130LY").getVO().IsReadOnly = true;
		mTab.getField("CD140LY").getVO().IsReadOnly = true;
		mTab.getField("CD150LY").getVO().IsReadOnly = true;
		mTab.getField("CD200LY").getVO().IsReadOnly = true;
		mTab.getField("CD210LY").getVO().IsReadOnly = true;
		mTab.getField("CD220LY").getVO().IsReadOnly = true;
		mTab.getField("CD221LY").getVO().IsReadOnly = true;
		mTab.getField("CD224LY").getVO().IsReadOnly = true;
		mTab.getField("CD227LY").getVO().IsReadOnly = true;
		mTab.getField("CD230LY").getVO().IsReadOnly = true;
		mTab.getField("CD240LY").getVO().IsReadOnly = true;
		mTab.getField("CD250LY").getVO().IsReadOnly = true;
		mTab.getField("CD260LY").getVO().IsReadOnly = true;
		mTab.getField("CD270LY").getVO().IsReadOnly = true;
		mTab.getField("CD300LY").getVO().IsReadOnly = true;
		mTab.getField("CD310LY").getVO().IsReadOnly = true;
		mTab.getField("CD330LY").getVO().IsReadOnly = true;
		mTab.getField("CD400LY").getVO().IsReadOnly = true;
		mTab.getField("CD410LY").getVO().IsReadOnly = true;
		mTab.getField("CD411LY").getVO().IsReadOnly = true;
		mTab.getField("CD421LY").getVO().IsReadOnly = true;
		mTab.getField("CD430LY").getVO().IsReadOnly = true;
		mTab.getField("CD440LY").getVO().IsReadOnly = true;
		mTab.getField("KQ10LY").getVO().IsReadOnly = true;
		mTab.getField("KQ20LY").getVO().IsReadOnly = true;
		mTab.getField("KQ30LY").getVO().IsReadOnly = true;
		mTab.getField("KQ40LY").getVO().IsReadOnly = true;
		mTab.getField("KQ50LY").getVO().IsReadOnly = true;
		mTab.getField("KQ60LY").getVO().IsReadOnly = true;
		
	
		return null;
	}

	public void clearValue(GridTab mTab) {
		mTab.setValue(MFinancialInfo.COLUMNNAME_Year_Report, null);
		mTab.setValue(MFinancialInfo.COLUMNNAME_Year_Report_Ly, null);

		mTab.setValue(MFinancialInfo.COLUMNNAME_CD100, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD100LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD110, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD110LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD111, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD111LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD112, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD112LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD120, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD120LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD121, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD121LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD122, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD122LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD123, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD123LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD124, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD124LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD130, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD130LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD131, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD131LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD132, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD132LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD133, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD133LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD134, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD134LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD135, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD135LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD136, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD136LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD137, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD137LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD139, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD139LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD140, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD140LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD141, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD141LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD149, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD149LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD150, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD150LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD151, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD151LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD152, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD152LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD153, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD153LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD154, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD154LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD155, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD155LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD200, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD200LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD210, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD210LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD211, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD211LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD212, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD212LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD213, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD213LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD214, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD214LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD215, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD215LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD216, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD216LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD219, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD219LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD220, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD220LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD221, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD221LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD222, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD222LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD223, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD223LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD224, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD224LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD225, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD225LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD226, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD226LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD227, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD227LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD228, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD228LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD229, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD229LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD230, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD230LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD231, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD231LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD232, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD232LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD240, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD240LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD241, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD241LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD242, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD242LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD250, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD250LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD251, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD251LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD252, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD252LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD253, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD253LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD254, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD254LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD255, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD255LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD260, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD260LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD261, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD261LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD262, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD262LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD263, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD263LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD268, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD268LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD269, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD269LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD270, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD270LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD300, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD300LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD310, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD310LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD311, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD311LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD312, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD312LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD313, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD313LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD314, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD314LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD315, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD315LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD316, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD316LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD317, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD317LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD318, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD318LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD319, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD319LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD320, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD320LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD321, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD321LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD322, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD322LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD323, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD323LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD324, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD324LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD330, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD330LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD331, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD331LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD332, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD332LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD333, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD333LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD334, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD334LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD335, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD335LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD336, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD336LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD337, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD337LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD338, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD338LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD339, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD339LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD340, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD340LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD341, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD341LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD342, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD342LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD343, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD343LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD400, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD400LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD410, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD410LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411a, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411aLY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411b, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD411bLY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD412, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD412LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD413, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD413LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD414, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD414LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD415, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD415LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD416, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD416LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD417, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD417LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD418, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD418LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD419, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD419LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD420, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD420LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421a, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421aLY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421b, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD421bLY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD422, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD422LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD429, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD429LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD430, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD430LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD431, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD431LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD432, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD432LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD440, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_CD440LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ01, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ01LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ02, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ02LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ10, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ10LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ11, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ11LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ20, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ20LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ21, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ21LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ22, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ22LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ23, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ23LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ24, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ24LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ25, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ25LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ26, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ26LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ30, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ30LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ31, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ31LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ32, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ32LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ40, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ40LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ50, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ50LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ51, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ51LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ52, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ52LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ60, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ60LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ61, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ61LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ62, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ62LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ70, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ70LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ71, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_KQ71LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_LTC_20, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_LTC_20LY, new BigDecimal(0));
		mTab.setValue(MFinancialInfo.COLUMNNAME_LTC_20LY, new BigDecimal(0));
	}

}
