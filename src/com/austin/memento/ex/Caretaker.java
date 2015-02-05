package com.austin.memento.ex;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Caretaker.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Caretaker.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Caretaker
{
	private Memento memento = null;
	
	public void saveMemento(Memento memento)
	{
		this.memento = memento;
	}
	
	public Memento retriveMemento()
	{
		return this.memento;
	}
	
}

/*
*$Log: av-env.bat,v $
*/