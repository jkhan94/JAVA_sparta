package week2.operAndStatement;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 구구단 생성기
        /* 출력
        2곱하기2는4입니다.
        2곱하기3는6입니다.
        2곱하기4는8입니다.
        ... 중략 ...
        9곱하기8는72입니다.
        9곱하기9는81입니다.*/
        for (int i = 2; i <= 9; i++) { // 구구단 첫번째 지수 i
            for (int j = 2; j <= 9; j++) { // 구구단 두번째 지수 j
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }

        // 선택적 구구단 생성기
        // 입력단 제외
        // 입력: 2
        // 출력 - 입력값인 2단은 건너띄고 구구단 출력
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력제외할 구구단수 값
        for (int i = 2; i <= 9; i++) {
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }

        // 입력단만 출력
        int printNum = sc.nextInt();
        for (int j = 2; j <= 9; j++) {
            System.out.println(printNum + "곱하기" + j + "는" + (printNum * j) + "입니다.");
        }


    }
}
