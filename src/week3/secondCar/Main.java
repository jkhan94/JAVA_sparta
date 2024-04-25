package week3.secondCar;

// 출력
//car.gear = P
//car.gear = N
//car.gear = D
public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 초기값과 기본값 확인하기
        // 기본값: 초기화시키지 않은 필드에 자동으로 저장된 값.
        System.out.println("car.model = " + car.model); // 초기값 "Gv80" 출력.
        System.out.println("car.color = " + car.color); // 기본값 null 출력.
        System.out.println();

        System.out.println("car.speed = " + car.speed); // 기본값 0.0 출력.
        System.out.println("car.gear = " + car.gear);  // 기본값 \u0000(공백) 출력.
        System.out.println("car.lights = " + car.lights); // 초기값 true 출력.
        System.out.println();

        System.out.println("car.tire = " + car.tire); // 초기값 인스턴스 tire의 주소 출력.
        System.out.println("car.door = " + car.door); // 기본값 null 출력.
        System.out.println();

        // 필드 사용 : 필드 값 변경
        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장.
        car.speed = 100;    // 필드 speed에 100 저장.
        car.lights = false; // 필드 lights에 false 저장.

        System.out.println("car.color = " + car.color); // 저장된 "blue" 데이터가 출력됩니다.
        System.out.println("car.speed = " + car.speed); // 저장된 100.0 데이터가 출력됩니다.
        System.out.println("car.lights = " + car.lights); // 저장된 false 데이터가 출력됩니다.

    }
}


