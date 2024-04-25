package week3.fourthCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        // 메서드 실행 완료 후 전달할 매개값으로 지정된 type 값 확인
        // 기존에 선언한 값 'D' 출력, 원본 값 변경되지 않음
        System.out.println("type = " + type);

        // 메서드 실행 완료 후 반환된 car 인스턴스의 gear 타입 확인
        // breakPedal 내에서 type='P'로 초기화. 매개변수 값과 무관하게 type은 항상 P.
        // 객체 내부에서 type을 수정했기 때문에 'P' 출력
        System.out.println("gear = " + car.gear);
        // Main의 type은 여전히 D
        System.out.println("type = " + type);

        System.out.println();

// 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호"; // 금호 타이어 객체 생성
        // 차 객체의 타이어를 등록하는 메서드 호출한 후 반환값으로 차 객체의 타이어 객체 반환
        // 함수 내에서 tireCompany를 KIA로 초기화
        // 금호를 저장해놨지만 KIA로 바꾸면서 tire회사가 KIA로 변경됨.
        Tire carInstanceTire = car.setTire(tire);

        // 메서드 실행 완료 후 전달할 매개값으로 지정된 참조형 변수(매개변수) tire의 company 값 확인
        // tire 인스턴스의 주소값이 전달됐음 -> 호출된 메서드에 의해 값이 변경됨.
        System.out.println("tire.company = " + tire.company); // "KIA" 출력

        // 메서드 실행 완료 후 반환된 car 인스턴스의 tire 객체 값 반환
        // 이 값이 저장된 참조형 변수 carInstanceTire의 company 값 확인
        System.out.println("carInstanceTire.company = " + carInstanceTire.company); // "KIA" 출력
    }
}
