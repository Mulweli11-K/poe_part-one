/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registertionlogin;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Registrationlogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create registration object
        Registration reg = new Registration();
        reg.registerUser();

        // Create login object
        login Login = new login(reg);

        // Attempt login
        Login.loginUser();
    }
}