package com.austin.component.component;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Component.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Component.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 11, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public abstract class Component
{
	public abstract void printStruct(String preStr);
	
	public void addChild(Component child) throws Exception
	{
		throw new Exception("对象不支持这个功能");
	}
	
	public void removeChild(Component child) throws Exception
	{
		throw new Exception("对象不支持这个功能");
	}
	

	public Component getChild(int index) throws Exception
	{
		throw new Exception("对象不支持这个功能");
	}
	
	
}

/*
*$Log: av-env.bat,v $
*/