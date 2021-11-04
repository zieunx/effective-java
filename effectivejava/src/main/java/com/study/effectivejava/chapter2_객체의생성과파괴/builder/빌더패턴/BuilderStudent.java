package com.study.effectivejava.chapter2_객체의생성과파괴.builder.빌더패턴;

public class BuilderStudent {
	// 필수
	private final String name;
	private final String phone;
	// 선택: 선택 매개변수는 기본값으로 초기화 한다.
	private final int year;
	private final int month;
	private final int day;
	private final float height;
	private final float weight;

	public static class Builder {
		// 필수
		private final String name;
		private final String phone;
		// 선택: 선택 매개변수는 기본값으로 초기화 한다.
		private int year = 0;
		private int month = 0;
		private int day = 0;
		private float height = 0;
		private float weight = 0;

		public Builder(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		public Builder year(int year) {
			this.year = year;
			return this;
		}

		public Builder month(int month) {
			this.month = month;
			return this;
		}

		public Builder day(int day) {
			this.day = day;
			return this;
		}

		public Builder height(int height) {
			this.height = height;
			return this;
		}

		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		public BuilderStudent build() {
			return new BuilderStudent(this);
		}
	}

	public BuilderStudent(Builder builder) {
		this.name = builder.name;
		this.phone = builder.phone;
		this.year = builder.year;
		this.month = builder.month;
		this.day = builder.day;
		this.height = builder.height;
		this.weight = builder.weight;
	}
}
