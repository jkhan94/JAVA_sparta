package week3.staticClsssMember;

public class Car {

    static String company = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    public Car() {
    } // 기본 생성자

    double gasPedal(double kmh, char type) {
        changeGear(type);
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

    // static String company는 프로그램 실행 시 메모리에 있음. => 불러서 쓸 수 있다.
    String getCompany() {
        return "(주)" + company;
    }

    // static company 변수값 변경
    static String setCompany(String companyName) {
        // String model은 인스턴스가 있어야 쓸 수 있음.
        // static String setCompany는 프로그램 실행 시 메모리에 올라감.
        // 따라서 setCompany를 호출했을 때 model 필드가 없을 수 있음.
        // 따라서 static은 인스턴스 못 씀.
        // System.out.println("자동차 모델 확인: " + model); // 인스턴스 필드 사용 불가
        company = companyName;
        return company;
    }
}