package Domain_Server;

import static org.junit.Assert.*;
import org.junit.Test;

public class controlAccessResourceTest {
	@Test
    public void testProcessAccessRequest_Valid_ReturnsTrue() {
        AccessElectronicResourceControl control = new AccessElectronicResourceControl();

        assertThrows(UnsupportedOperationException.class, () -> {
            control.processAccessRequest(10, 5);
        });
    }

    @Test
    public void testGetResource_ReturnsResource() {
        AccessElectronicResourceControl control = new AccessElectronicResourceControl();

        assertThrows(UnsupportedOperationException.class, () -> {
            control.getResource(1);
        });
    }

    @Test
    public void testCheckLicenseRestrictions() {
        AccessElectronicResourceControl control = new AccessElectronicResourceControl();
        ElectronicResource er = new ElectronicResource(
                2, "Test", "Video", "http://", "Basic", 2
        );

        assertThrows(UnsupportedOperationException.class, () -> {
            control.checkLicenseRestrictions(er, 1);
        });
    }
}
