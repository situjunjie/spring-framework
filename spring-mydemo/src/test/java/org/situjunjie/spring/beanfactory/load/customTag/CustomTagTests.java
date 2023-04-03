package org.situjunjie.spring.beanfactory.load.customTag;

import org.junit.Test;
import org.situjunjie.spring.customtag.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;

public class CustomTagTests {

	@Test
	@SuppressWarnings({"deprecation"})
	public void testLoadCustomTag(){

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext-custom.xml"));
		User user = (User) bf.getBean("user");
		System.out.println(user);
	}
}
