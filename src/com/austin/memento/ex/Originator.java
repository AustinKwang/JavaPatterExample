package com.austin.memento.ex;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Originator.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  原发器
 * 
 *  Notes:
 * 	$Id: Originator.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Originator
{
	//原发器的状态
	private String state = null;
	
	public Memento createMemento() 
	{
		return new MementoImpl(state);
	}
	
	public void setMemento(Memento memento)
	{
		MementoImpl mementoImpl = (MementoImpl)memento;
		this.state = mementoImpl.getState();
	}
	
	//备忘录对象，事项备忘录窄接口，为私有的内部类，不让外部访问
	private static class MementoImpl implements Memento
	{
		
		//需要保存的状态
		private String state = null;
		
		public MementoImpl(String state)
		{
			this.state = state;
		}
		
		public String getState()
		{
			return state;
		}
	}
	
}

/*
*$Log: av-env.bat,v $
*/