package com.BridgeLabz.Generics;

public class generics {

    public static void main(String[] args) {
        System.out.println("Welcome to the Test Maximum program");

        String string1 = "Car";
        String string2 = "Train";
        String string3 = "Aeroplane";

        if (string1.compareTo(string2) == 1 && string1.compareTo(string3) == 1) {
            System.out.println("First string is maximum and string is : " + string1);

        } else if (string2.compareTo(string1) == 1 && string2.compareTo(string3) == 1) {
            System.out.println("Second string is maximum and string is : " + string2);

        } else {
            System.out.println("Third string is maximum and string is : " + string3);
        }
    }
}
