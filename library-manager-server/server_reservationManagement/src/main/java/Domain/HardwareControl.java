package Domain;

import java.util.Date;
import java.util.List;

public class HardwareControl {

    public boolean requestHardwareLoan(int userID, int hardwareID, Date beginDate, Date endDate) {
        // TODO - implement HardwareControl.requestHardwareLoan
        throw new UnsupportedOperationException();
    }

    public boolean cancelHardwareLoan(int loanID) {
        // TODO - implement HardwareControl.cancelHardwareLoan
        throw new UnsupportedOperationException();
    }

    public boolean modifyHardwareLoan(int loanID, Date newBegin, Date newEnd) {
        // TODO - implement HardwareControl.modifyHardwareLoan
        throw new UnsupportedOperationException();
    }

    public List<Hardware> getAvailableHardware(Date beginDate, Date endDate) {
        // TODO - implement HardwareControl.getAvailableHardware
        throw new UnsupportedOperationException();
    }
}
