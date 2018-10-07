package com.sourabh.udemy.XMLConfiguration;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String[] data = {
			"Happy Journey",
			"Glad to meet you",
			"Have a nice day",
			"You have a great day"	};
	Random random = new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
