package de.dhbw.tinf11b3.gol;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RulesTest {

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
	public void birth() {
		boolean nextState = new Rules().nextStateOf(false, 3);
		assertTrue("nothing was born", nextState);
	}

	@Test
	public void isolation() throws Exception {
		assertFalse("no death by isolation", new Rules().nextStateOf(true, 0));
		assertFalse("no death by isolation", new Rules().nextStateOf(true, 1));
	}

	@Test
	public void continuation() throws Exception {
		assertTrue("no continuation", 
				new Rules().nextStateOf(true, 2));
		
		assertTrue("no continuation", 
				new Rules().nextStateOf(true, 3));
	
	}

	@Test
	public void overcrowding() throws Exception {
		assertFalse("no overcrowding",
				new Rules().nextStateOf(true, 4));
		assertFalse("no overcrowding",
				new Rules().nextStateOf(true, 5));
		assertFalse("no overcrowding",
				new Rules().nextStateOf(true, 6));
		assertFalse("no overcrowding",
				new Rules().nextStateOf(true, 7));
		assertFalse("no overcrowding",
				new Rules().nextStateOf(true, 8));
	}
	
	@Test
	public void noZombies() throws Exception {
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 2));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 0));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 1));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 4));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 5));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 6));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 7));
		assertFalse("no zombies in here",
				new Rules().nextStateOf(false, 8));
	}
	
}
