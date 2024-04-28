package week4.homework;

import java.util.Scanner;

// 유저의 입력: String
// 입력받은 String을 숫자나 연산자로 변환하기 위해서 예외 처리
// 해당 예외 처리를 하기 위해서는 Pattern.match() 메서드
public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
