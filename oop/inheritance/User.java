package CoreJava.OOP.inheritance.multilevel;

public class User {
    String username;
    String password;
    String email;

    User(String username,String password,String email){
        this.username=username;
        this.password=password;
        this.email=email;
        display();
    }
    void display(){
        System.out.println("User Information :");
        System.out.println("User Name : "+username);
        System.out.println("User PassWord : "+password);
        System.out.println("User Email : "+email);
        System.out.println("__________________________");
    }

}
