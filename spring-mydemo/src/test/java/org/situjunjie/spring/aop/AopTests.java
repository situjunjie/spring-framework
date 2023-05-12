package org.situjunjie.spring.aop;

import org.junit.Test;
import org.situjunjie.spring.bean.aop.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTests {

	@Test
	public void simpleAop(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		TestBean testBean = ctx.getBean("testBean", TestBean.class);
		testBean.test();
	}
}
