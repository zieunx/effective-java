package com.study.effectivejava.chapter2_객체의생성과파괴.builder;

import com.study.effectivejava.chapter2_객체의생성과파괴.builder.빌더패턴.BuilderStudent;
import com.study.effectivejava.chapter2_객체의생성과파괴.builder.생성자방식.ConstructorStudent;
import com.study.effectivejava.chapter2_객체의생성과파괴.builder.자바빈즈방식.JavaBeansStudent;

public class Main {
	public static void main(String[] args) {

		// 생성자 방식
		ConstructorStudent constructorStudent1 = new ConstructorStudent("조슈아", "010-1234-1234");
		ConstructorStudent constructorStudent2 = new ConstructorStudent("조슈아", "010-1234-1234", 1990);
		ConstructorStudent constructorStudent3 = new ConstructorStudent("조슈아", "010-1234-1234", 1990, 12);
		ConstructorStudent constructorStudent4 = new ConstructorStudent("조슈아", "010-1234-1234", 1990, 12, 23);
		ConstructorStudent constructorStudent5 = new ConstructorStudent("조슈아", "010-1234-1234", 1990, 12, 23, 182, 75);

		// 자바빈즈 방식
		// 일관성과 안정성이 떨어진다.
		JavaBeansStudent javaBeansStudent1 = new JavaBeansStudent();
		javaBeansStudent1.setName("조슈아");
		javaBeansStudent1.setPhone("010-1234-1234");

		JavaBeansStudent javaBeansStudent2 = new JavaBeansStudent();
		javaBeansStudent2.setName("조슈아");
		javaBeansStudent2.setHeight(174);
		javaBeansStudent2.setWeight(66);

		// 빌더패턴
		BuilderStudent builderStudent = new BuilderStudent.Builder("조슈아", "010-1234-1234")
			.year(1990)
			.month(12)
			.day(23)
			.height(182)
			.weight(75)
			.build();
	}
}
