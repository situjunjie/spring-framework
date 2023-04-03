package org.situjunjie.spring.beanfactory.load.lookup;

import org.junit.Test;
import org.situjunjie.spring.bean.lookup.LookUpTest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LookUpTests {

	/**
	 * 简单测试lookup方法注入
	 */
	@Test
	public void testLookUpMethod(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext-lookup.xml"));
		LookUpTest lookUpTest = (LookUpTest) bf.getBean("lookUpTest");
		lookUpTest.showMe();
	}
}
