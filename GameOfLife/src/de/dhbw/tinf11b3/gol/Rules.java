package de.dhbw.tinf11b3.gol;

public class Rules {

	public boolean nextStateOf(boolean isAlive, int aliveNeighbours) {

		if(2 == aliveNeighbours) {
			return isAlive;
		}
		return(3 == aliveNeighbours);
	}

}
