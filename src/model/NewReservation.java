package model;

import api.AdminResource;
import api.HotelResource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class NewReservation {
    public static void start(){

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
            for(IRoom room : rooms) {
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



