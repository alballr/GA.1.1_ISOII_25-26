package Domain_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreateRecordControlTest {

    @Test
    void testValidateData_WithValidRecord_ReturnsTrue() {
        CreateRecordControl control = new CreateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.validateData(record));
    }

    @Test
    void testValidateData_WithInvalidRecord_ReturnsFalse() {
        CreateRecordControl control = new CreateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.validateData(record));
    }

    @Test
    void testCheckDuplicate_WhenRecordDoesNotExist_ReturnsFalse() {
        CreateRecordControl control = new CreateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.checkDuplicate(record));
    }

    @Test
    void testCheckDuplicate_WhenRecordExists_ReturnsTrue() {
        CreateRecordControl control = new CreateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.checkDuplicate(record));
    }

    @Test
    void testSaveRecord_PersistsRecordSuccessfully() {
        CreateRecordControl control = new CreateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.saveRecord(record));
    }
}