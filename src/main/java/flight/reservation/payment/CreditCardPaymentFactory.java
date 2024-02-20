package flight.reservation.payment;

import java.util.Date;

public class CreditCardPaymentFactory implements PaymentMethodFactory {
    private String number;
    private Date expirationDate;
    private String cvv;

    public CreditCardPaymentFactory(String number, Date expirationDate, String cvv) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment(number, expirationDate, cvv);
    }
}
