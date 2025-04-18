package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();

        cellPhone.setSerialNumber(serialNumber);
        System.out.println(serialNumber);
    }
}
