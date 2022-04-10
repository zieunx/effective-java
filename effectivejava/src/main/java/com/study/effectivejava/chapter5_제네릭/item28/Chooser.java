package com.study.effectivejava.chapter5_제네릭.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
	private final T[] choiceArray;

	public Chooser(Collection<T> choices) {
		this.choiceArray = (T[]) choices.toArray();
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
