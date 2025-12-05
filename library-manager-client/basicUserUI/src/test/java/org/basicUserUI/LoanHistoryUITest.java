package Presentation;

import org.junit.Test;

public class LoanHistoryUITest {

    @Test(expected = UnsupportedOperationException.class)
    public void testRequestLoanHistory() {
        // Setup
        LoanHistoryUI ui = new LoanHistoryUI();
        
        // Ejecución (debe lanzar excepción)
        ui.requestLoanHistory();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDisplayLoanHistory() {
        // Setup
        LoanHistoryUI ui = new LoanHistoryUI();
        
        // Ejecución (debe lanzar excepción)
        ui.displayLoanHistory();
    }
}