package CoreJava.OOP.abstraction;

public abstract class Payment {
    abstract void makePayment(double amount);
    public static void main(String[] args) {
        Payment pay = new PhonePay();
        pay.makePayment(12000);

        Payment pay1= new Gpay();
        pay1.makePayment(13000);

        Payment pay2= new Paytm();
        pay1.makePayment(10000);

    }
}
