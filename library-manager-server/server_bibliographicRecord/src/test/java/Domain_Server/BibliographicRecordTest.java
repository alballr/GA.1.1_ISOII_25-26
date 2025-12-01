package Domain_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BibliographicRecordTest {

    private BibliographicRecord record;

    @BeforeEach
    public void setup() {
        record = new BibliographicRecord();
        record.setId(1);
        record.setTitle("Clean Code");
        record.setAuthor("Robert C. Martin");
        record.setIsbn("9780132350884");
        record.setYear(2008);
        record.setType("Book");
        record.setLocation("Shelf A-3");
    }

    @Test
    public void testValidateFields_ValidRecord() {
        assertDoesNotThrow(() -> record.validateFields());
    }

    @Test
    public void testValidateFields_MissingTitle() {
        record.setTitle(null);
        assertThrows(IllegalArgumentException.class, () -> record.validateFields());
    }

    @Test
    public void testToString_NotNull() {
        assertNotNull(record.toString());
    }
}