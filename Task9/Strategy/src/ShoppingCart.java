public class ShoppingCart {

    private PaymentWays PaymentWays;

        public void setPaymentStrategy(PaymentWays strategy) {
            this.PaymentWays = strategy;
        }

        public void checkout(int amount) {
            PaymentWays.pay(amount);
        }


}
