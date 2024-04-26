package week3.abstractTest;

public abstract class Car {
    String company; // 자동차 회사
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    // 위의 두 개는 모든 자식 클래스에서 동일.
    // 경적은 차마다 다르니 추상 메소드로 선언.
    public abstract void horn();
}