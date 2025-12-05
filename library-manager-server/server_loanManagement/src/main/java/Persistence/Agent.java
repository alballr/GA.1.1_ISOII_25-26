package Persistence;

import Domain.Loan;

public class Agent {

	public Connection connection() {
		throw new UnsupportedOperationException();
	}

	public void saveLoan(Loan aLoan) {
		throw new UnsupportedOperationException();
	}

	public void updateLoan(Loan aLoan) {
		throw new UnsupportedOperationException();
	}

	public Vector<Loan> fetchActiveLoans(String aMemberId) {
		throw new UnsupportedOperationException();
	}

	public Vector<Loan> fetchLoanHistory(String aMemberId) {
		throw new UnsupportedOperationException();
	}

	public Loan fetchLoanById(String aLoanId) {
		throw new UnsupportedOperationException();
	}
}