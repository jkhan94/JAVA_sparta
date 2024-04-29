package week5.controlThread;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
    public static final int MAX_TASK = 5;

    private ReentrantLock lock = new ReentrantLock();

    // lock으로 condition 생성
    // condition애 맞는 것만 실행 가능.
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    private ArrayList<String> tasks = new ArrayList<>();

    // 작업 메서드
    public void addMethod(String task) {
        // ReentrantLock으로 잠금.
        lock.lock(); // 임계영역 시작

        try {
            while (tasks.size() >= MAX_TASK) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try {
                    condition1.await(); // wait(); condition1 쓰레드를 기다리게 함.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            tasks.add(task);
            condition2.signal(); // notify();  기다리고 있는 condition2를 깨움.
            System.out.println("Tasks:" + tasks.toString());
        } finally {
            lock.unlock(); // 임계영역 끝
        }
    }
}
