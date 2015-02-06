package com.austin.memento.undo;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: OperationApi.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: OperationApi.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public interface OperationApi
{  // 其实现是命令的接收者，也就是执行命令者
	
	//获得计算后的结果
	public int getResult();
	
	//执行加法，在原数基础上 加上 num
	public void add(int num);
	
	//执行减法， 在原数基础上减 num
	public void subStract(int num);
	
	//常见备忘录对象
	public Memento createMemento();
	
	//重新设置备忘录对象，让其回到该备忘录记录的状态
	public void setMemento(Memento memento);
	
}

/*
*$Log: av-env.bat,v $
*/