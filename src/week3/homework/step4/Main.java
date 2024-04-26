package week3.homework.step4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation());
        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("*", 10, 20));

    }
}
