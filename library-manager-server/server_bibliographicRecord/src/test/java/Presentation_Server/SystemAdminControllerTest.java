package Presentation_Server;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import Domain_Server.BibliographicRecord;

public class SystemAdminControllerTest {

    @Test
    public void testCreateRecord_ValidData_CallsControlCreateRecord() {
        SystemAdminController controller = new SystemAdminController();
        BibliographicRecord record = new BibliographicRecord();
        //assertThrows(UnsupportedOperationException.class, () -> controller.createRecord(record));
    }

    @Test
    public void testUpdateRecord_ValidData_CallsControlUpdateRecord() {
        SystemAdminController controller = new SystemAdminController();
        BibliographicRecord record = new BibliographicRecord();
        //assertThrows(UnsupportedOperationException.class, () -> controller.updateRecord(record));
    }

    @Test
    public void testDeleteRecord_ValidID_CallsControlDeleteRecord() {
        SystemAdminController controller = new SystemAdminController();
        //assertThrows(UnsupportedOperationException.class, () -> controller.deleteRecord(1));
    }
}