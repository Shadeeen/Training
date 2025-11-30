//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new cheesePizza(pizza);
        pizza = new sauceePizza(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getPrice());
    }
}