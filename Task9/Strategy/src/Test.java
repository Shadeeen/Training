public class Test {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card
        cart.setPaymentStrategy(new Card());
        cart.checkout(100);

        // Change to PayPal dynamically
        cart.setPaymentStrategy(new PalPay());
        cart.checkout(200);

        // Change to Cash
        cart.setPaymentStrategy(new Cash());
        cart.checkout(50);
    }
}
