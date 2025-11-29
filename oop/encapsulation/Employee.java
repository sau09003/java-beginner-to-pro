package CoreJava.OOP.encapsulation;

public class Employee {
    private int id;
    private String  name;
    private String dept;
    private double salary;

    public int getId() {
        return id;
    }
    public String getName() {
        if (id == 101) {
            return name;
        }
        else {
            return "Id not match";
        }
    }
    public String getDept() {
        return dept;
    }
    public double getSalary() {
        if (id == 101 && name.equals("saurav")) {
            return salary;
        }
        else {
            return 0;
        }
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
