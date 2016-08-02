package edu.westga.cs6910.nim.tests.strategies;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.nim.model.strategies.ExpertStrategy;
/**
 * test howmanySticks method in ExpertStrategy class
 * @author Sudarsan Chandrasekhar
 * @version 7/12/2014
 */
public class WhenExpertStrategyDeterminesHowManySticks {
	private ExpertStrategy expertSticks;
	/**
	 * setUp method used to initialize method
	 */
	@Before
	public void setUp() {
		expertSticks = new ExpertStrategy();
	}
	
	/**
	 * Should return 1 stick with pile size of 2
	 */
	@Test
	public void testShouldReturn1ifPileSizeis2() {
		assertEquals(1, expertSticks.howManySticks(2));
	}
	
	/**
	 * Should return 2 sticks with pile size of 3
	 */
	@Test
	public void testShouldReturn2ifPileSizeis3() {
		assertEquals(2, expertSticks.howManySticks(3));
	}
	
	/**
	 * Should return 3 sticks with pile size of 4
	 */
	@Test
	public void testShouldReturn3ifPileSizeis4() {
		assertEquals(3, expertSticks.howManySticks(4));
	}
	
	/**
	 * Should return 1 stick with pile size of 5
	 */
	@Test
	public void testShouldReturn1ifPileSizeis5() {
		assertEquals(1, expertSticks.howManySticks(5));
	}
	
	/**
	 * Should return 3 sticks with pile size of 20
	 */
	@Test
	public void testShouldReturn3ifPileSizeis20() {
		assertEquals(3, expertSticks.howManySticks(20));
	}
	
	/**
	 * Should return 2 sticks with pile size of 19
	 */
	@Test
	public void testShouldReturn2ifPileSizeis19() {
		assertEquals(2, expertSticks.howManySticks(19));
	}
	
	/**
	 * Should return 1 stick with pile size of 18
	 */
	@Test
	public void testShouldReturn1ifPileSizeis18() {
		assertEquals(1, expertSticks.howManySticks(18));
	}
	
	/**
	 * Should return 1 stick with pile size of 17
	 */
	@Test
	public void testShouldReturn1ifPileSizeis17() {
		assertEquals(1, expertSticks.howManySticks(17));
	}


}
