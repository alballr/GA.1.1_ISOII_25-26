package Domain3;

import org.junit.Test;

public class BookActionsControllerTest {

	@Test(expected = UnsupportedOperationException.class)
	public void renewLoan() {
		BookActionsController controller = new BookActionsController();
		controller.renewLoan("loanId_test");
	}

	@Test(expected = UnsupportedOperationException.class)
	public void reserveBook() {
		BookActionsController controller = new BookActionsController();
		controller.reserveBook("bookId_test");
	}

}