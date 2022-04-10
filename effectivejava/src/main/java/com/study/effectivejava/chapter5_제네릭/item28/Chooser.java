package com.study.effectivejava.chapter5_제네릭.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
	private final List<T> choiceList;

	public Chooser(Collection<T> choices) {
		this.choiceList = new ArrayList<>(choices);
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(choiceList.size()));
	}
}
