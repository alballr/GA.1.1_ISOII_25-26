package Persistence;

import org.junit.Test;
import static org.junit.Assert.*;

public class SystemParametersTest {

    @Test
    public void testValidateParameters_ValidValues_ReturnsTrue() {
        SystemParameters params = new SystemParameters(14, 2, "08:00 - 20:00", 0.50);
        assertTrue(params.validateParameters());
    }

    @Test
    public void testValidateParameters_InvalidLoanPeriod_ReturnsFalse() {
        SystemParameters params = new SystemParameters(0, 2, "08:00 - 20:00", 0.50);
        assertFalse(params.validateParameters());
    }

    @Test
    public void testValidateParameters_NegativeRenewals_ReturnsFalse() {
        SystemParameters params = new SystemParameters(14, -1, "08:00 - 20:00", 0.50);
        assertFalse(params.validateParameters());
    }

    @Test
    public void testValidateParameters_EmptyOpeningHours_ReturnsFalse() {
        SystemParameters params = new SystemParameters(14, 2, "", 0.50);
        assertFalse(params.validateParameters());
    }

    @Test
    public void testValidateParameters_NegativePenaltyRate_ReturnsFalse() {
        SystemParameters params = new SystemParameters(14, 2, "08:00 - 20:00", -0.5);
        assertFalse(params.validateParameters());
    }

    @Test
    public void testToString_NotNull() {
        SystemParameters params = new SystemParameters(14, 2, "08:00 - 20:00", 0.50);
        assertNotNull(params.toString());
    }
}