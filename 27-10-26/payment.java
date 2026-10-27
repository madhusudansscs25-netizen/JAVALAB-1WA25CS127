abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }
}
 class SHOPP {
     public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay(2000);

        p = new UPI();
        p.pay(1500);
    }






}