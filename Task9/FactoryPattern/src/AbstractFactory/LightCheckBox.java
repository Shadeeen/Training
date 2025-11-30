package AbstractFactory;

public class LightCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("light check box clicked");
    }
}
