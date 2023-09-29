package org.idempiere.xhtd_ab.form;

import java.math.RoundingMode;
import java.util.List;

import org.adempiere.webui.component.ListCell;
import org.adempiere.webui.component.ListHead;
import org.adempiere.webui.component.ListHeader;
import org.adempiere.webui.component.ListItem;
import org.adempiere.webui.component.Listbox;
import org.adempiere.webui.panel.ADForm;
import org.compiere.process.ProcessInfo;
import org.idempiere.xhtd_ab.object.ScoreDisplayObject;
import org.idempiere.xhtd_ab.object.ScoreObject;
import org.idempiere.xhtd_ab.services.ScoreService;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class XhtdFormDisplays extends ADForm {
	
	private List<ScoreDisplayObject> listScore;
	private ScoreService service;
	private ScoreObject scoreObject;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void initForm() {
//		service  = new ScoreService(null, 1000342,null);
//		service.calScore();
////		ScoreObject object = service.loadScore("");
////		scoreObject = object;
////		listScore = object.getListScoreDetail();
////		this.setContentStyle("overflow:auto;");
////		setWindow();
//	}
	}
	private String getMessage(String key) {
		return MessageUtil.getMessage(key);
	}

	private void setWindow() {
		setTitle(MessageUtil.getMessage("SCORE_FORM_TITLE"));
		Listbox mainBox = new Listbox();
		setHeader(mainBox);
		setBody(mainBox);
		this.appendChild(mainBox);
	}
	
	private void setHeader(Listbox lb) {
		ListHead listHead = new ListHead();
		
		ListHeader lh0 = new ListHeader();
		lh0.setLabel("STT");
		lh0.setHflex("1");
		lh0.setAlign("center");
		
		ListHeader lh1 = new ListHeader();
		lh1.setLabel(MessageUtil.getMessage("XHTD_TYPE_DOC"));
		lh1.setHflex("1");
		
		ListHeader lh2 = new ListHeader();
		lh2.setLabel(getMessage("XHTD_GROUP"));
		lh2.setHflex("2");
		
		ListHeader lh3 = new ListHeader();
		lh3.setLabel(getMessage("XHTD_NAME_VALUE"));
		lh3.setHflex("4");
		
		ListHeader lh9 = new ListHeader();
		lh9.setLabel(getMessage("XTD_RATE_SCORE_CHANGED"));
		lh9.setHflex("2");
		lh9.setAlign("center");
		
		listHead.appendChild(lh0);
		listHead.appendChild(lh1);
		listHead.appendChild(lh2);
		listHead.appendChild(lh3);
		listHead.appendChild(lh9);
		lb.appendChild(listHead);
	}
	
	private void setBody(Listbox lb) {
		for (int i = 0; i < listScore.size()-1; i++) {
			ListItem lItem = new ListItem();
			setBodyDetail(listScore.get(i), lItem, i);
			lb.appendChild(lItem);
		}
		
		ListItem itemSpecial = new ListItem();
		setBodyDetail(listScore.get(listScore.size()-1),itemSpecial,15);
		lb.appendChild(itemSpecial);
		
		ListItem lItem2 = new ListItem();
		setTotal(lItem2,getMessage("RELEASE_SCORE"),scoreObject.getScore().setScale(2, RoundingMode.HALF_UP).toEngineeringString());
		lb.appendChild(lItem2);
		
		ListItem lItem3 = new ListItem();
		setTotal(lItem3,getMessage("TDAB_RATE_SCORE"),scoreObject.getPdRate().setScale(4, RoundingMode.HALF_UP).toEngineeringString());
		lb.appendChild(lItem3);
			
		ListItem lItem8 = new ListItem();
		setTotal(lItem8,getMessage("TDAB_INDEX_SCORE"),scoreObject.getFinalScoreTag().getIndexScore());
		lb.appendChild(lItem8);
		
	}
	
	private void setTotal(ListItem lItem,String name, String value) {
		ListCell ls1 = new ListCell();
		ListCell ls2 = new ListCell();
		ListCell ls3 = new ListCell();
		ListCell ls9 = new ListCell();
		ls9.setLabel(name);
		ls9.setStyle("font-weight: bold;");
		ListCell ls10 = new ListCell();
		ls10.setStyle("font-weight: bold;");
		ls10.setLabel(value);
		lItem.appendChild(ls1);
		lItem.appendChild(ls2);
		lItem.appendChild(ls3);
		lItem.appendChild(ls9);
		lItem.appendChild(ls10);
	}
	
	private void setTitle(ListItem lItem,String name) {
		ListCell ls1 = new ListCell();
		ListCell ls2 = new ListCell();
		ListCell ls4 = new ListCell();
		ListCell ls5 = new ListCell();		
		ListCell ls6 = new ListCell();
		ListCell ls7 = new ListCell();
		ListCell ls8 = new ListCell();
		ListCell ls9 = new ListCell();
		ListCell ls10 = new ListCell();
		lItem.appendChild(ls1);
		lItem.appendChild(ls2);
		lItem.appendChild(ls4);
		lItem.appendChild(ls5);
		lItem.appendChild(ls6);
		lItem.appendChild(ls7);
		lItem.appendChild(ls8);
		lItem.appendChild(ls9);
		lItem.appendChild(ls10);
	}
	
	public void setBodyDetail(ScoreDisplayObject customerScore, ListItem lItem, int stt) {
		ListCell ls1 = new ListCell();
		ls1.setLabel("" + (stt + 1));
		ListCell ls2 = new ListCell();
		ls2.setLabel("" + customerScore.getTypeOfData());
		ListCell ls3 = new ListCell();
		ls3.setLabel(customerScore.getGroupName());
		ListCell ls4 = new ListCell();
		ls4.setLabel(customerScore.getStandard().getName());
		ListCell ls10 = new ListCell();
		ls10.setLabel(customerScore.getReleaseScore().setScale(2, RoundingMode.HALF_UP).toEngineeringString());
		lItem.appendChild(ls1);
		lItem.appendChild(ls2);
		lItem.appendChild(ls3);
		lItem.appendChild(ls4);
		lItem.appendChild(ls10);
	}
	
	private void setFooter() {
		
	}

	@Override
	public void setProcessInfo(ProcessInfo pi) {	
		int id = pi.getRecord_ID();
//		int id =1003224;
		service  = new ScoreService(null, 0,null);
		ScoreObject object = service.loadScore(id+"");
		scoreObject = object;
		listScore = object.getListScoreDetail();
		this.setContentStyle("overflow:auto;");
		setWindow();
	}
}
