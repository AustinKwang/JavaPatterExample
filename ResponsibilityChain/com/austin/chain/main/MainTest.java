package com.austin.chain.main;

import com.austin.chain.filter.Filter1;
import com.austin.chain.filter.Filter2;
import com.austin.chain.filter.Filter3;
import com.austin.chain.filter.Filter4;
import com.austin.chain.filter.Filter5;
import com.austin.chain.filterchain.FilterChain;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: MainTest.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: MainTest.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 6, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class MainTest
{
	public static void main(String[] args)
	{
		FilterChain filterChain = new FilterChain();
		
		filterChain.addFilter(new Filter1());
		filterChain.addFilter(new Filter2());
		filterChain.addFilter(new Filter3());
		filterChain.addFilter(new Filter4());
		filterChain.addFilter(new Filter5());
		
		filterChain.doFilter("Condition3");
		
		System.out.println("=========Round2==========");
		
		filterChain.doFilter("Condition3", filterChain);
		
		//Nothing, Only for git hub test.
		// test.
	}
}

/*
*$Log: av-env.bat,v $
*/