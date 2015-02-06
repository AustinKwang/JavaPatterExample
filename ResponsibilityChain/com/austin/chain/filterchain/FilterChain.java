package com.austin.chain.filterchain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.austin.chain.filter.Filter;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: FilterChain.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: FilterChain.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 6, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class FilterChain
{
	private int currentPostion;
	
	private List<Filter> filterChainList = new ArrayList<Filter>();
	
	public void doFilter(String condition)
	{
		Iterator it = filterChainList.iterator();
		while(it.hasNext())
		{
			((Filter)it.next()).doFilter(condition);
		}
	}
	

	public void doFilter(String condition, FilterChain filterChain)
	{
		if(filterChainList.size() < 0 || currentPostion >= filterChainList.size())
		{
			return;
		}
		
		Filter filter = filterChainList.get(currentPostion ++);
		filter.doFilter(condition, filterChain);
			
	}
	
	public void addFilter(Filter filter)
	{
		filterChainList.add(filter);
	}
	
	
}

/*
*$Log: av-env.bat,v $
*/