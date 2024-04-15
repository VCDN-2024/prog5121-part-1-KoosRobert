/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author HP
 */
public class loginMTest {
    
    public loginMTest() {
    }

    @Test
    public void testGetUserName() {
    }

    @Test
    public void testSetUserName() {
    }

    @Test
    public void testGetFirstName() {
    }

    @Test
    public void testSetFirstName() {
    }

    @Test
    public void testGetLastName() {
    }

    @Test
    public void testSetLastName() {
    }

    @Test
    public void testCheckUserNameSuccsessful() {
        // Test method to check if the username format is correct and registration is successful
        loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");
        String expected = "Account created successfully";
        assertTrue(loginm.checkUserName("kyl_1"));
        String real = loginm.registerUser();
        assertEquals(expected, real);
        
        
    }
    
     @Test
    public void testCheckUserNameUnsuccsessful() {
        // Test method to check if the username format is incorrect and registration fails
        loginM loginm = new loginM("kyle!!!!!!!", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");
        String expected = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ";
        assertFalse(loginm.checkUserName("kyle!!!!!!!"));
        String real = loginm.registerUser();
        assertEquals(expected, real);
    }

    @Test
    public void testCheckPasswordComplexitySuccessful() {
        // Test method to check if the password complexity is met and registration is successful
        loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");
        String expected = "Account created successfully";
        assertTrue(loginm.checkPasswordComplexity("Ch&&sec@ke99!"));
        String real = loginm.registerUser();
        assertEquals(expected, real);
    }
    @Test
    public void testCheckPasswordComplexityUnsuccessful() {
         // Test method to check if the password complexity is not met and registration fails
        loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "password");
        String expected = "\nYour password is not correctly formatted, please ensure that your password contains at least 8 characters, a capital letter, a number and a special character.";
        assertFalse(loginm.checkPasswordComplexity("password"));
        String real = loginm.registerUser();
        assertEquals(expected, real);
    }

    
    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testLoginUser() {
        loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");
        
        assertFalse(loginm.loginUser("password", "kyle!!!!!!!"));
        
        
    }

    @Test
    public void testReturnLoginStatusSuccessful() {
        // Test method to check if returnLoginStatus() returns "Login Successful" for successful login
        loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");
        String expected = "Login Successful";
        String real = loginm.returnLoginStatus();
        assertEquals(expected, real);
    }
@Test
public void testReturnLoginStatusUnsuccessful() {
    // Create an instance of loginM with correct password and username
    loginM loginm = new loginM("kyl_1", "Brandon", "Van Loggerenberg", "Ch&&sec@ke99!");

    // Call returnLoginStatus method
    String expected = "Username or password is incorrect";
    
    // Attempt login with incorrect password and username
    String real = loginm.returnLoginStatus("incorrectPassword", "incorrectUsername");

    // Check if the expected result matches the actual result
    assertEquals(expected, real);
}

    
}
