package CoreJava.looping.NestedDoWhile;

import java.util.Scanner;

public class Shopping_Application {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mainChoice, subChoice=0;
        double balance=100000;
        do {
            System.out.println("Wel-Come To Online Shopping ");
            System.out.println("1.Electronic");
            System.out.println("2.Clothes");
            System.out.println("3.Exit");

            System.out.println("Enter your Choice : ");
            mainChoice=sc.nextInt();
            if(mainChoice==1){
                do {
                    System.out.println("====Electronic Section====");
                    System.out.println("1.Headphones - (500)");
                    System.out.println("2.Iphone16 - (150000)");
                    System.out.println("3.DELL Laptop - (60000)");
                    System.out.println("4.Return to Main Menu..");
                    System.out.println("Enter your Choice : ");
                     subChoice= sc.nextInt();
                    if(subChoice==1 && balance >500){
                        balance -=500;
                        System.out.println("Headphone Purchases.. Remaining Balance :"+balance);
                    } else if (subChoice==2 && balance >150000) {
                        balance -=150000;
                        System.out.println("Iphone16 Purchases..  Remaining Balance :"+balance);
                    }else if(subChoice==3 && balance >60000){
                        balance -=60000;
                        System.out.println("DELL Laptop Purchases..  Remaining Balance :"+balance);
                    } else if (subChoice==4) {
                        System.out.println("Returning To Main Menu...");
                    } else if (subChoice==1 || subChoice==2 || subChoice==3) {
                        System.out.println("Insufficient Balance..");
                    } else {
                        System.out.println("Invalid Choice..");
                    }
                }while (subChoice !=4);
            }else if (mainChoice==2) {
                do {
                    System.out.println("====Clothes Section====");
                    System.out.println("1.T-Shirt - 300");
                    System.out.println("2.Jeans - 1000");
                    System.out.println("3.Trousers - 600");
                    System.out.println("4.Return to Main Menu..");
                    subChoice=sc.nextInt();
                    if (subChoice == 1 && balance > 300) {
                        balance -= 300;
                        System.out.println("T-Shirt Purchases Remaining Balance :" + balance);
                    } else if (subChoice == 2 && balance > 1000) {
                        balance -= 1000;
                        System.out.println("Jeans Purchases Remaining Balance :" + balance);
                    } else if (subChoice == 3 && balance > 600) {
                        balance -= 600;
                        System.out.println("Trousers Purchases Remaining Balance :" + balance);
                    } else if (subChoice == 4) {
                        System.out.println("Returning to Main Menu..");
                    } else if (subChoice == 1 || subChoice == 2 || subChoice == 3) {
                        System.out.println("Insufficient Balance..");
                    } else {
                        System.out.println("Invalid Choice..");
                    }
                }while(subChoice !=4);
            } else if (mainChoice==3) {
                System.out.println("Thank You for Visiting Our Shopping Website...");
            }else {
                System.out.println("Invalid Choice..");
            }
        }while (mainChoice!=3);
    }
}
