package CoreJava.looping.WhileLoop;

import java.util.Scanner;

public class Atm_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Atm Application");
        int actualPin= 1234;
        int attempts= 0;
        double balance=5000;
        while (attempts <3){
            System.out.println("Enter your pin :");
            int pin= sc.nextInt();
            if(actualPin==pin){
                System.out.println("Pin is correct... Access granted");
                int choice=0;
                while (choice !=4){
                    System.out.println("======== Atm Operations =========");
                    System.out.println("1.Deposit Money");
                    System.out.println("2.Withdrawal Money");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Exit");

                    System.out.println("\nEnter your choice");
                    choice= sc.nextInt();
                    if(choice==1){
                        System.out.println("Enter Amount to be Deposit : ");
                        int amount=sc.nextInt();
                       if(amount >0){
                           balance +=amount;
                           System.out.println("Amount Deposited Successfully");
                           System.out.println("After Deposit balance is : "+balance);
                       }else {
                           System.out.println("Invalid Amount");
                       }
                    } else if (choice == 2) {
                        System.out.println("Enter Amount to be Withdrawal :");
                        int withdrawMoney= sc.nextInt();
                       if(withdrawMoney > 0 && withdrawMoney <= balance){
                           balance -=withdrawMoney;
                           System.out.println("Amount is withdraw from balance Successfully ");
                           System.out.println("After Withdrawal balance is : "+balance);
                       }else {
                           System.out.println("Invalid amount or Insufficient Balance.");
                       }
                    }
                    else if(choice==3){
                        System.out.println("Final Balance is : "+balance);
                    } else if (choice==4) {
                        System.out.println("Thank you for using Atm...");
                    }
                    else {
                        System.out.println("invalid Choice...");
                        break;
                    }
                }
                break;
            }
            else {
                attempts++;
                System.out.println("incorrect pin....");
                System.out.println("Remaining Attempts To Enter : "+(3-attempts));
                if(attempts==3){
                    System.out.println("Account is blocked due to 3 incorrect pin");
                }
            }
        }

    }
}
