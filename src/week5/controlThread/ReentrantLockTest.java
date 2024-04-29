package week5.controlThread;

public class ReentrantLockTest {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    // A, B가 서로 락을 해제할 떄까지 기다림. = 데드락.
    // 따라서 ReentrantLockTest을 통해 락을 유지하면서도 계속 실행할 수 있게 만들어야 함.
    public void methodA() {
        synchronized (lock1) {
            // lock1을 가진 상태에서 lock2 접근
            methodB();
        }
    }

    public void methodB() {
        synchronized (lock2) {
            // lock2를 가지고 lock1에 접근.
            methodA();
        }
    }
}
