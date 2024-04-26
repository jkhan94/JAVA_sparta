package week3.firstClass;

// 출력
//car.gear = P
//car.gear = N
//car.gear = D
public class Main {
    public static void main(String[] args) {
        week3.firstClass.Car car1 = new week3.firstClass.Car(); // 인스턴스화. new로 생성자 호출
        car1.changeGear('P');
//        System.out.println(car1); // week3.firstCar.Car@4eec7777 객체의 주소값.

        week3.firstClass.Car car2 = new week3.firstClass.Car();
        car2.changeGear('N');

        week3.firstClass.Car car3 = new week3.firstClass.Car();
        car3.changeGear('D');

        // 클래스도 객체이므로 배열로 관리 가능.
        Car[] carArray = new Car[3];
        carArray[0] = car1;
        carArray[1] = car2;
        carArray[2] = car3;
        for (Car car : carArray) {
            System.out.println("car.gear = " + car.gear);
        }
    }
}


