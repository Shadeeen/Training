package AbstractFactory;

public class LightButton implements Button {
    @Override
    public void click() {
        System.out.println("light button clicked");
    }
}
