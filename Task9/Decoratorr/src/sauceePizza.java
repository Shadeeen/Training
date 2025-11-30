public class sauceePizza extends PizzaDecorator {

    public sauceePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with sauce";
    }

    @Override
    public int getPrice() {
        return decoratedPizza.getPrice()+4;
    }
}
