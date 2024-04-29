package week5.controlThread;

public class SleepTest {
    public static void main(String[] args) {
        // 정의한 메인의 하위 스레드
        Runnable task = () -> {
            try {
                // interrupt() 만나면 다시 실행되므로 예외 처리 필수.
                // 특정 스레드 지정해서 잠자기 불가.
                // 메인의 하위 스레드가 쿨쿨.
                Thread.sleep(2000); // TIMED_WAITING: 주어진 시간 동안만 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        // 하위 스레드 생성
        Thread thread = new Thread(task, "Thread"); // 스레드 생성(NEW)
        thread.start(); // New -> Runnable

        try {
            // 메인 스레드가 쿨쿨.
            thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
