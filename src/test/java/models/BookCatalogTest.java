package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		Book book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		BookCatalog bc2 = new BookCatalog();
		bc2.addBook(new Book(1,"Learning Java","","","",0));
		assertArrayEquals(bc.getBookArray(), bc2.getBookArray());
		assertEquals(bc2.getNumberOfBooks(), 1);

	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		Book javabook = new Book(1,"Learning Java","","","",0);
		bc.addBook(javabook);
		Book javabook2 = bc.findBook("Learning Java");


		assertEquals(javabook, javabook2);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		Book javabook = new Book(1,"Learning Java","","","",0);
		bc.addBook(javabook);
		Book javabook2 = bc.findBook("learning java");


		assertEquals(javabook, javabook2);
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		Book javabook = new Book(1,"Learning Java","","","",0);
		bc.addBook(javabook);
		Book javabook2 = bc.findBook("      Learning Java   ");


		assertEquals(javabook, javabook2);
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
