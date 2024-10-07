package org.emailApp;

import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 120;
    private int passwordLength = 8;
    private String alternateEmail;
    private String email;
    private String companyName = "optum.com";

    //Construct to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Name - " + this.firstName + this.lastName);
        this.department = setDepartment();
        System.out.println(this.department);
//        this.pa
        this.password = randomPassword(passwordLength);
        System.out.println("you're password - " + this.password.toLowerCase());
        email = firstName + "." + lastName + "@" + department + "." + companyName;
        System.out.println(email);
    }

    public String setDepartment() {
        System.out.print("Department Codes - \n1. Sales \n2. Development \n3. Accounting \n4. None");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if (choice == 1) {
            return "Sales";
        } else if (choice == 2) {
            return "Development";
        } else if (choice == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    //Ask for the department

    // Generate a random Password
    public String randomPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
//            System.out.print(rand);
        }
        return new String(password);
    }

    //Set the Mailbox Capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Change the password
    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public void setPassword(String password) {
//        System.out.println("if you want change the Password. please enter 1 ");
//        Scanner in = new Scanner(System.in);
//        int customPassword = in.nextInt();
//
//        if (customPassword == 1) {
//
//        }
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void showInfo () {
        System.out.println("First Name - " + this.firstName);
        System.out.println("Last Name - " + this.lastName);
        System.out.println("Department - " + this.department);
        System.out.println("Mailbox Capacity - " + this.mailboxCapacity);
        System.out.println("Password - " + this.password);
        System.out.println("Alternate Email - " + this.alternateEmail);


    }
}
