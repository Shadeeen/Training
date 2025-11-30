package AbstractFactory;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LightCheckBox();
    }
}
