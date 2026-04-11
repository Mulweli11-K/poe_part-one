/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registertionlogin;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class login {

    private Registration reg;
    Scanner input = new Scanner(System.in);

    public login(Registration reg) {
        this.reg = reg;
    }

    public void loginUser() {

        System.out.println("================= Login ================");

        String usernameInput;
        String passwordInput;
        String cellphoneInput;

        System.out.print("Enter Username: ");
        usernameInput = input.nextLine();

        System.out.print("Enter Password: ");
        passwordInput = input.nextLine();

        System.out.print("Enter Cellphone Number: ");
        cellphoneInput = input.nextLine();

        if (usernameInput.equals(reg.username) &&
            passwordInput.equals(reg.password) &&
            cellphoneInput.equals(reg.cellphone)) {

            System.out.println("\n Login Successful");
            System.out.println("Hello " + reg.name + ", Welcome to Easy Kanban 🎉");

        } else {
            System.out.println("\n Login Failed! Incorrect details. please fill in the correct details ");
        }
    }
}