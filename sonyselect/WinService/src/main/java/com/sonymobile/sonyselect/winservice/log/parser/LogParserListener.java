/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log.parser;

import com.sonymobile.sonyselect.winservice.log.LogData;


/**
 * @author Chris
 * 
 */
public interface LogParserListener {

	/**
	 * 当解析成功时调用
	 * @param logType
	 * @param logData
	 */
	public void onParseSuccess(String logType,LogData logData);
	
	/**
	 * 当解析失败时调用
	 * @param logType
	 * @param lineLogs
	 */
	public void onParseFailed(String logType,String[] lineLogs);
	
	/**
	 * 当解析时抛出异常时调用
	 * @param logType
	 * @param lineLogs
	 */
	public void onExceptionWhenParse(String logType,String[] lineLogs);
}
