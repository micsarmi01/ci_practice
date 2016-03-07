package edu.csumb.cs.otterlibraryjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionsTest {

	@Test
	public void testCreate() {
		//tring username, int type, double rentalCost, String title, String date,
        //String time, String pickUpDate, String dropOffDate, int pickDayYear, int dropDayYear,int reservation)
	
		Transaction testTransaction = new Transaction("Test User", 1, 5.00, "Test Title", "March 4 2016", "24:00", "March 3 2016", "March 5 2016", 323, 325, 1);
		
		assertNotNull(testTransaction);
	}
	@Test
	public void testCopy(){
		Transaction testTransaction = new Transaction("Test User", 1, 5.00, "Test Title", "March 4 2016", "24:00", "March 3 2016", "March 5 2016", 323, 325, 1);
		Transaction copyTransaction = new Transaction(testTransaction);
		
		assertNotSame(testTransaction, copyTransaction);
	}
	@Test
	public void testCopyValues(){
		Transaction testTransaction = new Transaction("Test User", 1, 5.00, "Test Title", "March 4 2016", "24:00", "March 3 2016", "March 5 2016", 323, 325, 1);
		Transaction copyTransaction = new Transaction(testTransaction);
		
		assertNotSame(testTransaction, copyTransaction);
		assertEquals(testTransaction.getId(),copyTransaction.getId());
		assertEquals(testTransaction.getUsername(),copyTransaction.getUsername());
	}
	@Test
	public void testChangeDate() {
		//tring username, int type, double rentalCost, String title, String date,
        //String time, String pickUpDate, String dropOffDate, int pickDayYear, int dropDayYear,int reservation)
	
		Transaction testTransaction = new Transaction("Test User", 1, 5.00, "Test Title", "March 4 2016", "24:00", "March 3 2016", "March 5 2016", 323, 325, 1);
		
		testTransaction.setPickUpDate("Changed");
		assertEquals("Changed", testTransaction.getPickUpDate());
	}
	
	

}
