package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;

public class SetOfStandard {
	
	private String name;
	private String groupName;
	private String value;
	private String rate;
	private BigDecimal wAuditer;
	private BigDecimal wUnauditer;
	private SetOfStandard parent;
	// Dai dien cho value cua bo chi tieu
	private String typeOfValue;
	
	private String parentID;
	private int level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public BigDecimal getwAuditer() {
		return wAuditer;
	}

	public void setwAuditer(BigDecimal wAuditer) {
		this.wAuditer = wAuditer;
	}

	public BigDecimal getwUnauditer() {
		return wUnauditer;
	}

	public void setwUnauditer(BigDecimal wUnauditer) {
		this.wUnauditer = wUnauditer;
	}

	public SetOfStandard getParent() {
		return parent;
	}

	public void setParent(SetOfStandard parent) {
		this.parent = parent;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public String getTypeOfValue() {
		return typeOfValue;
	}

	public void setTypeOfValue(String typeOfValue) {
		this.typeOfValue = typeOfValue;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
