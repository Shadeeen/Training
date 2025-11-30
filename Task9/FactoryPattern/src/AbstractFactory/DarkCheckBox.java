package AbstractFactory;

public class DarkCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Dark check box clicked");
    }
}
