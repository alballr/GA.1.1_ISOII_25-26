package Presentation_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Domain_Server.BibliographicalRecord;

public class SystemAdminControllerTest {

    @Test
    void testCreateRecord_ValidData_CallsControlCreateRecord() {
        SystemAdminController controller = new SystemAdminController();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> controller.createRecord(record));
    }

    @Test
    void testUpdateRecord_ValidData_CallsControlUpdateRecord() {
        SystemAdminController controller = new SystemAdminController();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> controller.updateRecord(record));
    }

    @Test
    void testDeleteRecord_ValidID_CallsControlDeleteRecord() {
        SystemAdminController controller = new SystemAdminController();
        assertThrows(UnsupportedOperationException.class, () -> controller.deleteRecord(1));
    }
}