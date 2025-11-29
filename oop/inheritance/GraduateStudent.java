package CoreJava.OOP.inheritance.hierarchical;

public class GraduateStudent extends Student{
    String grade;
    String university;

    GraduateStudent(String grade, String university, String name, String address, String phoneNumber, String studentStatus){
        super(name,address,phoneNumber,studentStatus);
        this.grade=grade;
        this.university=university;
    }
    void graduateInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Phone Number : " +phoneNumber);
        System.out.println("Student status : " +studentStatus);
        System.out.println("Student Grade : "+grade);
        System.out.println("Student university : "+university);
    }

    public static void main(String[] args) {
       GraduateStudent student=new GraduateStudent("A","Sppu","saurav","pune","9874563214","graduate");
       student.graduateInfo();
    }
}
