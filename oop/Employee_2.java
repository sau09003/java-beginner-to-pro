package CoreJava.OOP.abstraction;

public abstract class Employee_2 {
    int id;
    String name;
    static String company;
    abstract void calculateSalary();
    Employee_2(){
        System.out.println("This is constructor of Parent Employee_2");
    }
    void  login(){
        if (id == 1234) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Invalid Id");
        }
    }
    static void get(){
        System.out.println("static method");
    }
}
