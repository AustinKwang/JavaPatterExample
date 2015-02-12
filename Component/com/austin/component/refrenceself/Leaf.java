package com.austin.component.refrenceself;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Leaf.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Leaf.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 11, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Leaf extends Component
{
	private String name;
	
	public Leaf(String name)
	{
		this.name = name;
	}

	@Override
	public void printStruct(String preStr)
	{
		System.out.println(preStr + "-" + name);
	}
	
}

/*
*$Log: av-env.bat,v $
*/