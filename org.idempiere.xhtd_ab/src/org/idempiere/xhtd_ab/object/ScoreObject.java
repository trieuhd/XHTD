package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;
import java.util.List;


public class ScoreObject {
	
	private BigDecimal totalScore;
	
	private BigDecimal score;
	
	private BigDecimal preliminaryScore;
	//Xác xuất vỡ nợ
	private BigDecimal pdRate;
	
	//Sau khi có kết quả điểm và chuyển qua mô hình thẻ điểm
	private ScoreStringTag scoreTag;
	
	//Sau khi gán dấu hiệu cảnh báo sớm
	private ScoreStringTag finalScoreTag;
	
	private List<ScoreDisplayObject> listScoreDetail;
	
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public BigDecimal getPdRate() {
		return pdRate;
	}
	public void setPdRate(BigDecimal pdRate) {
		this.pdRate = pdRate;
	}
	public ScoreStringTag getScoreTag() {
		return scoreTag;
	}
	public void setScoreTag(ScoreStringTag scoreTag) {
		this.scoreTag = scoreTag;
	}
	public ScoreStringTag getFinalScoreTag() {
		return finalScoreTag;
	}
	public void setFinalScoreTag(ScoreStringTag finalScoreTag) {
		this.finalScoreTag = finalScoreTag;
	}
	public List<ScoreDisplayObject> getListScoreDetail() {
		return listScoreDetail;
	}
	public void setListScoreDetail(List<ScoreDisplayObject> listScoreDetail) {
		this.listScoreDetail = listScoreDetail;
	}
	public BigDecimal getPreliminaryScore() {
		return preliminaryScore;
	}
	public void setPreliminaryScore(BigDecimal preliminaryScore) {
		this.preliminaryScore = preliminaryScore;
	}
	public BigDecimal getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(BigDecimal totalScore) {
		this.totalScore = totalScore;
	} 
	
}
