package Domain;

import java.util.Date;
import java.util.List;

public class PhysicalSpaceControl {

    /**
     * 
     * @param u
     * @param s
     * @param start
     * @param end
     */
    public boolean requestReservation(User u, PhysicalSpace s, Date start, Date end) {
        // TODO - implement PhysicalSpaceControl.requestReservation
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param reservationID
     */
    public boolean cancelReservation(int reservationID) {
        // TODO - implement PhysicalSpaceControl.cancelReservation
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param reservationID
     * @param newStart
     * @param newEnd
     */
    public boolean modifyReservation(int reservationID, Date newStart, Date newEnd) {
        // TODO - implement PhysicalSpaceControl.modifyReservation
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param startDate
     * @param endDate
     */
    public List<PhysicalSpace> getAvailableSpaces(Date startDate, Date endDate) {
        // TODO - implement PhysicalSpaceControl.getAvailableSpaces
        throw new UnsupportedOperationException();
    }
}
