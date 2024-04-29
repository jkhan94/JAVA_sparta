package week5.controlThread;
/* 출력
남은 사과의 수 = -1
남은 사과의 수 = -2

먹을 게 없는 데 먹고 있다.
 */
public class SynchronizedNoneTest {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        // 스레드 작업: 사과 먹기
        Runnable task = () -> {
            // 사과 개수가 1 이상일 때 실행.
            // 1개 남았을 때 3개의 스레드는 모두 먹을 수 있다고 인지.
            // 그래서 스레드1이 먹으면 스레드2,3은 먹을 게 없으니 먹는 척만 함. = 싱크가 안 맞는다.
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }
        };

        // 3개의 스레드를 한 번에 만들어서 start.
        // 멀티 스레드 처리.
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        // 싱크를 맞추지 않으니 아래 코드를 스레드 3개가 동시에 실행 가능.
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
