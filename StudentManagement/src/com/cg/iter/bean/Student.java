package com.cg.iter.bean;

public class Student {
	
	private int id;
	private String name;
	private long mobile;
	private String subject;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, long mobile, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", subject=" + subject + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	 

}
