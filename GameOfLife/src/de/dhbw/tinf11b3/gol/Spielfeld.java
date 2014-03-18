package de.dhbw.tinf11b3.gol;

public class Spielfeld {
	
	boolean spielfeld[][];
	
	public Spielfeld(int x, int y) {
		spielfeld = new boolean[y][x];
	}

	public void setAlive(int i, int j) {
		spielfeld[j][i] = true;
	}

	public boolean isAlive(int i, int j) {
		return spielfeld[j][i];
	}

}
