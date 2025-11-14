package es.uclm.esi.iso2.axx.library_manager_server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Control.Control_UserAccounts;

public class ControlUserAccountTest {
    
    @Test
    public void shouldAnswerWithTrue() {
        Control_UserAccounts control = new Control_UserAccounts();
        assertNotNull(control);
    }
}
