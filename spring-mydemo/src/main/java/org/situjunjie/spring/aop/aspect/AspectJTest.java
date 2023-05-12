package org.situjunjie.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test(){}

	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object arroundTest(ProceedingJoinPoint proceedingJoinPoint){

		System.out.println("before1");
		Object o = null;
		try {
			o = proceedingJoinPoint.proceed();
		}catch (Throwable e){
			e.printStackTrace();
		}
		System.out.println("after1");
		return  o;
	}
}
