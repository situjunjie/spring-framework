package org.situjunjie.spring.applicationcontext.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
