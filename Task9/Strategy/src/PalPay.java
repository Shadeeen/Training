public class PalPay implements PaymentWays{
    @Override
    public void pay(int amount) {
        System.out.println("PalPay pay $"+amount);
    }
}
