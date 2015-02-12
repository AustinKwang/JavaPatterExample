package com.austin.decorator.component;

import java.util.Date;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Component.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Component.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public abstract class Component
{ 
	//计算江景的组件接口	
	
	public abstract double calcPrize(String user, Date begin, Date end);
}

/*
*$Log: av-env.bat,v $
*/