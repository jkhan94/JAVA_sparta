package week5.controlThread;

public class JoinTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
                System.out.println("slept for 5 sec.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); // NEW
        thread.start(); // NEW -> RUNNABLE

        long start = System.currentTimeMillis(); // 작업 시작 시간.

        try {
            // task 스레드가 끝날 때까지 메인 스레드가 기다린다.
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
