package com.austin.decorator.client;

import com.austin.decorator.component.Component;
import com.austin.decorator.component.ConcreteComponent;
import com.austin.decorator.decorator.Decorator;
import com.austin.decorator.decorator.GroupPrizeDecorator;
import com.austin.decorator.decorator.MonthPrizeDecorator;
import com.austin.decorator.decorator.SumPrizeDecorator;

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
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class MainTest
{
	public static void main(String[] args)
	{
		Component c1 = new ConcreteComponent();
		
		Decorator d1 = new MonthPrizeDecorator(c1);
		Decorator d2 = new SumPrizeDecorator(d1);
		
		Double zs = d2.calcPrize("Zhangshan", null, null);
		Double ls = d2.calcPrize("lisi", null, null);
		
		Decorator d3 = new GroupPrizeDecorator(d2);
		Double ww = d3.calcPrize("wangwu", null, null);
	}
}

/*
*$Log: av-env.bat,v $
*/