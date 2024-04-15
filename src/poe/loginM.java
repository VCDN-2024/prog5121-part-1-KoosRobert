/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class loginM {
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    
    //constructor
    public loginM (String userName, String firstName, String lastName, String password ){
    this.firstName = firstName;
    this.userName = userName;
    this.lastName = lastName;
    this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Declaring and initilzing boolean variables to track and test if the username is valid
    public static boolean checkUserName(String userName){
            boolean isUserNull = false;
             // Check if username is null
            if (userName == null || userName.equals(" ")){
                //JOptionPane.showMessageDialog(null, "Please enter a username");
                isUserNull = true;
            }else{
                isUserNull = false;
            }
            
            // Check if username has at least 6 characters
            boolean isSixChar = false;
            if (userName.length() >= 6){
                isSixChar = true;
            }else{
                isSixChar= false;
            }
            
            // Check if username contains an underscore
            boolean containsUnderscore = false;
            for (int i = 0; i < userName.length(); i++){
                if (userName.charAt(i) == '_') {
                containsUnderscore = true;
                break; 
                }
            } 
            
            // Check if all username is valid by containing all the nessecary criteria
            if (isUserNull == false && isSixChar == false && containsUnderscore == true) {                
                return true;
            }else{                
                return false;
            }
        }
    
    public static boolean checkPasswordComplexity(String password){
        //initilizing boolean variable to true
        boolean containsEverything = true;
         // Check if password meets criteria to see if its complex enough 
        if (password.length() >= 8 && password.matches(".*[.&#$*&%@].*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")){
            containsEverything = true;
        }else{
            containsEverything = false;
        }
        
        // Return true if password is complex enough, otherwise return false
        if(containsEverything == true){
            return true;
        }else{
            return false;
        }
    }
    
    public String registerUser(){
        // Initialize StringBuilder by creating a object to construct registration message
        StringBuilder message = new StringBuilder();
       
        // Check username and password are valid and appending a nessacary message
        if(!checkUserName(userName) == true){
            message.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ");   
        }
        // Appending a message if username is invalid
        if (!checkPasswordComplexity(password)==true){
           message.append("\nYour password is not correctly formatted, please ensure that your password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        //Appending a message if the above criteria is met
        if (message.length()== 0){
            message.append("Account created successfully");   
        }
        //returning the built message
        return message.toString();
    }
    
public boolean loginUser(String password, String username){
    // Check if the username and password entered match stored username and password
    return this.password.equals(password) && this.userName.equals(username);
}

public String returnLoginStatus(String password, String username) {
    if (loginUser(password, username)) {
        return "Login Successful";
    } else {
        return "Username or password is incorrect";
    }
}
    
public String returnLoginStatus() {
    // Check login status and returning an appropriate message based on if previous criteria is met or nit
    if (loginUser(password, userName)== true) {
        return "Login Successful";
    } else {
        return "Username or password is incorrect";
    }
}    
    
    

    
}
