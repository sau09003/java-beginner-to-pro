package CoreJava.OOP.polymorphism.compiletime;

// Method Overloading :-If the class having 2 or more same name methods but with different
//                      parameter list is called Method Overloading.

public class AddOperation {
    public void add(){
        System.out.println("Addition without parameters: "+(10+20));
    }
    public void add(int a){
        System.out.println("Single add operand : "+(a+a));
    }
    public void add(int a, int b){
        System.out.println("Two add operands : "+(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("3 add operands : "+(a+b+c));
    }

    public static void main(String[] args) {
        AddOperation sc= new AddOperation();
        sc.add();
        sc.add(5);
        sc.add(10,12);
        sc.add(10,20,30);
    }
}
