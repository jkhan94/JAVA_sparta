package week5.threadTest;

public class SingleThread {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
            System.out.println();
        };

        Thread thread1 = new Thread(task1);
        thread1.setName("thread1");

        thread1.start();
    }
}
