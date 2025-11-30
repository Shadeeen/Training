//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .setColor("Black")
                .setBrand("Tesla")
                .setModel("Model S")
                .setYear(2024)
                .build();

        System.out.println("Car created!");
    }
}