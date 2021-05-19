 package api;

 import model.IRoom;
 import model.NewCustomer;

 import java.util.Collection;
 import java.util.Scanner;

 import model.NewReservation;
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
                         NewReservation.start();

                  /* System.out.println("Enter CheckIn Date mm/dd/yyyy example 12/12/1212");
                    String CheckIn = (scanner.next());
                   System.out.println("Enter CheckOut Date mm/dd/yyyy example 11/11/1111");
                    String Checkout = (scanner.next());
                   //All rooms
                    System.out.println("All the Rooms");
                    Collection<IRoom> rooms = AdminResource.getInstance().getAllRoom();
                    for(IRoom room : rooms) {
                        System.out.print("The Room Number " + room.getRoomNumber() + "   ");
                        System.out.print("The Price of the Room " + room.getRoomPrice() + "   ");
                        System.out.print("Double or Single " + room.getRoomType() + "   || \n");
                    }
                    System.out.println("Do you want to book a room, Yes or No");
                    String book = (scanner.next());
                    System.out.println("Do you have an account with us, Yes or No");
                    String account = (scanner.next());
                    //EMAIL
                System.out.println("What is your Email");
                    String email = (scanner.next());
                    System.out.println("What is the Room Number you want to reserve");
                    String rooomnumber = (scanner.next());
                    System.out.println("YOUR RESERVATION  " + CheckIn + "\n" + Checkout + "\n" + book + "\n" + account + "\n" + email + "\n" + rooomnumber);
*/
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
                         NewCustomer newCustomer = new NewCustomer();
                         newCustomer.start();
                     }
                     case 4 -> {
                         System.out.println("Traveling to Admin Menu4");
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
