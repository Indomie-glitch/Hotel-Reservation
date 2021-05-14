package model;

import api.AdminResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewCustomer {
    public void start(){

        List<Customer> customer = new ArrayList<Customer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your First Name ");
        String firstName = scanner.nextLine();
        System.out.println("Please type your Last Name ");
        String lastName = scanner.nextLine();
        System.out.println("Please type your email ");
        String email = scanner.nextLine();

        Customer customers = new Customer(firstName, lastName, email);
        customer.add(customers);
        AdminResource.getInstance().addCustomer(customer);
        System.out.println(customer);

    }
}
