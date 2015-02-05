package com.austin.memento.undo;
/**
 * <pre>
 * 
 *  Accela Automation
 *  File: Command.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: Command.java 72642 2009-01-01 20:01:57Z ACHIEVO\austin.wang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Feb 4, 2015		austin.wang		Initial.
 *  
 * </pre>
 */
public interface Command
{// 命令，其实现就是一个命令，会调用一个命令执行者来执行命令， 此接口定义了一组命令

	//执行命令
	public void excute();
	
	//撤销命令， 恢复到备忘录对象记录的状态
	public void undo(Memento memento);
	
	//重做，  恢复到备忘录对象记录的状态
	public void redo(Memento memento);
	
	public Memento createMemento();
}

/*
*$Log: av-env.bat,v $
*/