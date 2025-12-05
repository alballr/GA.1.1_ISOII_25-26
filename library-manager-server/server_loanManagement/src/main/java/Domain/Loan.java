package Domain;

public class Loan {
	public String _loanId;
	public String _memberId;
	public String _itemId;
	public Date _loanDate;
	public Date _dueDate;
	public Date _returnDate;

	public boolean isReturned() {
		throw new UnsupportedOperationException();
	}

	public boolean isOverdue(Date aCurrentDate) {
		throw new UnsupportedOperationException();
	}
}