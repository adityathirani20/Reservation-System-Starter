package flight.reservation.payment;

public class PayPalPaymentFactory implements PaymentMethodFactory {
    private String email;
    private String password;

    public PayPalPaymentFactory(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment(email, password);
    }
}
