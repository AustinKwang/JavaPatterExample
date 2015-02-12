package com.austin.decorator.component;

import java.util.Date;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: ConcreteComponent.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: ConcreteComponent.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
//基本的计算奖金的实现类， 也是被装饰漆装饰的对象
public class ConcreteComponent extends Component
{

	@Override
	public double calcPrize(String user, Date begin, Date end)
	{
		// 默认的实现，没有奖金
		return 0;
	}

}

/*
*$Log: av-env.bat,v $
*/