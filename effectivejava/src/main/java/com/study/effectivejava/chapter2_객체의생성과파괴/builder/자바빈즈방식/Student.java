package com.study.effectivejava.chapter2_객체의생성과파괴.builder.자바빈즈방식;

public class Student {
	private String name; // 필수
	private String phone; // 필수
	private int year; // 선택
	private int month; // 선택
	private int day; // 선택
	private float height; // 선택
	private float weight; // 선택

	public Student() {}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
