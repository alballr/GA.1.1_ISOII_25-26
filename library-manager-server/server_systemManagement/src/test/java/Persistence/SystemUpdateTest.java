package Persistence;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
public class SystemUpdateTest {
	@Test
    public void testIsValidChecksum_ThrowsUnsupportedOperation() {
        SystemUpdatePackage pkg = new SystemUpdatePackage();
        assertThrows(UnsupportedOperationException.class, () -> pkg.isValidChecksum());
    }

    @Test
    public void testToString_ThrowsUnsupportedOperation() {
        SystemUpdatePackage pkg = new SystemUpdatePackage();
        assertThrows(UnsupportedOperationException.class, () -> pkg.toString());
    }
}
