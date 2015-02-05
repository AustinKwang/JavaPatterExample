package com.austin.memento.ex2;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: FlowAMementoCareTaker.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: FlowAMementoCareTaker.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class FlowAMementoCareTaker
{
	private FlowAMockMemento memento = null;
	
	public void saveMemento(FlowAMockMemento memento)
	{
		this.memento = memento;
	}
	
	public FlowAMockMemento retriveMemto()
	{
		return this.memento;
	}
	
}

/*
*$Log: av-env.bat,v $
*/