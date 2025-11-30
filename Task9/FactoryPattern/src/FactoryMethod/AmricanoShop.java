package FactoryMethod;

public class AmricanoShop extends CoffeeShop {
    @Override
    public Coffee createCoffee() {
        return new Amricano();
    }
}
