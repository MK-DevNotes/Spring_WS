package com.osp.example.bean;

public class HelloWorldBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName(){
		System.out.println("Hello ! "+name);
	}
}
