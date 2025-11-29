package CoreJava.OOP.abstraction;

public class Gpay extends Payment{
    double totalBalance= 50000;
    void makePayment(double amount){
        double remainingBalance= totalBalance-amount;
        System.out.println("Payment processing via Gapy: "+amount);
        System.out.println("Remaining Balance : "+remainingBalance);
    }
}
