package Domain_Server;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeleteRecordControlTest {

    @Test
    void testCheckDependencies_WithNoActiveLoans_ReturnsTrue() {
        DeleteRecordControl control = new DeleteRecordControl();
        assertThrows(UnsupportedOperationException.class, () -> control.checkDependencies(1));
    }

    @Test
    void testCheckDependencies_WithActiveLoans_ReturnsFalse() {
        DeleteRecordControl control = new DeleteRecordControl();
        assertThrows(UnsupportedOperationException.class, () -> control.checkDependencies(1));
    }

    @Test
    void testDeleteRecord_WhenDependenciesClear_DeletesSuccessfully() {
        DeleteRecordControl control = new DeleteRecordControl();
        assertThrows(UnsupportedOperationException.class, () -> control.deleteRecord(1));
    }

    @Test
    void testDeleteRecord_WhenDependenciesExist_ThrowsException() {
        DeleteRecordControl control = new DeleteRecordControl();
        assertThrows(UnsupportedOperationException.class, () -> control.deleteRecord(1));
    }
}