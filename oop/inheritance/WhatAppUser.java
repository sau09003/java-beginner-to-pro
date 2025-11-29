package CoreJava.OOP.inheritance.multilevel;

public class WhatAppUser extends User{
    String whatsAppNumber;
    String chats;
    boolean status;

    WhatAppUser(String whatsAppNumber,String chats,boolean status,String username,String password,String email){
        super(username,password,email);
        this.whatsAppNumber=whatsAppNumber;
        this.chats=chats;
        this.status=status;
        displayWpUser();
    }
    void displayWpUser(){
        System.out.println("WhatsApp User Information :");
        System.out.println("User Whatsapp Number : "+whatsAppNumber);
        System.out.println("User Chats : "+chats);
        System.out.println("User Status: "+status);
        System.out.println("-------------------------------");
    }
}

