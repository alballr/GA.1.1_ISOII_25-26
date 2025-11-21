package Domain_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.List;

public class ControlSearchCatalogTest {

    private ControlSearchCatalog control;

    @BeforeEach
    public void setup() {
        control = new ControlSearchCatalog();
    }

    @Test
    public void testSearch_ValidQuery() {
        assertThrows(UnsupportedOperationException.class, () -> {
            control.search("Clean Code", "Book");
        });
    }

    @Test
    public void testSearch_NullQuery() {
        assertThrows(IllegalArgumentException.class, () -> {
            control.search(null, null);
        });
    }
}