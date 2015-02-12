package com.austin.component.component;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Composite.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Composite.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 11, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public class Composite extends Component
{

	private String name;
	
	public Composite(String name)
	{
		this.name = name;
	}
	
	private List<Component> childComponents;
	
	@Override
	public void printStruct(String preStr)
	{
		// TODO Auto-generated method stub
	}
	
	@Override
	public void addChild(Component child) throws Exception
	{
		if(null != childComponents)
		{
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);
	}
	

}

/*
*$Log: av-env.bat,v $
*/