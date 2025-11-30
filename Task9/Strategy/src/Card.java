public class Card implements PaymentWays{
    @Override
    public void pay(int amount) {
        System.out.println("Card pay $"+amount);
    }
}
