package com.dispatch.entities;

public class SubclassA implements IElement {

	@Override
	public Object sub(Object obj) {
		System.out.println("ObjectA");
		return obj;
	}

	@Override
	public String sub(String str) {
		System.out.println("StringA");
		return str;
	}

	@Override
	public void accept(Disptacher dispatch) {
		dispatch.addSubclassMethods(this.getClass().getDeclaredMethods());
	}

}
