package com.austin.chain.filter;

import com.austin.chain.filterchain.FilterChain;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Filter.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Filter.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 6, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public interface Filter
{
	public static final String CONDITION_1 = "Condition1";
	public static final String CONDITION_2 = "Condition2";
	public static final String CONDITION_3 = "Condition3";
	public static final String CONDITION_4 = "Condition4";
	public static final String CONDITION_5 = "Condition5";
	
	public void doFilter(String condition);
	
	public void doFilter(String condition, FilterChain filterChain);
}

/*
*$Log: av-env.bat,v $
*/