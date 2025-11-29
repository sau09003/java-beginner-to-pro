package CoreJava.OOP.inheritance.hierarchical;

public class Student {
    String name;
    String address;
    String phoneNumber;
    String studentStatus;

    Student( String name,String address,String phoneNumber,String studentStatus){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.studentStatus=studentStatus;
    }
    void display(){
        System.out.println("Basic Student Class");
    }
}
