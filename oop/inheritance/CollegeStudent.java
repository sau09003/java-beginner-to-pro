package CoreJava.OOP.inheritance.hierarchical;

public class CollegeStudent extends Student{
    String collegeName;
    String universityName;

    CollegeStudent(String collegeName,String universityName,String name,String address,String phoneNumber,String studentStatus){
        super(name,address,phoneNumber,studentStatus);
        this.collegeName=collegeName;
        this.universityName=universityName;
    }

    void collegeInfo(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Phone Number : " +phoneNumber);
        System.out.println("Student status : " +studentStatus);
        System.out.println("College Name : " +collegeName);
        System.out.println("College University : " +universityName);
    }

    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("COEP","SPPU","Saurav","Pune","9922164533","undergraduate");
        student.collegeInfo();
    }
}
