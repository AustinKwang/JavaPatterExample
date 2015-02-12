package com.austin.decorator.decorator;

import java.util.Date;

import com.austin.decorator.component.Component;

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
public class SumPrizeDecorator extends Decorator
{

	public SumPrizeDecorator(Component c)
	{
		super(c);
	}
	
	public double calcPrize(String user, Date begin, Date end)
	{
		//1. 先获取前面的运算获得的奖金
		double pre_prize = super.calcPrize(user, begin, end);
		//2. 按照当前需要的计算方式， 计算累积奖金， 按人员的累积业务额， 然后乘以 0.1%， 假定： 1000000
		double current_prize = 1000000 * 0.001;
		
		return pre_prize + current_prize;
	}

}

/*
*$Log: av-env.bat,v $
*/