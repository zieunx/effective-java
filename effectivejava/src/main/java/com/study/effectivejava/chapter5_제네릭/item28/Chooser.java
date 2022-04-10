package com.study.effectivejava.chapter5_제네릭.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
	private final Object[] choiceArray;

<<<<<<< HEAD
	public Chooser(Object[] choiceArray) {
		this.choiceArray = choiceArray;
=======
	public Chooser(Collection choices) {
		this.choiceArray = choices.toArray();
>>>>>>> feat(5-item28/배열보다는 리스트를 사용하라): 제네릭을 쓰지 않고 구현한 Chooser
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
