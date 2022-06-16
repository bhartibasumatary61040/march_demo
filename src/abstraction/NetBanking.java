package abstraction;

public class NetBanking implements Payment{
    @Override
    public void dopayment() {
        System.out.println("please use netBanking for payment");
    }
}
