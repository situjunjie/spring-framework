package org.situjunjie.spring.beanfactory.load.replace;


import org.junit.Test;
import org.situjunjie.spring.bean.replace.ReplaceMethodDemo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ReplaceMethodTests {

	@Test
	public void testReplaceMethod(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext-replaceMethod.xml"));
		ReplaceMethodDemo replaceMethodDemo = (ReplaceMethodDemo) bf.getBean("replaceMethodDemo");
		replaceMethodDemo.replaceMe();
	}
}
