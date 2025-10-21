
public class CounterTest {
    public static void main(String[] args) {

        SharedCounter counter = new SharedCounter();
        Thread t1 = new Process(counter);
        Thread t2 = new Process(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("final result: " + counter.counterValue());
    }
}

