package com.lee.util;


import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author xiaohuqi E-mail:xiaohuqi@126.com
 * @version 创建时间：2010-5-18 下午08:59:35
 * 说明
 */

public class CommonUtil {

	Logger log = Logger.getLogger(CommonUtil.class);

	/**
	 * @author lcx
	 * @param fileName 属性文件
	 * @param key 	要查询的属性key
	 * @return 属性key值
	 * 获取属性key值
	 */
	public String getPropertys(String fileName, String key){
		InputStream is = getClass().getResourceAsStream(fileName);
		Properties prop = new Properties();
		try{
			prop.load(is);
		}catch(Exception e){
			log.error(e);
		}
		String keyValue = null;
		try {
			keyValue = prop.get(key).toString();
		} catch (Exception e) {
			log.error(e + " " + key);
		}
		return keyValue;
	}
}