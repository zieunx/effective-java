package com.study.effectivejava.chapter2_객체의생성과파괴.builder.생성자방식;

public class ConstructorStudent {
	private String name; // 필수
	private String phone; // 필수
	private int year; // 선택
	private int month; // 선택
	private int day; // 선택
	private float height; // 선택
	private float weight; // 선택

	public ConstructorStudent(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public ConstructorStudent(String name, String phone, int year) {
		this.name = name;
		this.phone = phone;
		this.year = year;
	}

	public ConstructorStudent(String name, String phone, int year, int month) {
		this.name = name;
		this.phone = phone;
		this.year = year;
		this.month = month;
	}

	public ConstructorStudent(String name, String phone, int year, int month, int day) {
		this.name = name;
		this.phone = phone;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public ConstructorStudent(String name, String phone, int year, int month, int day, float height, float weight) {
		this.name = name;
		this.phone = phone;
		this.year = year;
		this.month = month;
		this.day = day;
		this.height = height;
		this.weight = weight;
	}
}
