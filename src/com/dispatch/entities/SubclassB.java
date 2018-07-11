package com.dispatch.entities;

public class SubclassB implements IElement{


	@Override
	public Object sub(Object obj) {
		System.out.println("ObjectB");
		return obj;
	}

	@Override
	public String sub(String str) {
		System.out.println("StringB");
		return str;
	}

	@Override
	public void accept(Disptacher dispatch) {
		dispatch.addSubclassMethods(this.getClass().getDeclaredMethods());
	}



}
