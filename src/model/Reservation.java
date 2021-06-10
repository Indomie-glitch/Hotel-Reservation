package model;
import api.AdminResource;
import api.HotelResource;

import java.util.*;
import java.util.regex.Pattern;



public class Reservation{
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

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public String getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    @Override
    public String toString() {
        return "Check In:" + checkIn + "\nCheck Out:" + checkOut + "\nEmail:" + email + "\nRoom Number:" + roomnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(getCheckIn(), that.getCheckIn()) && Objects.equals(getCheckOut(), that.getCheckOut()) && Objects.equals(getAccount(), that.getAccount()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getRoomnumber(), that.getRoomnumber()) && Objects.equals(emailRegex, that.emailRegex) && Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCheckIn(), getCheckOut(), getAccount(), getEmail(), getRoomnumber(), emailRegex, pattern);
    }

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            List<Reservation> reservationList = new ArrayList<Reservation>();
            System.out.println("Enter CheckIn Date mm/dd/yyyy example 12/12/1212");
            String CheckIn = (scanner.next());
            System.out.println("Enter CheckOut Date mm/dd/yyyy example 11/11/1111");
            String Checkout = (scanner.next());
            System.out.println("All the Rooms");
            Collection<IRoom> rooms = AdminResource.getInstance().getAllRoom();
            for (IRoom room : rooms) {
                System.out.print("The Room Number " + room.getRoomNumber() + "   ");
                System.out.print("The Price of the Room " + room.getRoomPrice() + "   ");
                System.out.print("Double or Single " + room.getRoomType() + "   || \n");
            }
            System.out.println("Do you want to book a room, Yes (1) or No (2)");
            int boook = Integer.parseInt(scanner.next());
            switch (boook) {
                case 1 -> {

                    System.out.println("Do you have an account with us, Yes or No");
                    String account = (scanner.next());
                    System.out.println("What is your Email");
                    String email = (scanner.next());
                    System.out.println("What is the Room Number you want to reserve");
                    String roomnumber = (scanner.next());
                    Reservation reservation = new Reservation(CheckIn, Checkout, account, email, roomnumber);
                    HotelResource.getInstance().addReservation(reservationList);
                    System.out.println(reservation);
                    keepRunning = false;
                }

                case 2 -> {
                    System.out.println("Traveling to Main Menu");
                    keepRunning = false;
                }
            }
        }
    }
}







