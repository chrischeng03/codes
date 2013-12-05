/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log.parser;

/**
 * @author Chris
 *
 */
public interface FrontLogParse {
	
	public boolean checkLogLine(String logLine);
	
	public boolean checkLogLines(String[] logLines);
	
}
