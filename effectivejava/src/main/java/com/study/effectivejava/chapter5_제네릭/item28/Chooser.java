package com.study.effectivejava.chapter5_제네릭.item28;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
	private final Object[] choiceArray;

	public Chooser(Object[] choiceArray) {
		this.choiceArray = choiceArray;
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
