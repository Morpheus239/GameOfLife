package de.dhbw.tinf11b3.gol;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	public void zaehleNachbarn() throws Exception {
		
		List<Boolean> states = Arrays.asList(
			false, false, false, true, false, false, false, false
		);
		
		assertEquals("Nachbarschaft inkorrekt!",
				new Integer(1),
				CountAlives.forGiven(states)
		);
		
		
		states = Arrays.asList(
				true, true, false, true, false, false, false, false
			);
			
		assertEquals("Nachbarschaft inkorrekt!",
				new Integer(3),
				CountAlives.forGiven(states)
		);
		
	}

}
