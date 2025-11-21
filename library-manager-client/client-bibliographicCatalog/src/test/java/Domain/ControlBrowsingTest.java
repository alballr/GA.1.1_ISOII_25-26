package Domain;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ControlBrowsingTest {

    @Test
    void getNextPage_IncrementsPageCorrectly() {
        Catalog catalog = new Catalog();
        ControlBrowsing control = new ControlBrowsing(catalog);

        List<String> page1 = control.getNextPage();
        List<String> page2 = control.getNextPage();

        assertEquals("Book 1", page1.get(0));
        assertEquals("Book 6", page2.get(0));
    }

    @Test
    void getNextPage_StopsReturningWhenCatalogIsEmpty() {
        Catalog catalog = new Catalog();
        ControlBrowsing control = new ControlBrowsing(catalog);

        for (int i = 0; i < 10; i++) {
            control.getNextPage(); // consume all pages
        }

        List<String> empty = control.getNextPage();
        assertTrue(empty.isEmpty());
    }
}