package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        print("Please enter your full name: ");

        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();

        int positionOfFirstSpace = fullName.indexOf(' ');

        int positionOfSecondSpace = fullName.lastIndexOf(' ');


        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (positionOfFirstSpace != -1) {
            firstName = fullName.substring(0, positionOfFirstSpace);
        }

        if (positionOfFirstSpace != positionOfSecondSpace) {
            middleName = fullName.substring(positionOfFirstSpace + 1, positionOfSecondSpace);
            lastName = fullName.substring(positionOfSecondSpace + 1);
        }
        else {
            lastName = fullName.substring(positionOfFirstSpace + 1);
        }

        print(firstName);

        if (!middleName.isEmpty()) {
            print(middleName);
        }

        if (!lastName.isEmpty()) {
            print(lastName);
        }


    }



    public static void print(String message) {
        System.out.println(message);
    }
}
