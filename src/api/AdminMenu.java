package api;
import model.Customer;
import model.IRoom;
import model.Room;
import model.RoomType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
public class AdminMenu {
    public void start() {
        boolean keepRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (keepRunning) {
            try {
                System.out.println("____________________________________");
                System.out.println("Admin Menu");
                System.out.println("1. See all Customers");
                System.out.println("2. See all Rooms");
                System.out.println("3. See all Reservations");
                System.out.println("4. Add a Room");
                System.out.println("5. Back to Main Menu");
                System.out.println("____________________________________");
                int selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1 -> {
                        //Do SOMETHING
                        Collection<Customer> customers = AdminResource.getInstance().getAllCustomer();
                        for (Customer customer : customers) {
                            System.out.print("First Name " + customer.getFirstName() + "   ");
                            System.out.print("Last Name " + customer.getLastName() + "   ");
                            System.out.print("The Email " + customer.getEmail() + "   || \n");
                        }
                    }
                    case 2 -> {
                        System.out.println("All the Rooms");
                        Collection<IRoom> rooms = AdminResource.getInstance().getAllRoom();
                        for (IRoom room : rooms) {
                            System.out.print("The Room Number " + room.getRoomNumber() + "   ");
                            System.out.print("The Price of the Room " + room.getRoomPrice() + "   ");
                            System.out.print("Double or Single " + room.getRoomType() + "   || \n");
                        }
                    }
                    case 3 ->
                            //Do SOMETHING
                            System.out.println("See All Reservations");
                    case 4 -> {
                        Room room = new Room();
                        System.out.println("Enter the Room Number");
                        String roomNumber = (scanner.nextLine());
                        room.setRoomNumber(roomNumber);
                        System.out.println("Enter the Price \n $");
                        Double roomPrice = Double.parseDouble(scanner.nextLine());
                        room.setPrice(roomPrice);
                        System.out.println("Enter the type of the room| \n 1 for Single \n 2 for double");
                        int roomType = Integer.parseInt(scanner.nextLine());
                        if (roomType == 1) {
                            System.out.println("Single");
                            room.setType(RoomType.SINGLE);
                        } else if (roomType == 2) {
                            System.out.println("Double");
                            room.setType(RoomType.DOUBLE);
                        }
                        List<IRoom> rooms = new ArrayList<IRoom>();
                        rooms.add(room);
                        AdminResource.getInstance().addRoom(rooms);
                    }
                    case 5 -> {
                        System.out.println("Traveling to Main Menu");
                        keepRunning = false;
                    }
                }
                //Back to main menu
            } catch (Exception e) {
                System.out.println("THERE IS AN ERROR... \n CALCULATING............. \n MISTAKE FOUND, YOU MUST HAVE DONE SOMETHING,  FIX IT FAST BEFORE  YOUR PC EXPLODES THEN IMPLODES");
                e.printStackTrace();
            }
        }
    }
}
