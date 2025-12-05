package Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControlLoansTest {

    @Test
    void testCreation() {
        ControlLoans control = new ControlLoans();
        assertNotNull(control);
    }
}
