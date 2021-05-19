package api;




import model.Reservation;
import service.HotelApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class HotelResource {

    //Hotel Resource
    private static HotelResource hotelResource = null;

    private HotelResource() {
    }

    public static HotelResource getInstance() {
        if (null == hotelResource) {
            hotelResource = new HotelResource();
        }
        return hotelResource;
    }

    //Reservation
    Collection<Reservation> reservations = new ArrayList<Reservation>();

    public Collection<Reservation> getAllReservation() {
        return reservations;
    }

    public void addReservation(List<Reservation> reservationList) {
        this.reservations.addAll(reservationList);
    }
}


   /* public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date CheckOutDate) {

    }


    public Collection<Reservation>
    getCustomerReservations(String customerEmail) {
        return null;
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut) {
        return null;
    }
}
*/

