package CoreJava.OOP.encapsulation;

public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("saurav");
        user1.setPassword(1234);
        System.out.println(user1.getPassword());
        System.out.println(user1.getUsername());

        System.out.println("--------------------");
        System.out.println("Another Class Information");
        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("saurav");
        e1.setDept("IT");
        e1.setSalary(45000);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getDept());
    }
}