package week5.threadImplementation;

public class ThreadTest {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start(); // 스레드의 run 함수 실행
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.print("*");
        }
    }
}
