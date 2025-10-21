
public class SharedCounter {
    private int counter = 0;

    public synchronized  void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " " + counterValue());
    }

    public synchronized  int  counterValue() {
        return counter;
    }
}

