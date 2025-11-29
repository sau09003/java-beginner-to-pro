package CoreJava.Arrays;

public class ArrayDemo {
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       Student students[]= new Student[3];
        Student s1= new Student(1,"saurav","pune");
        Student s2= new Student(2,"sahil","mumbai");
        Student s3= new Student(3,"naresh","pune");
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);
        }
        Employee employee[] = new Employee[3];

        Employee e1= new Employee(101,"saurav","It");
        Employee e2= new Employee(102,"sita","Development");
        Employee e3= new Employee(103,"geeta","Packaging");
        employee[0]=e1;
        employee[1]=e2;
        employee[2]=e3;

        for (int i = 0; i <employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}
