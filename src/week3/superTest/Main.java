package week3.superTest;

public class Main {
    public static void main(String[] args) {
        // 자식 클래스 스포츠카 객체 생성
        SportsCar sportsCar = new SportsCar("Orion");

        // 자식 객체의 model, color, price 초기값 확인
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println("sportsCar.price = " + sportsCar.price); // 3.0E8
        System.out.println();

        // setCarInfo 메서드 호출해서 부모 및 자식 필드 값 저장
        sportsCar.setCarInfo("GV80", "Black", 50000000);

        // this.price = price; 결과 확인
        System.out.println("sportsCar.price = " + sportsCar.price); // 5.0E7
        System.out.println();

        // super.model = model; super.color = color;
        // 결과 확인을 위해 자식 클래스 필드 model, color 확인 & 부모 클래스 메서드인 getModel(), getColor() 호출
        // 자식 클래스 필드 값은 변화 없음.
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println();

        // 부모 클래스 필드 값 저장됨.
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel()); // GV80
        System.out.println("sportsCar.getColor() = " + sportsCar.getColor()); // Black


        //super()
        // 자식 클래스 스포츠카 객체를 생성합니다.
        SportsCar sportsCar1 = new SportsCar("Lamborghini", "Red", 400000000, "V12");
        sportsCar1.brakePedal();
        sportsCar1.horn();
        // 자식 클래스의 생성자를 통해 부모 클래스의 생성자가 호출되어 필드값이 초기화 되었는지 확인
        System.out.println("sportsCar.getModel() = " + sportsCar1.getModel()); // Lamborghini
        System.out.println("sportsCar.getColor() = " + sportsCar1.getColor()); // Red
        System.out.println("sportsCar.getPrice() = " + sportsCar1.getPrice()); // 4.0E8
    }
}
