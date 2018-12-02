package com.thd.springboottest.bean.humen;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	private int age;
	public Person(String name) {
		super();
		this.name = name;
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
	public Person() {
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return this.getClass().getName() + " " + this.name + " " + this.age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
