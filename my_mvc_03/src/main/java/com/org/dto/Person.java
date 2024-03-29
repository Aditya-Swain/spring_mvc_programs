package com.org.dto;

public class Person {
		
	private String name;
	
	private int age;
	
	private long mobile;
	
	private String email;
	
	private String password;

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobile=" + mobile + ", email=" + email + ", password="
				+ password + "]";
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person(String name, int age, long mobile) {
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	
	
}
