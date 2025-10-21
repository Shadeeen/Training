public class Process extends Thread {
    SharedCounter c;
    public Process(SharedCounter counter) {
        c = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            c.increment();
        }

    }
}
