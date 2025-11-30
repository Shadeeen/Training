package SimpleFactory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog is sleeping");
    }
}
