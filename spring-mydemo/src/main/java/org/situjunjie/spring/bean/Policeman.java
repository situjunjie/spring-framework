package org.situjunjie.spring.bean;

public class Policeman extends AbstractUser{
	@Override
	public void showMe() {
		System.out.println("I am policeman");
	}
}
