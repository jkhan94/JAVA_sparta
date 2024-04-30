package week3.homework.step3;

public class Main {
    public static void main(String[] args) {
        // 생성 시 계산 기능을 주입
        Calculator calculator = new Calculator(new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation());

        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("*", 10, 20));

    }
}
