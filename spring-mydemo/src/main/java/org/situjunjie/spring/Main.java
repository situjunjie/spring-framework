package org.situjunjie.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Hello world!");
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(""));
	}
}
