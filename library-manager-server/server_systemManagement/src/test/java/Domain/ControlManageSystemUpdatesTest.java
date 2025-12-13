package Domain;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class ControlManageSystemUpdatesTest {
	 @Test
	    public void testCheckAvailableUpdates_ThrowsUnsupportedOperation() {
	        ControlSystemUpdates control = new ControlSystemUpdates();
	        assertThrows(UnsupportedOperationException.class, () -> control.checkAvailableUpdates());
	    }

	    @Test
	    public void testDownloadUpdate_ThrowsUnsupportedOperation() {
	        ControlSystemUpdates control = new ControlSystemUpdates();
	        SystemUpdatePackage pkg = new SystemUpdatePackage();
	        assertThrows(UnsupportedOperationException.class, () -> control.downloadUpdate(pkg));
	    }

	    @Test
	    public void testValidateUpdate_ThrowsUnsupportedOperation() {
	        ControlSystemUpdates control = new ControlSystemUpdates();
	        SystemUpdatePackage pkg = new SystemUpdatePackage();
	        assertThrows(UnsupportedOperationException.class, () -> control.validateUpdate(pkg));
	    }

	    @Test
	    public void testInstallUpdate_ThrowsUnsupportedOperation() {
	        ControlSystemUpdates control = new ControlSystemUpdates();
	        SystemUpdatePackage pkg = new SystemUpdatePackage();
	        assertThrows(UnsupportedOperationException.class, () -> control.installUpdate(pkg));
	    }

	    @Test
	    public void testLogUpdateAction_ThrowsUnsupportedOperation() {
	        ControlSystemUpdates control = new ControlSystemUpdates();
	        assertThrows(UnsupportedOperationException.class, () -> control.logUpdateAction("install"));
	    }
}
