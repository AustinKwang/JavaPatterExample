package com.austin.memento.ex2;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: FlowAMock.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: FlowAMock.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class FlowAMock
{
	private String flowName;
	
	private int tempResult;
	
	private String tempState;
	
	public FlowAMock(String flowName)
	{
		this.flowName = flowName;
	}
	
	public void runPhaseOne()
	{
		tempResult = 3;
		tempState = "PhaseOne";
	}
	
	public void schema1()
	{
		this.tempState += ", Schema1";
		System.out.println(this.tempState + " : now run " + tempResult);
		this.tempResult += 11;
	}
	
	public void schema2()
	{
		this.tempState += ", Schema2";
		System.out.println(this.tempState + " : now run " + tempResult);
		this.tempResult += 22;
	}
	
	public FlowAMockMemento createMemento()
	{
		return new MementoImpl(this.tempResult, this.tempState);
	}
	
	public void setMemento(FlowAMockMemento memento)
	{
		MementoImpl mementoImpl = (MementoImpl)memento;
		this.tempResult = mementoImpl.tempResult;
		this.tempState = mementoImpl.tempState;
	}
	
	
	//一个内部状态对象，保存此流程(原发器)的状态
	private static class MementoImpl implements FlowAMockMemento
	{
		private int tempResult;
		
		private String tempState;
		
		public MementoImpl(int tempResult, String tempState)
		{
			this.tempResult = tempResult;
			this.tempState = tempState;
		}
		
		public int getTempateResult()
		{
			return tempResult;
		}
		
		public String getTempState()
		{
			return tempState;
		}
	}
}

/*
*$Log: av-env.bat,v $
*/