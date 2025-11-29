package CoreJava.Arrays;

    public class Employee {
        int id;
        String name;
        String dept;

        static String companyName="TCS";
        static double salary=800;

        Employee(int id, String  name, String dept){
            this.id=id;
            this.name=name;
            this.dept=dept;
           // display();
        }
        void display(){
            System.out.println("Company Name : "+companyName);
            System.out.println("Id      :"+id);
            System.out.println("Name    :"+name);
            System.out.println("Salary  :"+EmpSalary());
            System.out.println("dept    :"+dept);
            System.out.println("---------------------------");
        }
        static double EmpSalary(){
            int hours=8;
            return salary * hours *30;
        }

        @Override
        public String toString() {
            return "Employee[id ="+id +", name ="+name +", dept = "+dept+"]";
        }

        public static void main(String[] args) {
            new Employee(101,"saurav","IT");
            new Employee(102,"shyam", "ME");
            new Employee(103,"radha", "Comp");

        }
}
