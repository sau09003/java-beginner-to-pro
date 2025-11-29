package CoreJava.looping.ifblock;

import java.util.Scanner;

public class ifBlock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age= sc.nextInt();
        if(age>=18) {
            System.out.println("He can Vote.");
        }
        if(age<18){
            System.out.println("Not eligible to vote.");
        }
    }
}
