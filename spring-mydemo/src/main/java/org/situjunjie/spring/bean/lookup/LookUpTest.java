package org.situjunjie.spring.bean.lookup;

import org.situjunjie.spring.bean.AbstractUser;

public abstract class LookUpTest {

	public void showMe(){
		this.getUserBean().showMe();
	}
	public abstract AbstractUser getUserBean();
}
