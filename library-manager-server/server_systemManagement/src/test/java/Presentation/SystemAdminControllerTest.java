package Presentation;

import Domain_Server.SystemParameters;
import org.junit.Test;
import static org.junit.Assert.*;

public class SystemAdminControllerTest {

    @Test
    public void testViewCurrentConfiguration_NotNull() {
        SystemAdminController controller = new SystemAdminController(1, "admin");
        assertNotNull(controller.viewCurrentConfiguration());
    }

    @Test
    public void testConfigureSystemParameters_ValidData_ReturnsTrue() {
        SystemAdminController controller = new SystemAdminController(1, "admin");
        SystemParameters params = new SystemParameters(21, 5, "07:00 - 22:00", 0.75);

        assertTrue(controller.configureSystemParameters(params));
    }

    @Test
    public void testConfigureSystemParameters_InvalidData_ReturnsFalse() {
        SystemAdminController controller = new SystemAdminController(1, "admin");
        SystemParameters params = new SystemParameters(0, 5, "07:00 - 22:00", 0.75);

        assertFalse(controller.configureSystemParameters(params));
    }

    @Test
    public void testConfigureSystemParameters_Null_ReturnsFalse() {
        SystemAdminController controller = new SystemAdminController(1, "admin");

        assertFalse(controller.configureSystemParameters(null));
    }
}
