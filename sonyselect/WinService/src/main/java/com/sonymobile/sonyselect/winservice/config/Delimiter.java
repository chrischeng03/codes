package com.sonymobile.sonyselect.winservice.config;

public class Delimiter {
	
	private boolean useLog;
	
	private int use;
	
	private String[] values;
	
	public boolean isUseLog() {
		return useLog;
	}

	public void setUseLog(boolean useLog) {
		this.useLog = useLog;
	}

	public int getUse() {
		return use;
	}

	public void setUse(int use) {
		this.use = use;
	}
	
	public void setDelimiterString(String val){
		if (val == null) {
			return;
		}
	}
}
