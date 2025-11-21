package Presentation_Server;
import java.util.List;

import Domain_Server.BibliographicRecord;
public class SystemAdminController {
	private int _adminID;
	private String _username;
	private String _password;
	private String uiState;

	/**
	 * 
	 * @param query
	 * @param filter
	 */
	public void requestCatalogSearch(String query, String filter) {
		// TODO - implement SystemClient.requestCatalogSearch
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param results
	 */
	public void displayResults(List<BibliographicRecord> results) {
		// TODO - implement SystemClient.displayResults
		throw new UnsupportedOperationException();
	}
	
	public void createRecord(BibliographicRecord aData) {
		throw new UnsupportedOperationException();
	}

	public void updateRecord(BibliographicRecord aData) {
		throw new UnsupportedOperationException();
	}

	public void deleteRecord(int aRecordID) {
		throw new UnsupportedOperationException();
	}
}