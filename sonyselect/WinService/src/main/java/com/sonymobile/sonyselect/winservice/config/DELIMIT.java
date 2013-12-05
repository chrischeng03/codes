package com.sonymobile.sonyselect.winservice.config;

public enum DELIMIT {
	SPACE("SPACE"), COMMA("COMMA"), VLINE("VLINE"), EQUALS("EQUALS");
	private DELIMIT(String val) {
		this.val = val;
	}

	public String toString() {
		return this.val;
	}

	private String val;
}
