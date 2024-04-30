package week4.homework.answer;

import java.util.Scanner;

// 계산기를 실행하는 클래스
// 숫자와 연산자를 받음.
// parser는 문자열을 숫자로 파싱. 연산자가 제대로 입력됐는지 확인.
public class CalculatorApp {
    public static boolean start() throws Exception{
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("연산자를 입력해주세요!");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }


}
