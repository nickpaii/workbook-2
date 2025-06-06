package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // 1. Prompt the user for parts of their name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");


        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // 2. Create a new string that holds the user's full name

        String fullName = "";


        /* Side Note: User will always have a first and last name, they may also have a middle name and/or suffix
            Make sure to trim any leading or trailing spaces that the user may have entered. */



        /* 3. If user does not enter middle name or suffix, full name should not include middle name or suffix
              Name should look like this: "Glen Williams" */


            if (firstName.isEmpty()) {
                System.out.println("Please enter your first name");
                return;
            } else {
                fullName = fullName + firstName;
            }

            if (middleName.isEmpty()) {
                fullName = fullName;
            } else {
                fullName = fullName + middleName;
            }

            if (lastName.isEmpty()) {
                System.out.println("Please enter your last name");
                return;
            } else {
                fullName = firstName + middleName + lastName;
            }



        /* 4. If user has a suffix, full name should include a comma before the suffix
              Name should look like this: "Glen Williams, PhD" */

        if (suffix.isEmpty()) {
            fullName = firstName + middleName + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }

        System.out.printf("Full Name: %s ", fullName);
    }
}
