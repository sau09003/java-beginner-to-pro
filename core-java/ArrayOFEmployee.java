package CoreJava.Arrays;
public class ArrayOFEmployee {
    public static void main(String[] args) {
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
