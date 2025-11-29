package CoreJava.looping.nestedIdblock;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Admission Process");
        System.out.print("Enter your Marks : ");
        int marks= sc.nextInt();
        System.out.print("Enter your Category : ");
        String category= sc.next();
        if(marks > 76){
            if(category.equals("open")){
                System.out.println("Admission can be Confirm.");
            }
            if(marks <85 ){
                System.out.println("Is chances");
            }
        }
        if(marks <55 && marks >70){
            if(category.equals("obc")){
                System.out.println("Their is Chance of Admission.");
            }
            if(marks <70 && marks >55){
                System.out.println("Admission through Donation");
            }
        }
        if(marks>55){
            if (category.equals("sc") || category.equals("st")){
                System.out.println("Admission Confirmed");
            }if(marks <55 && marks > 45){
                System.out.println("Admission  in 2nd Round");
            }
        }
        if(marks <=45){
            System.out.println("Not Standard Of This college.");
        }
    }
}
