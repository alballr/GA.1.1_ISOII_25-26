package Persistence_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.List;
import Domain_Server.BibliographicRecord;

public class CatalogRepositoryTest {

    private CatalogRepository repo;

    @BeforeEach
    public void setup() {
        repo = new CatalogRepository();
    }

    @Test
    public void testFindRecords_ValidQuery() {
        // For now expect UnsupportedOperationException because implementation is missing
        assertThrows(UnsupportedOperationException.class, () -> {
            repo.findRecords("Clean Code", "Book");
        });
    }

    @Test
    public void testFindRecords_EmptyQuery() {
        assertThrows(UnsupportedOperationException.class, () -> {
            repo.findRecords("", "");
        });
    }
}