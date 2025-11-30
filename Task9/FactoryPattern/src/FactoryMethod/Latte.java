package FactoryMethod;

public class Latte implements Coffee {
    @Override
    public void serve() {
        System.out.println("Latte Serving");
    }
}
