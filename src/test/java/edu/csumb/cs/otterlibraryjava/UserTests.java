package edu.csumb.cs.otterlibraryjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTests {

	//Test User Create
	@Test
	public void testUserCreate(){
		User testUser = new User("Test Password", "Test User");
		assertNotNull(testUser);
	}
	
	@Test
	public void testUserName(){
		User testUser = new User("Test Password", "Test User");
		assertEquals("Test User", testUser.getUsername());
	}
	
	@Test
	public void testPassWord(){
		User testUser = new User("Test Password", "Test User");
		assertEquals("Test Password", testUser.getPassword());
	}
	
	@Test
	public void testChangeUserName(){
		User testUser = new User("Test Password", "Test User");
		testUser.setUsername("Changed");
		assertEquals("Changed", testUser.getUsername());
	}
	
	@Test
	public void testChangePassword(){
		User testUser = new User("Test Password", "Test User");
		testUser.setPassword("Changed");
		assertEquals("Changed", testUser.getPassword());
	}
	
	@Test
	public void copyUser(){
		User testUser = new User("Test Password", "Test User");
		User copyUser = new User(testUser);
		
		assertNotSame(testUser, copyUser);
		//Failed Test!
		assertEquals(copyUser.getPassword(), testUser.getPassword());
		assertEquals(copyUser.getUsername(), testUser.getUsername());
	}

}
