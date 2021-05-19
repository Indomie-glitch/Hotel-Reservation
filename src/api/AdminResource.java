package api;

import model.Customer;
import model.IRoom;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AdminResource {

    //Admin Resource
    private static AdminResource adminResource = null;
    private AdminResource() {}
    public static AdminResource getInstance() {
        if (null == adminResource) {
            adminResource = new AdminResource();
        }
        return adminResource;
    }

    //Rooms
    Collection<IRoom> rooms = new ArrayList<IRoom>();
    public void addRoom(List<IRoom> rooms) {
        this.rooms.addAll(rooms);
    }

    public Collection<IRoom> getAllRoom() {
        return rooms;
    }

    //Customer
    Collection<Customer> customer = new ArrayList<Customer>();

    public Collection<Customer> getAllCustomer() {
        return customer;
    }
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


}
