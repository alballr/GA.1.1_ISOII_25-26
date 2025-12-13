package Domain3;

import org.junit.Test;

public class LoanRenewTest {

	@Test(expected = UnsupportedOperationException.class)
	public void getLoanId() {
		LoanRenew loan = new LoanRenew();
		loan.getLoanId(); // Asume que existe este getter
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getDueDate() {
		LoanRenew loan = new LoanRenew();
		loan.getDueDate();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getRenewalRemaining() {
		LoanRenew loan = new LoanRenew();
		loan.getRenewalRemaining();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getBookId() {
		LoanRenew loan = new LoanRenew();
		loan.getBookId();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getTitle() {
		LoanRenew loan = new LoanRenew();
		loan.getTitle();
	}

}