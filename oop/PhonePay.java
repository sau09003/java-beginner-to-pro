package CoreJava.OOP.abstraction;

public class PhonePay extends Payment{
    double totalBalance=50000;
    @Override
    void makePayment(double amount){
        double remainingBalance =totalBalance-amount;
        System.out.println("Payment processing via PhonePay : "+amount);
        System.out.println("Remaining Balance : "+remainingBalance);
    }

}
