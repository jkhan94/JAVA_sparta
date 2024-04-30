package week3.homework;

public class Calculator {

    private AbstractOperation operation;
    // 자식 클래스를 부모 클래스형으로 받아옴. (자동 업캐스팅)
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    // setter: 연산 기능 변경을 위해 생성
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    // 생성자를 통해 받아온 연산 기능으로 연산 수행
    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }

}