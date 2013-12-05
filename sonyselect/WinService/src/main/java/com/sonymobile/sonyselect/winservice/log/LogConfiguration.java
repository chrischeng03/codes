/**
 * 
 */
package com.sonymobile.sonyselect.winservice.log;

import java.util.List;
import java.util.Map;

/**
 * @author Chris
 *
 */
public interface LogConfiguration {
	
	/**
	 * 添加简单的Config
	 * @param key
	 * @param value
	 * @return
	 */
	public void add(String key,String value);
	
	public String getValue(String key);
	
	public String getValue(String key,String defaultVal);
	
	public void add(String key,List<String> listValues);
	
	public List<String> getListValues(String values);
	
	public void add(String key,LogConfiguration config);
	
	public LogConfiguration getConfiguration(String key);
}
