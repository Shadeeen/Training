
public class Car {
    private String color;
    private String brand;
    private String model;
    private int year;

    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
    }

    public static class CarBuilder {
        private String color;
        private String brand;
        private String model;
        private int year;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
