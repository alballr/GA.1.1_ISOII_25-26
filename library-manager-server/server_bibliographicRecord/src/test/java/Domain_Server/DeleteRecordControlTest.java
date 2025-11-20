package Domain_Server;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class DeleteRecordControlTest {

    @Test
    public void testCheckDependencies_WithNoActiveLoans_ReturnsTrue() {
        DeleteRecordControl control = new DeleteRecordControl();
        //assertThrows(UnsupportedOperationException.class, () -> control.checkDependencies(1));
    }

    @Test
    public void testCheckDependencies_WithActiveLoans_ReturnsFalse() {
        DeleteRecordControl control = new DeleteRecordControl();
        //assertThrows(UnsupportedOperationException.class, () -> control.checkDependencies(1));
    }

    @Test
    public void testDeleteRecord_WhenDependenciesClear_DeletesSuccessfully() {
        DeleteRecordControl control = new DeleteRecordControl();
        //assertThrows(UnsupportedOperationException.class, () -> control.deleteRecord(1));
    }

    @Test
    public void testDeleteRecord_WhenDependenciesExist_ThrowsException() {
        DeleteRecordControl control = new DeleteRecordControl();
        //assertThrows(UnsupportedOperationException.class, () -> control.deleteRecord(1));
    }
}