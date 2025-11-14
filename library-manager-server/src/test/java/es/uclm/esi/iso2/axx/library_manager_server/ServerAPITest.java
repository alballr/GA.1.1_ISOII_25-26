package es.uclm.esi.iso2.axx.library_manager_server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Interface.ServerAPI;

public class ServerAPITest {
    
    @Test
    public void shouldAnswerWithTrue() {
        ServerAPI api = new ServerAPI();
        assertNotNull(api);
    }
}
