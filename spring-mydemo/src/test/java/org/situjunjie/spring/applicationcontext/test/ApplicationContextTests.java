package org.situjunjie.spring.applicationcontext.test;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ApplicationContextTests {

	@Test
	public void simpleLoadTest(){

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object student = ctx.getBean("student");
		System.out.println(student);

	}

	/**
	 * 测试自定义的属性编辑器
	 */
	@Test
	public void testPropertyEditorSupport(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-supportPropertyEditor.xml");
		Object testBean = ctx.getBean("testBean");
		System.out.println(testBean);
	}

	/**
	 * 测试BeanFactoryPostProcessor
	 */
	@Test
	public void testBeanFactoryPostProcessor(){
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext-beanFactoryPostProceoosr.xml"));
		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) xmlBeanFactory.getBean("obscenityRemovingBeanFactoryPostProcessor");
		bfpp.postProcessBeanFactory(xmlBeanFactory);
		System.out.println(xmlBeanFactory.getBean("student"));

	}

	/**
	 * 测试自定义BeanPostProcessor
	 */
	@Test
	public void testMyBeanPostProcessor(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-bpp.xml");

	}
}
