package FactoryMethod;

public class Test {
    public static void main(String[] args) {


        CoffeeShop shop1 = new latteCoffee();
        shop1.orderCoffee();

        CoffeeShop shop2 = new AmricanoShop();
        shop2.orderCoffee();



    }
}
