/**
 * 
 */
package com.sonymobile.sonyselect.winservice.config;

/**
 * @author Chris
 *
 */
public interface Configuration {
	/**
	 * 添加Loglineparser配置
	 * @param conf
	 * @return
	 */
	public Configuration add(ConfLogLineParser gloabConfLogLineParser);
	
	public ConfLogLineParser[] getGloabConfLogLineParsers();
	
	public Configuration add(ConfLogFile confLogfile);
	
	public ConfLogFile[] getConfLogFiles();
	
	public ConfLogFile getConfLogFile(String logType);
	
	public Configuration add(ConfLogFile confLogfile,ConfLogLineParser confLogLineParser);
	
	public Configuration add(ConfLogFile confLogfile,ConfLogData confLogData);
	
}
