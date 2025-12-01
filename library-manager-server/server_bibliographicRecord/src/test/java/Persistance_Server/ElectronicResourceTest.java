package Persistance_Server;

import static org.junit.Assert.*;
import org.junit.Test;

public class ElectronicResourceTest {

    @Test
    public void testIsLicensedFor_Allowed_ReturnsTrue() {
        ElectronicResource resource = new ElectronicResource(
            1, "Test Resource", "PDF", "url.com", "StandardLicense", 1
        );

        assertThrows(UnsupportedOperationException.class, () -> {
            resource.isLicensedFor(1);
        });
    }

    @Test
    public void testIsLicensedFor_NotAllowed_ReturnsFalse() {
        ElectronicResource resource = new ElectronicResource(
            1, "Test Resource", "PDF", "url.com", "StandardLicense", 2
        );

        assertThrows(UnsupportedOperationException.class, () -> {
            resource.isLicensedFor(0);
        });
    }
}
