package com.austin.chain.filter;

import com.austin.chain.filterchain.FilterChain;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Filter1.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Filter1.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 6, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Filter1 implements Filter
{

	@Override
	public void doFilter(String condition)
	{
//		if(Filter.CONDITION_1.equals(condition))
		{
			System.out.println("Do Filter 1");
		}
	}
	
	public void doFilter(String condition, FilterChain filterChain)
	{
		System.out.println("Do Filter 1, Via FilterChain");
		filterChain.doFilter(condition, filterChain);
	}

}

/*
*$Log: av-env.bat,v $
*/