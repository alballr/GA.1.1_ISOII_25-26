package Presentation;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientUITest {

    @Test
    void requestNextPage_PrintsResults() {
        Catalog catalog = new Catalog();
        ControlBrowsing control = new ControlBrowsing(catalog);
        ClientUI ui = new ClientUI(control);

        // intercept console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ui.requestNextPage();

        String output = out.toString();

        assertTrue(output.contains("Displaying page results"));
        assertTrue(output.contains("Book 1"));
        assertTrue(output.contains("Book 5"));
    }
}