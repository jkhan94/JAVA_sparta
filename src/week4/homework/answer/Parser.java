package week4.homework.answer;

import java.util.regex.Pattern;

// 파싱: a에서 b로 변형한다.
public class Parser {
    // 정규식 : 검증할 형태가 아니면 예외 발생시키는 것.
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값");
        }
        // this = Parser
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
        // 인스턴스의 값을 변경했고, 그걸 인스턴스를 반환함으로서 내보냄.
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception {
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception {
        // 지정된 사칙연산의 연산자인지 확인.
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙 연산의 연산자");
        }
        // 입력된 연산자를 기준으로 값 변경.
        switch (operationInput) {
            case "+" -> this.calculator.setOperation(new AddOperation());
            case "-" -> this.calculator.setOperation(new SubstractOperation());
            case "*" -> this.calculator.setOperation(new MultiplyOperation());
            case "/" -> this.calculator.setOperation(new DivideOperation());
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
