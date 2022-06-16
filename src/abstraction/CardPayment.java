package abstraction;

public class CardPayment implements Payment{
    @Override
    public void dopayment() {
        System.out.println("please use card payment for payment");
    }
}
