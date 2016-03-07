package edu.csumb.cs.otterlibraryjava;
import static org.junit.Assert.*;

import org.junit.Test;

public class BookTests {

	//Test Book Creation
	@Test
	public void testBookCreation(){
		Book testBookCreate = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		assertNotNull(testBookCreate);
	}

	//Test Title
	@Test
	public void getTitleTest(){
		Book testBook = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		assertEquals("Test Book", testBook.getTitle());
	}
	@Test
	public void getTitleTestChange(){
		Book testBookTitle = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		testBookTitle.setTitle("Changed");
		assertEquals("Changed", testBookTitle.getTitle());
	}
	
	//Test Author
	@Test
	public void getAuthorTest(){
		Book testBook = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		assertEquals("Test Author", testBook.getAuthor());
	}
	@Test
	public void getAuthorTestChange(){
		Book testBookTitle = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		testBookTitle.setAuthor("Changed");
		assertEquals("Changed", testBookTitle.getAuthor());
	}
	//Test Cost
	@Test
	public void testChangeCost(){
		Book testBook= new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		testBook.setPrice(5.00);
		assertEquals(5.00, testBook.getPrice(),0);
		testBook.setPrice(10000000000.00);
		assertEquals(10000000000.00, testBook.getPrice(),0);
	}
	
	//Test ISBN
	@Test
	public void getISBNTest(){
		Book testBook = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		assertEquals("Test ISBN", testBook.getIsbn());
	}
	@Test
	public void getISBNTestChange(){
		Book testBookTitle = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		testBookTitle.setIsbn("Changed");
		assertEquals("Changed", testBookTitle.getIsbn());
	}
	
	@Test
	public void copyBook(){
		Book testBook = new Book("Test Book", "Test Author", "Test ISBN", 2.00);
		Book copyBook = new Book(testBook);
		
		assertNotSame(testBook, copyBook);
		
		assertEquals(testBook.getAuthor(), copyBook.getAuthor());
		assertEquals(testBook.getTitle(), copyBook.getTitle());
	}
	
	

}

