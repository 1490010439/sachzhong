/**
 * 
 */
package com.cmpay.sachzhong.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类名称：Timeutil 时间工具类
 * 创建人：钟盛勤
 * 创建时间：2018-10-8下午4:23:27
 * @version
 */
public class SachZhongTimeutil {

	public  String getTime()
	{
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = simpleDateFormat.format(date);
		return str;
	}

}
