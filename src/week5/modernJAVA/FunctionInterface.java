package week5.modernJAVA;

import java.util.ArrayList;
import java.util.List;

public class FunctionInterface {
    public static void main(String[] args) {
        ArrayList<Car1> carsWantToPark = new ArrayList<>();
        ArrayList<Car1> parkingLot = new ArrayList<>();

        Car1 car1 = new Car1("Benz", "Class E", true, 0);
        Car1 car2 = new Car1("BMW", "Series 7", false, 100);
        Car1 car3 = new Car1("BMW", "X9", false, 0);
        Car1 car4 = new Car1("Audi", "A7", true, 0);
        Car1 car5 = new Car1("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        // 함수 참조
        parkingLot.addAll(parkCars(carsWantToPark, Car1::hasTicket));
        parkingLot.addAll(parkCars(carsWantToPark, Car1::noTicketButMoney));

        for (Car1 car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }

    }

    // 추가
    // 돈과 티켓의 유무를 반환하기 때문에 boolean 리턴
    interface Predicate<T> {
        boolean test(T t);
    }

    // parkingCarWithTicket, parkingCarWithMoney 합침
    public static List<Car1> parkCars(List<Car1> carsWantToPark, Predicate<Car1> function) {
        // 리턴값 저장할 배열
        List<Car1> cars = new ArrayList<>();
        // 배열에 있는 값을 검증할 함수 function
        for (Car1 car : carsWantToPark) {
            if (function.test(car)) {
                cars.add(car);
            }
        }
        return cars;
    }
}


class Car1 {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car1(String company, String model, boolean hasParkingTicket, int parkingMoney) {
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

    // 추가
    public static boolean hasTicket(Car1 car) {
        return car.hasParkingTicket;
    }
    // 추가
    public static boolean noTicketButMoney(Car1 car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}