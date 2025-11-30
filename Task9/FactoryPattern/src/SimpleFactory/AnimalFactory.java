package SimpleFactory;

public class AnimalFactory {
    public static Animal createAnimal(String animalType) {
        if(animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else if(animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }
}
