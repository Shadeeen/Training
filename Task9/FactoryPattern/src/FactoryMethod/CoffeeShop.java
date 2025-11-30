package FactoryMethod;

public abstract class CoffeeShop {

    public abstract Coffee createCoffee();

    public void orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.serve();
    }
}
