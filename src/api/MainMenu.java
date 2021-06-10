 package api;

 import model.Customer;
 import model.IRoom;
 import model.NewCustomer;

 import java.util.Collection;
 import java.util.Scanner;

 import model.Reservation;

 public class MainMenu {

     private MainMenu reservation;

     public void start() {
         boolean keepRunning = true;
         Scanner scanner = new Scanner(System.in);

         while (keepRunning) {
             try {
                 System.out.println("____________________________________");
                 System.out.println("Main Menu");
                 System.out.println("1. Find and reserve a room");
                 System.out.println("2. See my reservation");
                 System.out.println("3. Create an account");
                 System.out.println("4. Admin");
                 System.out.println("5. Exit");
                 System.out.println("____________________________________");
                 int selection = Integer.parseInt(scanner.next());
                 switch (selection) {
                     case 1 -> {
                         Reservation.start();
                     }
                     case 2 -> {
                         System.out.println("What is your Email");
                         String email = (scanner.next());


                         Collection<IRoom> rooms = AdminResource.getInstance().getAllRoom();
                         for (IRoom room : rooms) {
                             System.out.print("The Room Number " + room.getRoomNumber() + "   ");
                             System.out.print("The Price of the Room " + room.getRoomPrice() + "   ");
                             System.out.print("Double or Single " + room.getRoomType() + "   || \n");
                         }

                     }
                     case 3 -> {
                         //Create an account
                         Customer.start();
                     }
                     case 4 -> {
                         System.out.println("Traveling to Admin Menu");
                         AdminMenu adminMenu = new AdminMenu();
                         adminMenu.start();
                     }
                     case 5 -> {
                         System.out.println("YOU ARE GOING TO LEAVE THIS VERY COOL AND AWESOME APPLICATION NOW. GOODBYE");
                         keepRunning = false;
                     }
                 }
             } catch(Exception ex){
                 System.out.println("THERE IS AN ERROR... \n CALCULATING............. \n MISTAKE FOUND, YOU MUST HAVE DONE SOMETHING,  FIX IT FAST BEFORE  YOUR PC EXPLODES THEN IMPLODES");
             }
         }
     }
 }
