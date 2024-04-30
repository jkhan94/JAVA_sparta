package week3.homework.step3;

public class Calculator {

    // 받아온 계산 기능을 저장할 필드
    // 변동되지 않으니 final
    // 클래스 내부에서만 사용할 거니 private
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    // 생성자를 통해 계산 기능 초기화
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        if (operator.equals("+")) {
            answer = addOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            answer = substractOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("%")) {
            answer = firstNumber % secondNumber;
        }
        return answer;
    }

}
