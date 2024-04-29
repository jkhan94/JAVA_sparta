package week5.threadImplementation;

public class RunnableTest {
    public static void main(String[] args) {

        Runnable run = new TestRunnable();
        Thread thread = new Thread(run);

        thread.start();
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("$");
        }
    }
}