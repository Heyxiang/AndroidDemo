package com.seventeen.config;

import java.text.SimpleDateFormat;

public class Tools {
	// 传进来的long型注意加L
	public static String getDataFormat(String time) {
		SimpleDateFormat format = new SimpleDateFormat("MM-dd");
		Long t = new Long(Long.parseLong(time));
		String d = format.format(t);
		return d;

	}
}
