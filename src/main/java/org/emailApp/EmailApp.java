package org.emailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
         Email eml = new Email(name, lastName);
         eml.setAlternateEmail("vinaykumar.depatla@gmail.com");
         eml.setMailboxCapacity(150);
         eml.setPassword("mypassword@123");
         eml.showInfo();

    }
}
