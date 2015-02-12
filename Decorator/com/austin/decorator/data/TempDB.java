package com.austin.decorator.data;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: TempDB.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: TempDB.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class TempDB
{

	public static Map<String, Double> mapMonthSaleMoney = new HashMap<String, Double>();
	
	static
	{
		mapMonthSaleMoney.put("zhangsan", 10000.0);
		mapMonthSaleMoney.put("lisi", 20000.0);
		mapMonthSaleMoney.put("wangwu", 30000.0);
		mapMonthSaleMoney.put("zhangsan", 40000.0);
	}
}

/*
*$Log: av-env.bat,v $
*/