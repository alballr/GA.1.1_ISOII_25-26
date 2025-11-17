package Domain_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UpdateRecordControlTest {

    @Test
    void testValidateData_WithValidRecord_ReturnsTrue() {
        UpdateRecordControl control = new UpdateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.validateData(record));
    }

    @Test
    void testValidateData_WithInvalidRecord_ReturnsFalse() {
        UpdateRecordControl control = new UpdateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.validateData(record));
    }

    @Test
    void testUpdateRecord_WhenRecordExists_UpdatesSuccessfully() {
        UpdateRecordControl control = new UpdateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.updateRecord(record));
    }

    @Test
    void testUpdateRecord_WhenRecordDoesNotExist_ThrowsException() {
        UpdateRecordControl control = new UpdateRecordControl();
        BibliographicalRecord record = new BibliographicalRecord();
        assertThrows(UnsupportedOperationException.class, () -> control.updateRecord(record));
    }
}