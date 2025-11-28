package Domain;

import java.util.Date;

public class Loan {

    private int loanID;
    private Date loanDate;
    private Date dueDate;
    private Date returnDate;
    private int renewalCount;
    private String status;

    public boolean renew() {
        // TODO - implement Loan.renew
        throw new UnsupportedOperationException();
    }

    public void returnLoan() {
        // TODO - implement Loan.returnLoan
        throw new UnsupportedOperationException();
    }

    public boolean isOverdue() {
        // TODO - implement Loan.isOverdue
        throw new UnsupportedOperationException();
    }
}
