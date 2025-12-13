package Domain3;

import org.junit.Test;

public class BookReserTest {

	@Test(expected = UnsupportedOperationException.class)
	public void getTitle() {
		BookReser reser = new BookReser();
		reser.getTitle(); // Asume que existe este getter
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getBookId() {
		BookReser reser = new BookReser();
		reser.getBookId();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getAvailabilityStatus() {
		BookReser reser = new BookReser();
		reser.getAvailabilityStatus();
	}

}