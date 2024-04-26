package week3.packageTest;

import week3.packageTest.pk1.Car;

public class Main {
    public static void main(String[] args) {
        // 패키지로 불러옴
        week3.packageTest.pk1.Car car = new week3.packageTest.pk1.Car();
        car.horn(); // pk1 빵빵

        week3.packageTest.pk2.Car car2 = new week3.packageTest.pk2.Car();
        car2.horn(); // pk2 빵빵

        // 매번 쓰기 귀찮으니 import
        Car car1 = new Car();
        car1.horn();
    }
}
