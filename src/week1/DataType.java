package week1;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DataType {
    public static void main(String[] args) {
        // 정수형
        byte byteNumber = 127; // byte 는 -128 ~ 127
        short shortNumber = 32767; // short 는 -32,768~32,767
        int intNumber = 2147483647; // int 는 -21억~21억
        long longNumber = 2147483647L; // long 은 숫자뒤에 알파벳 L 을 붙여서 표기.

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // 실수형
        float floatNumber = 1.123f; // float (4byte) : `3.4 * -10^38` ~ `3.4 * 10^38`. 소수점 7자리까지.
        double doubleNumber = 2.123123123; // double (8byte) :  `1.7 * -10^308` ~ `1.7 * 10^308` 소수점 16자리까지.

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // 캐스팅
        System.out.println((float) intNumber);  // int -> float 형변환
        System.out.println((double) intNumber); // int -> double 형변환

        System.out.println("float ->  int: " + (int) floatNumber); // float -> int 형변환
        System.out.println("double ->  int: " + (int) doubleNumber); // double -> int 형변환

        // 자동 형변환 : 큰 타입 = 작은 타입
        byteNumber = 10;
        intNumber = byteNumber;    // byte -> int 형변환
        System.out.println(intNumber); // 10

        char charAlphabet = 'A';
        intNumber = charAlphabet;   // char -> int 형변환
        System.out.println("charAlphabet = 'A' -> int " + intNumber); // A의 유니코드 : 65

        intNumber = 100;
        longNumber = intNumber; // int -> number 형변환
        System.out.println("int 100 -> long " + longNumber); // 100

        intNumber = 200;
        doubleNumber = intNumber; // int -> double 형변환
        System.out.println(doubleNumber); // 200.0  (소수점이 추가된 실수출력)

        // 자동 형변환: 작은 타입, 큰 타입 연산
        intNumber = 10;
        doubleNumber = 5.5;
        double result = intNumber + doubleNumber; // result 에 15.5 저장됨 (int -> double)
        System.out.println("10 + 5.5 = " + result);

        int iResult = intNumber / 4; // iResult 에 2 저장됨 (int형 연산 -> 소수점 버려짐)
        double dResult = intNumber / 4.0; // dResult 에 2.5 저장됨 (double형 연산 -> 소수점 저장)
        System.out.println("iResult = " + iResult);
        System.out.println("dResult = " + dResult);

        // 배열
        int[] a = {1, 2, 3};
        System.out.println(a); // a에 저장된 주소
        System.out.println(Arrays.toString(a)); // [1, 2, 3] 출력.

        // 문자열
        String msg = "Hello World";
        System.out.println(msg);

        // 래퍼클래스
        // 박싱 : Integer 래퍼 클래스 num 에 21 의 값을 저장
        int number = 21;
        Integer num = number;

        // 언박싱
        int n = num.intValue(); // 래퍼 클래스들은 inValue() 같은 언박싱 메서드들을 제공.
        System.out.println("int number = " + number);
        System.out.println("Integer num = " + num);
        System.out.println("num.intValue() = " + n);

        /////////////////////////////////
        // 아스키코드
        // 숫자 -> 문자
        Scanner sc = new Scanner(System.in);
        int asciiNumber = sc.nextInt();
        char ch = (char) asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.
        System.out.println(ch);

        // 문자 -> 숫자
        Scanner sc1 = new Scanner(System.in);
        char letter = sc1.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        asciiNumber = (int) letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.
        System.out.println(asciiNumber);

        sc.close();
        sc1.close();

    }
}