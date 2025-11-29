package CoreJava.OOP.polymorphism.runtime;

public class Employee {
    void calculateSalary(){
        int hours=8;
        int hourRate=200;
        int dailySalary= hourRate * hours;
        int leaves=2;
        int monthlySalary = (dailySalary *30) - (leaves * dailySalary);
        System.out.println("Monthly Salary of Employee is : "+monthlySalary);
     }
}
