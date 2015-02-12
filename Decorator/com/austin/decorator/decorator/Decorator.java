package com.austin.decorator.decorator;

import java.util.Date;

import com.austin.decorator.component.Component;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Decorator.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Decorator.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Decorator extends Component
{
	protected Component c;

	@Override
	public double calcPrize(String user, Date begin, Date end)
	{
		// TODO Auto-generated method stub
		return c.calcPrize(user, begin, end);
	}
	
	public Decorator(Component c)
	{
		this.c = c;
	}
	

}

/*
*$Log: av-env.bat,v $
*/