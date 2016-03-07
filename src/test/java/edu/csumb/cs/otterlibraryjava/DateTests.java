package edu.csumb.cs.otterlibraryjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTests {

	@Test
	public void createTest(){
		Date testDate = new Date("March", "15", "2016");
		assertNotNull(testDate);
	}
	@Test
	public void testNumberConversionLeap(){
		Date testDate = new Date("March", "15", "2016");
		assertEquals(75, testDate.getDayNumber());
	}
	@Test
	public void testNumberConversion(){
		Date testDate = new Date("March", "15", "2015");
		assertEquals(74, testDate.getDayNumber());
	}

}
