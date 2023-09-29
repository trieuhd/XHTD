package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;

public class ScoreDisplayObject {

	// Diem goc chua nhan trong so
	private BigDecimal sourceScore;
	// Diem chinh thuc da nhan trong so
	private BigDecimal releaseScore;
	// Ten bo chi tieu
	private String typeOfData;
	// Ten nhom chi tieu
	private String groupName;
	// Thong tin bo chi tieu
	private SetOfStandard standard;
	
	public SetOfStandard getStandard() {
		return standard;
	}
	public void setStandard(SetOfStandard standard) {
		this.standard = standard;
	}
	public BigDecimal getSourceScore() {
		return sourceScore;
	}
	public void setSourceScore(BigDecimal sourceScore) {
		this.sourceScore = sourceScore;
	}
	public BigDecimal getReleaseScore() {
		return releaseScore;
	}
	public void setReleaseScore(BigDecimal releaseScore) {
		this.releaseScore = releaseScore;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getTypeOfData() {
		return typeOfData;
	}
	public void setTypeOfData(String typeOfData) {
		this.typeOfData = typeOfData;
	}
}
