package com.austin.chain.filter;

import com.austin.chain.filterchain.FilterChain;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Filter2.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Filter2.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 6, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Filter5 implements Filter
{
	public void doFilter(String condition)
	{
//		if(Filter.CONDITION_5.equals(condition))
		{
			System.out.println("Do Filter 5");
		}
	}
	
	public void doFilter(String condition, FilterChain filterChain)
	{
		System.out.println("Do Filter 5, Via FilterChain");
		filterChain.doFilter(condition, filterChain);
	}

}

/*
*$Log: av-env.bat,v $
*/