package FactoryMethod;

public class latteCoffee extends CoffeeShop{

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
