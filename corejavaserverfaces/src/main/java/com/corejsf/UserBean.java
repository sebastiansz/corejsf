package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
// or import javax.faces.bean.ManagedBean;

// or import javax.faces.bean.SessionScoped;

@Named("user")
// or @ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {

	private String name;

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String newValue) {
		name = newValue;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newValue) {
		password = newValue;
	}
}
