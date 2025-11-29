package CoreJava.OOP.polymorphism.runtime;

public class child extends Parent{
    @Override // to crosscheck method is override or not?
    void mobile(){
        System.out.println("My mobile is Iphone.");
    }
    void show(){
        System.out.println("this is only called by child reference not by parent reference..");
    }

    public static void main(String[] args) {
        Parent sc= new child();  // when we call using method by parent reference then it is called run-time polymorphism
        sc.mobile();
    }
}
