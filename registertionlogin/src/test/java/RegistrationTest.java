/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest{

    Registration reg = new Registration();

    //  PASSWORD TESTS
    @Test
    public void testValidPassword() {
        assertTrue(reg.isValidPassword("Abc@1234"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(reg.isValidPassword("abc123"));
    }

    // � CELLPHONE TESTS
    @Test
    public void testValidCellphone() {
        assertTrue(reg.isValidCellphone("0821234567"));
    }

    @Test
    public void testInvalidCellphone() {
        assertFalse(reg.isValidCellphone("12345"));
    }

    //  USERNAME TESTS
    @Test
    public void testValidUsername() {
        assertTrue(reg.isValidUsername("user_name"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(reg.isValidUsername("username"));
    }
}