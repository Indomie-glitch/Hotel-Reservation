package model;
import api.AdminResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Customer {

    public static void start(){

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

        private final String firstName;
        private final String lastName;
        private final String email;
        private final String emailRegex = "^(.+)@(.+).com$";
        private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) {
            if (!pattern.matcher(email).matches()) {
                throw new IllegalArgumentException("Error, You have entered an INVALID EMAIL");
            }
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }




    public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public String getEmail () {
            return email;
        }

        @Override
        public String toString () {
            return "First Name:" + firstName + "\nLast Name:" + lastName + "\nThe email:" + email;
        }



    }


