package com.study.effectivejava.chapter2_객체의생성과파괴.builder.계층구조와어울리는빌더패턴;

import static com.study.effectivejava.chapter2_객체의생성과파괴.builder.계층구조와어울리는빌더패턴.NewYorkPizza.Size.*;
import static com.study.effectivejava.chapter2_객체의생성과파괴.builder.계층구조와어울리는빌더패턴.Pizza.Topping.*;

public class Main {
	public static void main(String[] args) {
		NewYorkPizza newYorkPizza = new NewYorkPizza.Builder(SMALL)
			.addTopping(SAUSAGE)
			.addTopping(ONION)
			.build();

		CalzonePizza calzonePizza = new CalzonePizza.Builder()
			.addTopping(HAM)
			.sourceInside()
			.build();
	}
}
