package week5.controlThread;

public class YieldTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 1초 간격으로 출력
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                System.out.println("YIELD");
                Thread.yield(); // 다른 스레드에 리소스 양보
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 1초 자는 중에 interrupt
        // thread1의 리소스를 받아 thread2만 작업함.
        thread1.interrupt();

    }
}
