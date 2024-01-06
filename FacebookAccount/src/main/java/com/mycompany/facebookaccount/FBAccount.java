package com.mycompany.facebookaccount;

import javax.swing.JOptionPane;

public class FBAccount {

    private String fullName;
    private String location;
    private String birthday;
    private String phoneNumber;
    private String username;
    private String password;

    public FBAccount(String fullName, String location, String birthday, String phoneNumber, String userName, String password) {
        this.fullName = fullName;
        this.location = location;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.username = userName;
        this.password = password;
    }

    public void changeUserORPass() {
        if (checkUsername() && checkPassword()) {
            String newUsername = JOptionPane.showInputDialog(null, "Enter new Username", JOptionPane.INFORMATION_MESSAGE);
            String newPassword = JOptionPane.showInputDialog(null, "Enter new Password", JOptionPane.INFORMATION_MESSAGE);
            this.username = newUsername;
            this.password = newPassword;
        }
    }

    public void showUserAndPass() {
        if (checkUsername() && checkPassword()) {
            JOptionPane.showMessageDialog(null, "Your Username: " + username + "\nYour Passwrod: " + password);
        }
    }

    public void showInfo() {
        if (checkUsername() && checkPassword()) {
            JOptionPane.showMessageDialog(null, "Full Name: " + fullName + "\nLocation: " + location
                    + "\nBirthday: " + birthday + "\nPhone Number: " + phoneNumber);
        }
    }

    private boolean checkUsername() {
        String user = JOptionPane.showInputDialog(null, "Enter your Username", JOptionPane.INFORMATION_MESSAGE);
        if (this.username.equals(user)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, Username is wrong!");
            return false;
        }
    }

    private boolean checkPassword() {
        String pass = JOptionPane.showInputDialog(null, "Enter your Password", JOptionPane.INFORMATION_MESSAGE);
        if (this.password.equals(pass)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, password is wrong!");
            return false;
        }
    }
}