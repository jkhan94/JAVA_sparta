package week5.threadTest;

public class ThreadPriority {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        // 우선순위: thread1 > thread2
        // 1번이 리소스를 더 많이 받아서 일찍 끝날 확률이 높음.
        Thread thread1 = new Thread(task1);
        thread1.setPriority(8); // 우선순위: 8
        // 우선순위 확인 후 출력
        int threadPriority = thread1.getPriority(); 
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2); // 우선순위: 2

        thread1.start();
        thread2.start();
    }
}
