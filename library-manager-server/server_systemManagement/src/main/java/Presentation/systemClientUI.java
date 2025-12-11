package Presentation;

public class systemClientUI {

	private int ID;
    private String username;
    
    private ControlSystemUpdates controlUpdates = new ControlSystemUpdates();
	
	/**
	 * 
	 * @param request
	 */
	public Response handleRolesRequest(Request request) {
		// TODO - implement systemClientUI.handleRolesRequest
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param response
	 */
	public void sendResponse(Response response) {
		// TODO - implement systemClientUI.sendResponse
		throw new UnsupportedOperationException();
	}
	
	public boolean configureSystemParameters(SystemParameters params) {
		throw new UnsupportedOperationException();
    }

    public SystemParameters viewCurrentConfiguration() {
    	throw new UnsupportedOperationException();
    }

    public SystemUpdatePackage checkForUpdates() {
        throw new UnsupportedOperationException();
    }

    public boolean downloadUpdate() {
        throw new UnsupportedOperationException();
    }

    public boolean installUpdate() {
        throw new UnsupportedOperationException();
    }
    
}