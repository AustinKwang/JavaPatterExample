package com.austin.memento.ex2;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Client.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Client.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Client
{
	public static void main(String[] args)
	{
		// 流程运行对象 (原发器)
		FlowAMock mock = new FlowAMock("Test Mock");
		//运行 流程阶段1
		mock.runPhaseOne();
		// 创建备忘录管理者
		FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
		
		//创建备忘录对象，以备后面使用
		FlowAMockMemento memento = mock.createMemento();
		//备忘录管理者 保存原发器中的状态
		careTaker.saveMemento(memento);
		//运行方案 1
		mock.schema1();
		
		//从备忘录管理者中获得，保存对象，然后 重置对象到备忘录对象
		mock.setMemento(careTaker.retriveMemto());
		//运行方案2
		mock.schema2();
	}
}

/*
*$Log: av-env.bat,v $
*/