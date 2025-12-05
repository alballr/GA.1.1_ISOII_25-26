package Domain;

import org.junit.Test;

public class LoanHistoryControllerTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testLoadLoanHistory() {
        // Setup
        LoanHistoryController controller = new LoanHistoryController();
        
        // Ejecución (debe lanzar excepción)
        controller.loadLoanHistory();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOnHistoryLoaded() {
        // Setup
        LoanHistoryController controller = new LoanHistoryController();
        LoanRecord dummyRecord = new LoanRecord(); 
        
        // Ejecución (debe lanzar excepción)
        controller.onHistoryLoaded(dummyRecord);
    }
}