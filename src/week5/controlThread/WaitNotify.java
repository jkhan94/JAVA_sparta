package week5.controlThread;

import java.util.ArrayList;
import java.util.List;

/*
출력:
Inventory 현황: [IPhone, MacBook, Mac mini, Mac mini, MacBook]
Customer2 Waiting!
StoreClerk Waiting!

저 이후로 진행 안 함. 프로세스는 돌고 있지만 로그가 안 찍힘.
인벤토리가 꽉 참.
손님은 사고 싶은 게 없어서 대기.
점원이 재입고를 하기 위해 인벤토리가 빌 때까지 대기.
그러나 사가지 않으면 인벤토리는 비지 않음.
=> 병목현상 발생!
*/
public class WaitNotify {
    // 재고
    public static String[] itemList = {
            "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    
    public static AppleStore2 appleStore = new AppleStore2();
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {
        // 가게 점원의 역할
        Runnable StoreClerk = () -> {
            while (true) {
                int randomItem = (int) (Math.random() * MAX_ITEM); // 0~4 중 랜덤값 선택.
                appleStore.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객의 역할
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77);
                } catch (InterruptedException ignored) {
                }

                int randomItem = (int) (Math.random() * MAX_ITEM);
                appleStore.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };

        // 만들면서 실행
        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();
    }
}

class AppleStore2 {
    private List<String> inventory = new ArrayList<>();

    // 재입고
    public void restock(String item) {
        synchronized (this) {
            while (inventory.size() >= WaitNotify.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    wait(); // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 재입고
            inventory.add(item);
            notify(); // 재입고 되었음을 고객에게 알려주기
            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    // 구매
    public synchronized void sale(String itemName) {
        // 재고가 없을 때
        while (inventory.size() == 0) {
            System.out.println(Thread.currentThread().getName() + " Waiting!");
            try {
                wait(); // 재고가 없기 때문에 고객 대기중
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 재고가 있을 때
        while (true) {
            // 고객이 주문한 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (itemName.equals(inventory.get(i))) {
                    inventory.remove(itemName);
                    notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
                    return; // 제품이 있으니 메서드 종료
                }
            }

            // 제품이 없으니 return문 실행 안 됨. -> 따라서 아래 코드 실행.
            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}