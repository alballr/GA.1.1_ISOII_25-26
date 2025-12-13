package Persistance3;

import org.junit.Test;

public class BookActionAgentTest {

	@Test(expected = UnsupportedOperationException.class)
	public void getRenewal() {
		BookActionAgent agent = new BookActionAgent();
		agent.getRenewal("bookId_test");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getReservation() {
		BookActionAgent agent = new BookActionAgent();
		agent.getReservation("bookId_test");
	}

}