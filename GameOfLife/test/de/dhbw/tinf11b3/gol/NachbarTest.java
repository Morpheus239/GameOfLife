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
	public void belebeSpieler() throws Exception{
		
		Spielfeld spielfeld = new Spielfeld(5, 5);
		spielfeld.setAlive(0,0);
		
		assertTrue("player is not alive", spielfeld.isAlive(0,0));
	}

}
