package com.austin.component.refrenceself;
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
 *  Feb 11, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Client
{
	public static void main(String[] args) throws Exception
	{
		Component root = new Composite("服装");
		
		Component c1 = new Composite("男装");
		Component c2 = new Composite("女装");
		
		Component leaf1 = new Composite("衬衣");
		Component leaf2 = new Composite("夹克");
		Component leaf3 = new Composite("裙子");
		Component leaf4 = new Composite("套装");
		
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		
		c2.addChild(leaf3);
		c2.addChild(leaf4);
	}
}

/*
*$Log: av-env.bat,v $
*/