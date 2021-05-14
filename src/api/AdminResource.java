package api;

import model.Customer;
import model.IRoom;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AdminResource {

    Collection<IRoom> rooms = new ArrayList<IRoom>();
    Collection<Customer> customer = new ArrayList<Customer>();

    private static AdminResource adminResource = null;
    private AdminResource() {
    }
    public static AdminResource getInstance() {
        if (null == adminResource) {
            adminResource = new AdminResource();
        }
        return adminResource;
    }

    //Rooms
    public void addRoom(List<IRoom> rooms) {
        this.rooms.addAll(rooms);
    }

    public Collection<IRoom> getAllRoom() {
        return rooms;
    }

    //Customer


    public void addCustomer(List<Customer> customer) {
        this.customer.addAll(customer);
    }
    public Customer getCustomer(String email) {
        for (Customer temp : customer) {
            if (temp.getEmail().equals(email)) {

            }
        }
        return null;
    }

    public Collection<Customer> getAllCustomer() {
        return customer;
    }


    public void displayAllReservation()
    {}

}
