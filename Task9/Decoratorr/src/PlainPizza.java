public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return " basic Pizza ";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
