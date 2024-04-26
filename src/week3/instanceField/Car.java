package week3.instanceField;

// 공개된 자동차 클래스 선언
// public이므로 Main에서 접근 가능.
public class Car {
    // 필드
    // 고유 데이터: 값 불변
    String company; // 자동차 회사
    String model  = "Gv80";; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    // 상태 데이터 : 값이 바뀌는 필드. getter, setter로 업데이트.
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태

    // 객체 데이터: 단독 객체로서 사용 가능한 필드.
    Tire tire = new Tire(); // tire 필드 값에 new Tire() 초기값 부여.
    Door door; // 생성만 한 것. 할당된 건 없음.
    Handle handle;

    // 기본 생성자: 콘솔에 출력만 함. 내부 코드가 없으면 실질적인 기능은 없음.
    // 처음 객체가 생성될 때(인스턴스화 될 떄) 어떤 로직을 수행하고, 어떤 값이 필수로 들어와야 하는지 정의.
    // new 사용 시 실행됨
    public Car() {
        System.out.println("기본생성자 호출. 객체 생성");
    }

    // kmh : km/h
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }
}
