/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log.parser;

import com.sonymobile.sonyselect.winservice.log.RawLogData;

/**
 * @author Chris
 * 多行log组成一个数据
 */
public class MultiLinesLogParser extends DefaultLogParser {

	private LogParser logParser;

	public MultiLinesLogParser(LogParser logParser) {
		this.logParser = logParser;
	}

	public RawLogData parse(String[] linesLog) {
		return null;
	}
}
