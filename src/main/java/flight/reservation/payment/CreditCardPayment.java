package flight.reservation.payment;

import java.util.Date;

public class CreditCardPayment implements PaymentMethod {
    private CreditCard creditCard;

    public CreditCardPayment(String number, Date expirationDate, String cvv) {
        this.creditCard = new CreditCard(number, expirationDate, cvv);
    }

    @Override
    public boolean pay(double amount) {
        // Implement the logic to pay with Credit Card
        System.out.println("Paying " + amount + " using Credit Card.");
        // Assume this method returns true if payment is successful
        return true;
    }
}
