package de.dhbw.tinf11b3.gol;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NachbarTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void belebeSpieler() throws Exception {

		Spielfeld spielfeld = new Spielfeld(5, 5);

		spielfeld.setAlive(0, 0);

		assertTrue("player is not alive", spielfeld.isAlive(0, 0));
		assertFalse("player is a zombie", spielfeld.isAlive(1, 0));
		assertFalse("player is a zombie", spielfeld.isAlive(0, 1));
	}

	@Test
	public void initialisiereSpielfeld() throws Exception {
		Spielfeld spielfeld = new Spielfeld(50, 50);

		for(int i = 0; i < 50; i++) {
			for(int k = 0; k < 50; k++) {
				assertFalse("Spielfeld nicht leer initialisiert!", spielfeld.isAlive(i, k));
			}
		}
	}

	@Test
	public void zaehleNachbarn() throws Exception {

		Spielfeld spielfeld = new Spielfeld(50, 50);
		spielfeld.setAlive(1, 1);

		Integer anz_Nachbarn = spielfeld.zaehleNachbarn(1, 1);

		assertEquals("unexpected number of neighbors", new Integer(0), anz_Nachbarn);

		// Ein Nachbar
		spielfeld.setAlive(1, 2);
		assertEquals("ein Spieler vermisst einen Nachbarn!", new Integer(1), anz_Nachbarn);

		// Ein Spieler, aber kein Nachbar!
		spielfeld.setAlive(1, 3);
		assertEquals("ein Spieler hat Zombie Nachbarn!", new Integer(1), anz_Nachbarn);

		// Ein Nachbar mehr
		spielfeld.setAlive(0, 0);
		assertEquals("ein Spieler vermisst einen Nachbarn!", new Integer(2), anz_Nachbarn);

	}

}
