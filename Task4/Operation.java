public class Operation {
    public static void main(String[] args) {
        for (Example op : Example.values()) {
            System.out.println("10 " + op + " 5 = " + op.apply(10, 5));
        }
    }
}

enum Example {
    ADD {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        double apply(double x, double y) {
            if (y == 0) throw new ArithmeticException("Division by zero!");
            return x / y;
        }
    };
    abstract double apply(double x, double y);
}
