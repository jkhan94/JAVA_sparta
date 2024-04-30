package week3.homework;

// 연산 기능을 추상클래스를 상속받아 구현
// 연산 기능=자손 클래스를 불러올 떄 추상클래스 타입으로 받아옴(자동 업캐스팅)
// 객체를 만들 때는 생성자를 써서 연산 기능을 부여하고, 이후에는 setter를 통해 연산 종류를 변경.
public class Main {
    public static void main(String[] args) {
        // 필요한 클래스만 받아오면 됨.
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(10, 20));

        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(10, 20));
    }
}
