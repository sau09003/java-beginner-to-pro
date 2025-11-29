package CoreJava.looping.ifblock;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to Login into Account.");
        System.out.print("Enter user name : ");
        String UserName= sc.next();
        System.out.print("Enter PassWord: ");
        String PassWord= sc.next();
        if(UserName.equals("SauravBhosale") && PassWord.equals("abc123")){
            System.out.println("Login SuccessFull.");
        }
        if(UserName.equals("SauravBhosale") && !PassWord.equals("abc123")){
            System.out.println("PassWord Invalid.");
        }
        if(!UserName.equals("SauravBhosale") && PassWord.equals("abc123")){
            System.out.println("UserName Invalid.");
        }
        if(!UserName.equals("SauravBhosale") && !PassWord.equals("abc123")){
            System.out.println("Invalid Details");
        }
    }
}
