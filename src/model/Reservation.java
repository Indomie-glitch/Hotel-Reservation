package model;
import java.util.regex.Pattern;

public class Reservation {
    private final String checkIn;
    private final String checkOut;
    private final String account;
    private final String email;
    private final String roomnumber;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern pattern = Pattern.compile(emailRegex);


    public Reservation(String checkIn, String checkOut, String account, String email, String roomnumber) {
        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, You have entered an INVALID EMAIL");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.account = account;
        this.email = email;
        this.roomnumber = roomnumber;
    }

    public String getCheckIn () {
        return checkIn;
    }

    public String getCheckOut () {
        return checkOut;
    }

    public String getAccount () {
        return account;
    }

    public String getEmail () {
        return email;
    }

    public String getRoomnumber () {
        return roomnumber;
    }

    @Override
    public String toString () {
        return "Check In:" + checkIn + "\nCheck Out:" + checkOut + "\nEmail:" + email + "\nRoom Number:" + roomnumber;
    }

    }





