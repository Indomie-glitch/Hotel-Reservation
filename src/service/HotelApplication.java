package service;

import api.MainMenu;

public class  HotelApplication {

    public static  void main(String[] args) {
        MainMenu mainMenu = new MainMenu();

        mainMenu.start();
    }
}

/* To do List
You need to override the equals and hashcode method for atleast one of the model classes.
You need to use final access modifier in one of the model class .
The application should not allow same room to be booked twice for a given date range.
The application should display recommended room in case there are no rooms available for a given date range. This is to be achieved by adding 7 to the checkin and checkout date.
Please use switch statements instead of if-else blocks for user input flow. ✓
 */
