package de.dhbw.tinf11b3.gol;

public class Rules {

	public boolean nextStateOf(boolean b, int aliveNeighbours) {
		
		if(4 == aliveNeighbours){
			return false;
		}
		return (0 != aliveNeighbours) && (1 != aliveNeighbours);
	}

}
