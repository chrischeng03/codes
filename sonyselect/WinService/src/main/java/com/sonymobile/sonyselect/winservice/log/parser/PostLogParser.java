/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log.parser;

import com.sonymobile.sonyselect.winservice.exceptions.InvalidLogFormatException;
import com.sonymobile.sonyselect.winservice.log.LogData;
import com.sonymobile.sonyselect.winservice.log.RawLogData;

/**
 * @author Chris
 * 本接口主要是在日志解析器处理处raw的logData之后调用，讲logData中的Value转化成真正的类型
 */
public interface PostLogParser {
	
	/**
	 * 检验并转化Logdata
	 * @param logData
	 * @return
	 * @throws InvlidLogFormatException
	 */
	public LogData validAndConvertType(RawLogData logData) throws InvalidLogFormatException;
}
