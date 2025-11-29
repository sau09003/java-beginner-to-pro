package CoreJava.OOP.abstraction;

public class Test extends Employee_2{
//    Test(){
//        super();
//        System.out.println("This is constructor of child Test");
//    }
    @Override
    void calculateSalary() {
        int hours=8;
        int dailySalary = hours * 500;
        int monthlySalary= dailySalary * 30;
        System.out.println("Monthly Salary is : "+monthlySalary);
    }

    public static void main(String[] args) {
        Test t1= new Test();
        t1.calculateSalary();
    // Upcasting :- We are passing child class object to the Parent class reference is known as upcasting
    // Dynamic Dispatch :-  At the runtime jvm will invoke(call) Overrided method is called Dynamic Dispatch.
        Employee_2 e= new Test();
        e.calculateSalary();
    }
}
