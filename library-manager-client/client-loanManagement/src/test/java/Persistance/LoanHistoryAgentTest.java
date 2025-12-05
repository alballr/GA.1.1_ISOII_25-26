package Persistance;

import org.junit.Test;

public class LoanHistoryAgentTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testGetLoanHistory() {
        // Setup
        LoanHistoryAgent agent = new LoanHistoryAgent();
        String userId = "user123";
        
        // Ejecución (debe lanzar excepción)
        agent.getLoanHistory(userId);
    }
}