package com.disptach.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dispatch.entities.Disptacher;
import com.dispatch.entities.IElement;
import com.dispatch.entities.SubclassA;
import com.dispatch.entities.SubclassB;

public class DisptacherTest {

	Disptacher dispatcher;
	
	@Before
	public void setUp(){
		dispatcher = new Disptacher();
	}
	@Test
	public void dipstachToSubclassMethodsTypeStringParam() throws Exception {
		IElement[] list = {new SubclassA(),new SubclassB()};
		for(IElement element:list){
			element.accept(dispatcher);
		}
		Assert.assertEquals(dispatcher.dispatch("string"),"string");
	}
	
	@Test
	public void dipstachToSubclassMethodsTypeObjectParam() throws Exception {
		IElement[] list = {new SubclassA(),new SubclassB()};
		for(IElement element:list){
			element.accept(dispatcher);
		}
		Object param = new Object();
		Assert.assertEquals(dispatcher.dispatch(param),param);
	}
}
