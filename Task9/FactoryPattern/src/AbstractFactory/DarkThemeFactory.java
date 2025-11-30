package AbstractFactory;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new DarkCheckBox();
    }
}
