package com.ivan.springmvc.web.formbean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserForm {

	@Size(min=1,message="用户名不能为空")
	private String name;
	
	@Size(min=6,max=20,message="密码长度必须位于6到20之间")
	private String password;
	
	@Email(message="email地址不合法")
	private String email;
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
