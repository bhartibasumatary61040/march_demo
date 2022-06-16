package abstraction;

public class UPIPament implements  Payment{

    @Override
    public void dopayment() {
        System.out.println("please use UPI id for payment");
    }
}
