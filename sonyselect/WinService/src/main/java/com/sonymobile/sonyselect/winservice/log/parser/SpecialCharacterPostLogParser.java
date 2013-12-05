/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log.parser;

import com.sonymobile.sonyselect.winservice.exceptions.InvalidLogFormatException;
import com.sonymobile.sonyselect.winservice.log.RawLogData;

/**
 * @author Chris
 *
 */
public interface SpecialCharacterPostLogParser extends PostLogParser {
	
	/**
	 * 转化特殊字符
	 * @param logData
	 * @return
	 */
	public RawLogData replaceSpecialCharacters(RawLogData logData) throws InvalidLogFormatException;
}
