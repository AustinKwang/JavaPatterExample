package com.austin.decorator.decorator;

import java.util.Date;

import com.austin.decorator.component.Component;
import com.austin.decorator.data.TempDB;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: SumPrizeDecorator.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: SumPrizeDecorator.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 9, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class GroupPrizeDecorator extends Decorator
{

	public GroupPrizeDecorator(Component c)
	{
		super(c);
	}
	
	public double calcPrize(String user, Date begin, Date end)
	{
		//1. 先获取前面的运算获得的奖金
		double pre_prize = super.calcPrize(user, begin, end);
		//2. 按照当前需要的计算方式， 计算当月当前团队所有成员的业务总额， 然后 * 1%
		double total = 0.0;
		for(double d : TempDB.mapMonthSaleMoney.values())
		{
			total += d;
		}
		double current_prize = total * 0.01;
		return pre_prize + current_prize;
	}

}

/*
*$Log: av-env.bat,v $
*/