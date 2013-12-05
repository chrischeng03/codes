package com.sonymobile.sonyselect.winservice.config;

import java.util.ArrayList;
import java.util.List;

public class ConfLogFile {
	private List<ConfLogLineParser> logLinesParsers = new ArrayList<ConfLogLineParser>();
	
	private List<ConfLogData> logDatas = new ArrayList<ConfLogData>();
	
	private String type;
	
	private int colomns;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getColomns() {
		return colomns;
	}

	public void setColomns(int colomns) {
		this.colomns = colomns;
	}
	
	public ConfLogLineParser[] getLogLinesParsers(){
		ConfLogLineParser[] clps = new ConfLogLineParser[logLinesParsers.size()];
		logLinesParsers.toArray(clps);
		return clps;
	}
	
	public ConfLogFile add(ConfLogLineParser conf){
		logLinesParsers.add(conf);
		return this;
	}
	
	public ConfLogFile add(ConfLogData conf){
		logDatas.add(conf);
		return this;
	}
}
