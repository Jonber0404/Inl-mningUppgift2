package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "Learning Java", "Sven Antenn", "33", "Branch", 50);
		Book book2 = new Book(1, "Learning Java", "Sven Antenn", "33", "Branch", 50);

		boolean result = book1.equals(book2);
		assertTrue(result);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Learning Java", "Sven Antenn", "33", "Branch", 50);
		Book book2 = new Book(2, "Learning JavaScript", "Sven Antenn", "33", "Branch", 50);

		boolean result = book1.equals(book2);
		assertFalse(result);
	}

}
