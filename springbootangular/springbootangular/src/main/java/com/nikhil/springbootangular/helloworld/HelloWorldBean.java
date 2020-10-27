package com.nikhil.springbootangular.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	

	public Object getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}


}
