/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare and initialize a loginM object as null
        loginM loginm = null;
        // Infinite loop to continuously prompt the user for options
        while (true) {     
        // Telling the user to select an option and convertering the input to an integer
        int choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select one of the following options. \n1. Sign Up \n2. Login \n3. Exit"));
        
            // Switch statement to differentenciate the users choices
            switch (choice) {
                // Case 1: Sign Up
                case 1:
                        // Telling the user to enter their first name, last name, username, and password
                        String firstName = JOptionPane.showInputDialog(null, "Please enter your first name");
                        String lastName = JOptionPane.showInputDialog(null, "Please enter your last name");
                        String userName = JOptionPane.showInputDialog(null, "Please enter a username");
                        String password = JOptionPane.showInputDialog(null, "Please enter a password");
                        // Create a new loginM object with the provided information and store it in loginm
                        loginm = new loginM(userName, firstName, lastName, password);
                        // Display the registration message by using the message outputted in the registerUser method
                        JOptionPane.showMessageDialog(null, loginm.registerUser());                         
                        break;
                // Case 2: Login        
                case 2:
                        // Telling the user to enter their username and password
                        userName = JOptionPane.showInputDialog(null, "Please enter your usenname");
                        password = JOptionPane.showInputDialog(null, "Please enter your password");
                        // Display the login message using the returnLoginStatus method
                        JOptionPane.showMessageDialog(null, loginm.returnLoginStatus());  
                    break;
                // Case 3: Exit
                case 3:
                        //exiting the program
                        System.exit(0);
                    break;
                
                default:
                    //diaplaying a default mesage if nothing gets entered or if the input is invalid 
                    JOptionPane.showMessageDialog(null, "please choose one of the choices");
            }
        
        }
    }
    
}
