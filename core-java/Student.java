package CoreJava.Arrays;

public class Student {
    int id;
    String name;
    String address;

    Student(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return "Student[id ="+id +", name ="+name +", address = "+address+"]";
    }
}
