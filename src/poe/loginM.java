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
    
    public static boolean checkUserName(String userName){
            boolean isUserNull = false;
            if (userName == null || userName.equals(" ")){
                //JOptionPane.showMessageDialog(null, "Please enter a username");
                isUserNull = true;
            }else{
                isUserNull = false;
            }
            
            boolean isSixChar = false;
            if (userName.length() >= 6){
                isSixChar = true;
            }else{
                isSixChar= false;
            }
            
            boolean containsUnderscore = false;
            for (int i = 0; i < userName.length(); i++){
                if (userName.charAt(i) == '_') {
                containsUnderscore = true;
                break; 
                }
            } 
            
            if (isUserNull == false && isSixChar == false && containsUnderscore == true) {                
                return true;
            }else{                
                return false;
            }
        }
    
    public static boolean checkPasswordComplexity(String password){

        boolean containsEverything = true;
        if (password.length() >= 8 && password.matches(".*[.&#$*&%@].*") && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")){
            containsEverything = true;
        }else{
            containsEverything = false;
        }
        
        if(containsEverything == true){
            return true;
        }else{
            return false;
        }
    }
    
    public String registerUser(){
        
        StringBuilder message = new StringBuilder();
       // 
         //       "and that the password contains at least 8 characters, a capital letter, a number and a special character."
        
        if(!checkUserName(userName) == true){
            message.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ");   
        }
        if (!checkPasswordComplexity(password)==true){
           message.append("\nYour password is not correctly formatted, please ensure that your password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        
        if (message.length()== 0){
            message.append("Account created successfully");   
        }
        
        return message.toString();
    }
    
    public boolean loginUser(String Password, String Username){
        if (password == Password && userName == Username){
           return true; 
        }else{
            return false;
        }
        
    }
    
public String returnLoginStatus() {
    if (loginUser(password, userName)== true) {
        return "Login Successful";
    } else {
        return "Username or password is incorrect";
    }
}    
    
    

    
}
