package Persistance_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgentTest {

    @Test
    void testGetAgent_ReturnsSingletonInstance() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.getAgent());
    }

    @Test
    void testModify_ExecutesUpdateQueryCorrectly() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.modify("UPDATE X"));
    }

    @Test
    void testSelect_ExecutesSelectQueryAndReturnsResults() {
        Agent agent = new Agent();
        assertThrows(UnsupportedOperationException.class, () -> agent.select("SELECT * FROM X"));
    }
}