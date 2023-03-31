package org.situjunjie.spring.beanfactory;

import org.junit.Test;
import org.situjunjie.spring.bean.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SimpleLoadTests {

	/**
	 * 开启一个BeanFactory 简单加载BeanDefinition
	 */
	@Test
	public void testLoadBean(){
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Student student = beanFactory.getBean("student", Student.class);
		System.out.println(student);
	}
}
