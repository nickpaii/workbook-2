package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Prompt the user for their Billing and shipping addresses.
            Instead of changing value of a string, use StringBuilder to hold address info
            Use StringBuilder append() method to append the new input to the string
         */

        StringBuilder addresses = new StringBuilder();


        System.out.println("Please provide the following information: ");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        addresses.append(fullName).append("\n");
        addresses.append("Billing Address: ").append("\n");
        addresses.append(billingStreet).append("\n");
        addresses.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");


        addresses.append("Shipping Address: ").append("\n");
        addresses.append(shippingStreet).append("\n");
        addresses.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        System.out.println(addresses);
    }
}
