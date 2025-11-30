public class Cash implements PaymentWays{
    @Override
    public void pay(int amount) {
        System.out.println("Cash pay $"+amount);
    }
}
