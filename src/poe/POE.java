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
        // TODO code application logic here
        loginM loginm = null;
        while (true) {            
        int choice = Integer.parseInt( JOptionPane.showInputDialog(null, "Please select one of the following options. \n1. Sign Up \n2. Login \n3. Exit"));
        
            switch (choice) {
                case 1:
                        
                        String firstName = JOptionPane.showInputDialog(null, "Please enter your first name");
                        String lastName = JOptionPane.showInputDialog(null, "Please enter your last name");
                        String userName = JOptionPane.showInputDialog(null, "Please enter a username");
                        String password = JOptionPane.showInputDialog(null, "Please enter a password");
                        loginm = new loginM(userName, firstName, lastName, password);
                        JOptionPane.showMessageDialog(null, loginm.registerUser());                         
                        break;
                case 2:
                        userName = JOptionPane.showInputDialog(null, "Please enter your usenname");
                        password = JOptionPane.showInputDialog(null, "Please enter your password");
                        JOptionPane.showMessageDialog(null, loginm.returnLoginStatus());  
                    break;
                case 3:
                        System.exit(0);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "please choose one of the choices");
            }
        
        }
    }
    
}
