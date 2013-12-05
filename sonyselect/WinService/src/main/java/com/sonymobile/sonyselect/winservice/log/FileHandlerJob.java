package com.sonymobile.sonyselect.winservice.log;

/***
 * 
 * @author Chris
 *
 */
public class FileHandlerJob {
	private String logFileName;
	
	private String validPropertyName;
	
	private int lineBatch;

	public String getLogFileName() {
		return logFileName;
	}

	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}

	public String getValidPropertyName() {
		return validPropertyName;
	}

	public void setValidPropertyName(String validPropertyName) {
		this.validPropertyName = validPropertyName;
	}

	public int getLineBatch() {
		return lineBatch;
	}

	public void setLineBatch(int lineBatch) {
		this.lineBatch = lineBatch;
	}

}
