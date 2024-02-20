package flight.reservation.payment;


public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        // Implement the logic to pay with PayPal
        System.out.println("Paying " + amount + " using PayPal.");
        // Assume this method returns true if payment is successful
        return true;
    }
}
