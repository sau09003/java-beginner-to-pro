package CoreJava.OOP.inheritance.hierarchical;

public class SchoolStudent extends Student {
    int standard;
    String schoolName;

    SchoolStudent(int standard, String schoolName,String name,String address,String phoneNumber,String studentStatus){
        super(name,address,phoneNumber,studentStatus);
        this.standard=standard;
        this.schoolName=schoolName;
    }
    void schoolInfo(){
        display();
        System.out.println("Student Name : " +name);
        System.out.println("Student Phone Number : " +phoneNumber);
        System.out.println("Student status : " +studentStatus);
        System.out.println("Student Standard : "+standard);
        System.out.println("Student School Name : "+schoolName);
        System.out.println("Student Address : "+address);
    }

    public static void main(String[] args) {
     SchoolStudent student = new SchoolStudent(10,"JEMS","samurai","mumbai","7776922661","school Student");
     student.schoolInfo();
    }
}
