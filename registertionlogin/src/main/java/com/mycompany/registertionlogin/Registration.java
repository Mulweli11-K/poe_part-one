/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registertionlogin;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Registration {

    String name;
    String surname;
    String username;
    String password;
    String cellphone;

    Scanner input = new Scanner(System.in);
    
    public boolean isValidCellphone(String phone) {
    return phone.matches("^0\\d{9}$");
}
    
    public boolean isValidUsername(String username) {
    return username.contains("_");
}

    public void registerUser() {

        System.out.println("================= Registration =================");

        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Enter Surname: ");
        surname = input.nextLine();

        // Username validation
        do {
            System.out.print("Enter Username (must contain underscore): ");
            username = input.nextLine();

            if (!username.contains("_")) {
                System.out.println(" Username must contain an underscore (_)");
            }

        } while (!username.contains("_"));

        // Password validation
        do {
            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (!isValidPassword(password)) {
                System.out.println(" Password must be:");
                System.out.println("- At least 8 characters");
                System.out.println("- Contain a capital letter");
                System.out.println("- Contain a number");
                System.out.println("- Contain a special character");
            }

        } while (!isValidPassword(password));

       do {
    System.out.print("Enter Cellphone Number (10 digits, starts with 0): ");
    cellphone = input.nextLine();

    if (!isValidCellphone(cellphone)) {
        System.out.println("Invalid cellphone number!");
    }

} while (!isValidCellphone(cellphone));
        
        System.out.println(" Registration Successful!\n");
    }

    // Password validation method
    public boolean isValidPassword(String password) {

        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return hasUpper && hasNumber && hasSpecial;
    }//end of register user 
}//end of class