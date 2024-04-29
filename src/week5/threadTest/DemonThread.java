package week5.threadTest;

// main() 쓰레드의 task가 100번이 먼저 찍히면 데몬 스레드는 강제종료
// 즉, 1000000번 수행이 되지 않고 종료
public class DemonThread {
    public static void main(String[] args) {
        // 100만을 찍어야 끝나는 데몬 스레드
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + ". demon");
            }
        };

        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨

        thread.start();

        // 메인 스레드는 100번 찍으면 끝남.
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". task");
        }
    }
}
