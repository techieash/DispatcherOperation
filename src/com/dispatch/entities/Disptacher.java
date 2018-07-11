package com.dispatch.entities;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Disptacher  {

	private List<Method> subclassesMethods = null;

	private List<Method> getSubclasMethods() {
		return subclassesMethods;
	}

	public void addSubclassMethods(Method[] methods) {
		if (subclassesMethods == null) {
			subclassesMethods = new ArrayList<>();
		}
		for (Method method : methods) {
			this.subclassesMethods.add(method);
		}
	}

	public Object dispatch(Object param) throws Exception {
		List<Method> subclasMethods = getSubclasMethods();
		boolean isFound = false;
		for(Method method:subclasMethods){
			if(isFound){
				break;
			}
			Class<?> subclass = method.getDeclaringClass();
			Class<?>[] parameterTypes = method.getParameterTypes();
			for(Class classtype:parameterTypes){
				if(classtype.equals(param.getClass())){
					method.invoke(subclass.newInstance(), new Object[]{param});
					isFound=true;
					break;
				}
			}
		}
		
		return param;

	}
	

}
