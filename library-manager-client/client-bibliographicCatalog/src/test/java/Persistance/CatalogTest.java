package Persistance;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void fetchPage_ReturnsCorrectPage() {
        Catalog catalog = new Catalog();
        
        List<String> page1 = catalog.fetchPage(1);
        List<String> page2 = catalog.fetchPage(2);

        assertEquals(5, page1.size());
        assertEquals(5, page2.size());

        assertEquals("Book 1", page1.get(0));
        assertEquals("Book 6", page2.get(0));
    }

    @Test
    void fetchPage_BeyondLastPage_ReturnsEmptyList() {
        Catalog catalog = new Catalog();

        List<String> page999 = catalog.fetchPage(999);

        assertTrue(page999.isEmpty());
    }
}