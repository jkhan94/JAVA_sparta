package week5.threadImplementation;

public class RambdaTest {
    public static void main(String[] args) {
        // 람다식
        // run()에 작성할 내용
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + ": " + sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        // setName()` 메서드는 쓰레드에 이름을 부여할 수 있습니다.
        // Thread.currentThread().getName()` 은 현재 실행 중인 쓰레드의 이름을 반환
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}