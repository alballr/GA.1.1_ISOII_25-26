package es.uclm.esi.iso2.axx.library_manager_server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    private CreateRecordControl createControl;
    private UpdateRecordControl updateControl;
    private DeleteRecordControl deleteControl;
    private BibliographicRecord testRecord;

    @BeforeEach
    public void setUp() {
        createControl = new CreateRecordControl();
        updateControl = new UpdateRecordControl();
        deleteControl = new DeleteRecordControl();

        testRecord = new BibliographicRecord(
                1,
                "Example Book",
                "John Writer",
                "1234567890123",
                2024,
                "Book",
                "Shelf A3",
                "Available"
        );
    }

    // --- CREATE TESTS ----------------------------------------------------

    @Test
    public void testCreateRecord_validData() {
        boolean isValid = createControl.validateData(testRecord);
        assertTrue(isValid, "Record should be valid");

        boolean isDuplicate = createControl.checkDuplicate(testRecord);
        assertFalse(isDuplicate, "Record should not be duplicate");

        assertDoesNotThrow(() -> createControl.saveRecord(testRecord));
    }

    @Test
    public void testCreateRecord_invalidData() {
        testRecord.setIsbn("invalid");
        boolean isValid = createControl.validateData(testRecord);
        assertFalse(isValid, "Invalid ISBN should fail validation");
    }

    @Test
    public void testCreateRecord_duplicateISBN() {
        // Create it once
        createControl.saveRecord(testRecord);

        // Second attempt should detect duplication
        boolean isDuplicate = createControl.checkDuplicate(testRecord);
        assertTrue(isDuplicate, "Duplicate ISBN must be detected");
    }

    // --- UPDATE TESTS ----------------------------------------------------

    @Test
    public void testUpdateRecord_validUpdate() {
        createControl.saveRecord(testRecord);
        testRecord.setTitle("New Title");

        assertTrue(updateControl.validateData(testRecord));
        assertDoesNotThrow(() -> updateControl.updateRecord(testRecord));
    }

    @Test
    public void testUpdateRecord_recordNotFound() {
        assertThrows(RuntimeException.class, () -> updateControl.updateRecord(testRecord));
    }

    // --- DELETE TESTS ----------------------------------------------------

    @Test
    public void testDeleteRecord_validDeletion() {
        createControl.saveRecord(testRecord);
        boolean hasDependencies = deleteControl.checkDependencies(testRecord.getRecordID());
        assertFalse(hasDependencies);

        assertDoesNotThrow(() -> deleteControl.deleteRecord(testRecord.getRecordID()));
    }

    @Test
    public void testDeleteRecord_activeDependencies() {
        // Simulate dependencies
        deleteControl.simulateDependencyForTest(testRecord.getRecordID());

        boolean hasDependencies = deleteControl.checkDependencies(testRecord.getRecordID());
        assertTrue(hasDependencies);

        assertThrows(RuntimeException.class, () -> deleteControl.deleteRecord(testRecord.getRecordID()));
    }
}
