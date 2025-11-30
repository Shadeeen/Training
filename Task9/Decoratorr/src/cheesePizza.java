public class cheesePizza extends PizzaDecorator {

    public cheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + " with cheese";
    }

    @Override
    public int getPrice() {
        return decoratedPizza.getPrice() + 3;
    }
}
