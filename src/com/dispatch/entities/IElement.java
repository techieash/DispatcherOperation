package com.dispatch.entities;

public interface IElement {
	
	Object sub(Object obj);
	
	String sub(String str);
	
	public void accept(Disptacher dispatch);

}
