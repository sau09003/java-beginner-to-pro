package CoreJava.OOP.polymorphism.runtime;

public class JavaDeveloper extends Employee{
    @Override
    void calculateSalary() {
           int hours=8;
           int hourRate=600;
           int dailySalary=hours * hourRate;
           int paidLeaves=4;
           int monthlySalary= dailySalary*30;
        System.out.println("Monthly Salary of Java Developer is : "+monthlySalary);

    }

    public static void main(String[] args) {
        Employee e1 = new JavaDeveloper();
        e1.calculateSalary();
        Employee e2= new Employee();
        e2.calculateSalary();
    }
}
