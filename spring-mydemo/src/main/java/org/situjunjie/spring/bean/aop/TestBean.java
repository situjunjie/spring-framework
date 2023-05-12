package org.situjunjie.spring.bean.aop;

import lombok.Data;

@Data
public class TestBean {

	private String testStr = "HelloWorld";

	public void test(){
		System.out.println(testStr);
	}
}
