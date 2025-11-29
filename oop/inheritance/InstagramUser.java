package CoreJava.OOP.inheritance.multilevel;

public class InstagramUser extends  WhatAppUser{

    int followers;
    int following;
    int posts;

    InstagramUser(int followers,int following,int posts,String whatsAppNumber,String chats,boolean status,String username,String password,String email){
        super(whatsAppNumber,chats, status,username,password,email);
        this.followers=followers;
        this.following= following;
        this.posts=posts;
        instagramInfo();
    }
    void instagramInfo(){
        System.out.println("Instagram User Information :");
        System.out.println("Followers : "+followers);
        System.out.println("Following : "+following);
        System.out.println("Posts     : "+posts);
    }
    public static void main(String[] args) {
        new InstagramUser(1000,1500,200,"1234567891","1000+",true,"saurav","123456","saurav@gmail.com");


    }
}
