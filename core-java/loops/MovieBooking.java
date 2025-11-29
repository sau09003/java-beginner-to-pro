package CoreJava.looping.doWhile;

import java.util.Scanner;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double balance=1000;
        String movie=" ";
        int ticketPrice=0;

        do {
            System.out.println("....Movie Booking System....");
            System.out.println("1. Ticket Booking");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");

            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();
            if(choice==1){
                System.out.println("Select the Movie");
                System.out.println("1.Saiyara(Rs.180)");
                System.out.println("2.Narsimha(Rs.300)");
                System.out.println("3.Pushpa2(Rs.100)");
                System.out.println("4.Bahubali(Rs.280)");

                System.out.println("Enter Movie Choice.");
                int movieChoice= sc.nextInt();
                if(movieChoice==1){
                    movie="Saiyara";
                    ticketPrice=180;
                } else if (movieChoice==2) {
                    movie="Narsimha";
                    ticketPrice=300;
                } else if (movieChoice==3) {
                    movie="Pushpa2";
                    ticketPrice=100;
                }else if(movieChoice==4){
                    movie="Bahubali";
                    ticketPrice=280;
                }else {
                    System.out.println("Invalid Choice...");
                }

                System.out.println("Enter numbers of tickets");
                int numOFTickets= sc.nextInt();
                double totalCost= numOFTickets * ticketPrice;
                double remainingBalance=  balance - totalCost;
                if(totalCost <= balance){
                    System.out.println("Your Ticket Has Been Booked.");
                    System.out.println("Movie Name : "+ movie);
                    System.out.println("Number Of Tickets Booked : "+numOFTickets);
                    System.out.println("Total Bill : "+totalCost);
                    System.out.println("Remaining Balance : "+remainingBalance);
                } else {
                    System.out.println("Total Amount required to Book Ticket : "+totalCost);
                    System.out.println("Insufficient Balance to Book Tickets : "+balance);
                }

            } else if (choice==2) {
                System.out.println("Your Balance : "+balance);
            }
            else if(choice==3){
                System.out.println("Thank you For Visit....");
            }
        }while (choice!=3);
    }
}
