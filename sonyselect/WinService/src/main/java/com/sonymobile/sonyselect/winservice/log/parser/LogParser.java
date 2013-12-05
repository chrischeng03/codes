package com.sonymobile.sonyselect.winservice.log.parser;

import com.sonymobile.sonyselect.winservice.exceptions.LogParseException;
import com.sonymobile.sonyselect.winservice.log.RawLogData;

public interface LogParser {
	
	/**
	 * 解析Log
	 * @param lineLog
	 * @return raw logdata
	 * @throws LogParseException
	 */
	public RawLogData parse(String lineLog) throws LogParseException;
	
}
