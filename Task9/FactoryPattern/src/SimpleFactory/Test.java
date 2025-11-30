package SimpleFactory;

public class Test {

    public static void main(String[] args) {


        Animal cat = AnimalFactory.createAnimal("cat");
        cat.eat();

        Animal dog = AnimalFactory.createAnimal("dog");
        dog.eat();


    }
}
