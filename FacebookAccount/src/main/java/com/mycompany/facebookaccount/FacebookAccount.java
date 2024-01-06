
package com.mycompany.facebookaccount;

import javax.swing.JOptionPane;

public class FacebookAccount {

    public static void main(String[] args) {
        FBAccount p = new FBAccount("Ali Mohammed", "Egyption/Cairo","10/10/1995", "9641085710","ali.123","1234");
        String option;
        do{
            option = JOptionPane.showInputDialog(null,"Input 1 to show Username and password"
                + "\nInput 2 to change Username and password"
                + "\nInput 3 show your information"
                + "\nInput 0 to exit",JOptionPane.INFORMATION_MESSAGE);
            switch(option){
            case "1":
                p.showUserAndPass(); break;
            case "2":
                p.changeUserORPass(); break;
            case "3":
                p.showInfo(); break;
            case "0":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Enter wrong number");
            }
        }while(!option.equals("0"));
    }
}
