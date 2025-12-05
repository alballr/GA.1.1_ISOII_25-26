package Domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControlConfigureSystemParametersTest {

    @Test
    public void testLoadCurrentParameters_NotNull() {
        ControlConfigureSystemParameters control = new ControlConfigureSystemParameters();
        assertNotNull(control.loadCurrentParameters());
    }

    @Test
    public void testApplyNewConfiguration_ValidParameters_ReturnsTrue() {
        ControlConfigureSystemParameters control = new ControlConfigureSystemParameters();
        SystemParameters newParams = new SystemParameters(10, 1, "09:00 - 18:00", 0.25);

        assertTrue(control.applyNewConfiguration(newParams));
    }

    @Test
    public void testApplyNewConfiguration_InvalidParameters_ReturnsFalse() {
        ControlConfigureSystemParameters control = new ControlConfigureSystemParameters();
        SystemParameters newParams = new SystemParameters(-5, 1, "09:00 - 18:00", 0.25);

        assertFalse(control.applyNewConfiguration(newParams));
    }

    @Test
    public void testApplyNewConfiguration_Null_ReturnsFalse() {
        ControlConfigureSystemParameters control = new ControlConfigureSystemParameters();
        assertFalse(control.applyNewConfiguration(null));
    }
}
