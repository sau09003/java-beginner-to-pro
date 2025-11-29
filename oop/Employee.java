package CoreJava.OOP.abstraction;

public class Employee {
    int id;
    String name;
    static String company;
    public Employee(int id, String name){
        System.out.println("This is the constructor");
        this.id=id;
        this.name=name;
    }
    void login() {
        if (id == 1234) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Invalid Id");
        }
    }
    static void get(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Employee e1= new Employee(1234,"Saurav");
        e1.login();
        get();
        Employee.company="Tcs";
        System.out.println(Employee.company);
    }
}
