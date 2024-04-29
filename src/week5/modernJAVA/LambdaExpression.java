package week5.modernJAVA;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Car2> carsWantToPark = new ArrayList<>(); // 주차할 차 목록
        ArrayList<Car2> parkingLot = new ArrayList<>(); // 평일 주차장: 티켓
        ArrayList<Car2> weekendParkingLot = new ArrayList<>(); // 주말 주차장: 티켓+파킹머니

        Car2 car1 = new Car2("Benz", "Class E", true, 0);
        Car2 car2 = new Car2("BMW", "Series 7", false, 100);
        Car2 car3 = new Car2("BMW", "X9", false, 0);
        Car2 car4 = new Car2("Audi", "A7", true, 0);
        Car2 car5 = new Car2("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        parkingLot.addAll(parkCars(carsWantToPark, Car2::hasTicket));
        parkingLot.addAll(parkCars(carsWantToPark, Car2::noTicketButMoney));

        // 람다식 = 익명함수
        // 원본: public static boolean noTicketButMoney(Car2 car) { return !car.hasParkingTicket && car.getParkingMoney() > 1000; }
        weekendParkingLot.addAll(parkCars(carsWantToPark, (Car2 car) -> car.hasParkingTicket() && car.getParkingMoney() > 1000));

        for (Car2 car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }

    }

    public static List<Car2> parkCars(List<Car2> carsWantToPark, Predicate<Car2> function) {
        List<Car2> cars = new ArrayList<>();

        for (Car2 car : carsWantToPark) {
            if (function.test(car)) {
                cars.add(car);
            }
        }

        return cars;
    }


}

class Car2 {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car2(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket(Car2 car) {
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney(Car2 car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}

interface Predicate<T> {
    boolean test(T t);
}
