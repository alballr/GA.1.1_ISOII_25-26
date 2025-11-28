package Domain_Server;

public class controlAccessResource {
	public controlAccessResource() {
        // Constructor stub
    }
	
    public boolean processAccessRequest(int userID, int resourceID) {
        throw new UnsupportedOperationException();
    }

    protected ElectronicResource getResource(int resourceID) {
        throw new UnsupportedOperationException();
    }

    protected boolean checkLicenseRestrictions(ElectronicResource resource, int userAccessLevel) {
        throw new UnsupportedOperationException();
    }
}
