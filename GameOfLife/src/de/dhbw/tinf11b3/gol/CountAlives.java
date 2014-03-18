package de.dhbw.tinf11b3.gol;

import java.util.List;

public class CountAlives {

	public static Integer forGiven(List<Boolean> states) {
		int count = 0;
		for(Boolean state : states)
			count += state ? 1 : 0;
		return count;
	}

}
