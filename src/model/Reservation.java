package model;

import java.util.Date;

public class Reservation {

    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    @Override
    public String toString(){
        return "The Customer:" + customer + "The Room:" + room + "Check in Date:" + checkInDate + "Check out Date:" + checkOutDate;
    }
}
