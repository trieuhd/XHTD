package org.idempiere.xhtd_ab.object;

public class ColumnConfig {
	private String collumName;
	private String tableName;
	
	public ColumnConfig (String columName, String tableName) {
		this.collumName = columName;
		this.tableName = tableName;
	}
	public String getCollumName() {
		return collumName;
	}
	public void setCollumName(String collumName) {
		this.collumName = collumName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
