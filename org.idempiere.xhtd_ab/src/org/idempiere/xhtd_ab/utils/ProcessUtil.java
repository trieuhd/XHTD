package org.idempiere.xhtd_ab.utils;

import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;

public class ProcessUtil {

	public static final String COMMENT_YES = "Y";
	public static final String COMMENT_NO = "N";
	public static final String COMMENT_EDIT = "C";
	public static final String STATUS = "Status";
	public static final String COMMENT = "Comment";
	public static final String DEFAUL_AP = "N";

	public static String getStatusApproved(String currentStatus) {

		switch (currentStatus) {
		case MCustomerProfile.DOCSTATUS_KhoiTao:
			return MCustomerProfile.DOCSTATUS_ChoDuyet;
		case MCustomerProfile.DOCSTATUS_DeXuatNgoaiLe:
			return MCustomerProfile.DOCSTATUS_ChoDuyet;
		case MCustomerProfile.DOCSTATUS_KiemSoatTuChoi:
			return MCustomerProfile.DOCSTATUS_ChoDuyet;
		case MCustomerProfile.DOCSTATUS_ViPhamKO:
			return MCustomerProfile.DOCSTATUS_ChoDuyet;
		case MCustomerProfile.DOCSTATUS_ChoDuyet:
			return MCustomerProfile.DOCSTATUS_KiemSoatDuyet;
		case MCustomerProfile.DOCSTATUS_KiemSoatDuyet:
			return MCustomerProfile.DOCSTATUS_ThamDinhTinDung;
		case MCustomerProfile.DOCSTATUS_ThamDinhTinDung:
			return MCustomerProfile.DOCSTATUS_RaQuyetDinhTinDung;
		default:
			return MCustomerProfile.DOCSTATUS_RaQuyetDinhTinDung;
		}

	}
	public static String getStatusReject(String currentStatus) {

		switch (currentStatus) {
		case MCustomerProfile.DOCSTATUS_ChoDuyet:
			return MCustomerProfile.DOCSTATUS_KiemSoatTuChoi;
		case MCustomerProfile.DOCSTATUS_ViPhamKO:
			return MCustomerProfile.DOCSTATUS_LoaiHoSo;
		case MCustomerProfile.DOCSTATUS_KiemSoatDuyet:
			return MCustomerProfile.DOCSTATUS_ThamDinhTuChoi;
		case MCustomerProfile.DOCSTATUS_KhoiTao:
			return MCustomerProfile.DOCSTATUS_LoaiHoSo;
		default:
			return MCustomerProfile.DOCSTATUS_KiemSoatTuChoi;
		}

	}



}
