package week5.controlThread;

public class InterruptTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            // task로 만들어진 스레드가 인터럽트 상태가 아니면 try 구문 실행
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()); // 실행 안 되고 예외로 빠짐.
                } catch (InterruptedException e) {
                    break;
                }
            }
            // task로 만들어진 스레드가 인터럽트 상태면 자지 않고 출력 실행.
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        // 스레드가 자는 동안 일시정지 -> 대기로 변경.
        // sleep() 실행 중 빠지므로 아래 출력문 실행 안 되는 예외 발생
        thread.interrupt();

        // isInterrupted(): 스레드가 인터럽트 상태인지 반환.
        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}
