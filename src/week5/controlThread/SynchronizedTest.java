package week5.controlThread;

public class SynchronizedTest {
    public static void main(String[] args) {
        AppleStore1 appleStore = new AppleStore1();

        Runnable task = () -> {
            while (appleStore.getStoredApple1() > 0) {
                appleStore.eatApple1();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple1());
            }

        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore1 {
    private int storedApple = 10;

    public int getStoredApple1() {
        return storedApple;
    }

    public void eatApple1() {
        // 한 스레드가 아래 코드 실행 시 다른 스레드는 못 들어옴.
        synchronized (this) {
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}
