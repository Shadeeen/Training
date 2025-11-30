public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("singleton constructor");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
