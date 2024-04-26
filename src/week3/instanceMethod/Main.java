package week3.instanceMethod;

// 출력
//car.gear = P
//car.gear = N
//car.gear = D
public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성
        System.out.println("초기 car.speed = " + car.speed);
        System.out.println("초기 car.gear = " + car.gear);

        // 메서드 호출 및 반환값 저장
        // speed = 100, gear: P -> D
        double speed = car.gasPedal(100, 'D');
        System.out.println("변경 후 speed = " + speed);
        // gasPedal 메서드 내부에 호출된 changeGear(type); 메서드의 결과 확인
        // gear의 초기값은 'P'
        System.out.println("변경 후 car.gear = " + car.gear); // 'D' 출력

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);
        System.out.println();

        // 가변길이 매개변수 확인
        car.carSpeeds(100, 80); // v=100 v=80
        System.out.println();
        car.carSpeeds(110, 120, 150); // v=110, v=120, v=150

    }
}


