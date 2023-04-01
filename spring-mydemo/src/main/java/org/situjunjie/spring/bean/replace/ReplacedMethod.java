package org.situjunjie.spring.bean.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplacedMethod implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("替换后的方法");
		return null;
	}
}
