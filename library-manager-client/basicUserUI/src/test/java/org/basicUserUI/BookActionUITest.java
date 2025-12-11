package Presentation3;

import org.junit.Test;

public class BookActionUITest {

	@Test(expected = UnsupportedOperationException.class)
	public void requestRenew() {
		BookActionUI ui = new BookActionUI();
		ui.requestRenew("loanId_test");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void requestReserve() {
		BookActionUI ui = new BookActionUI();
		ui.requestReserve("bookId_test");
	}

}