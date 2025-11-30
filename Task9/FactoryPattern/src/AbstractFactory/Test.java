package AbstractFactory;

public class Test {

    public static void main(String[] args) {

        ThemeFactory factory;
        String theme = "light";

        if (theme.equals("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        Button button = factory.createButton();
        CheckBox checkbox = factory.createCheckbox();

        button.click();
        checkbox.check();
    }
}
