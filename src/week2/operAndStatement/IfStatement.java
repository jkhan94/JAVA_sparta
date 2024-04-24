package week2.operAndStatement;

import java.util.Objects;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // 조건문
        boolean flag = true;
        if (flag) {
            System.out.println("flag 값은 true 입니다."); // flag 값은 true 입니다. 출력
        }

        // 조건문 with else
        flag = false;
        if (flag) {
            System.out.println("flag 값은 true 입니다."); // 미출력
        } else {
            System.out.println("flag 값은 false 입니다."); // flag 값은 false 입니다. 출력
        }

        // 조건문 with else if
        int number = 2;
        if (number == 1) {
            System.out.println("number 값은 1 입니다."); // 미출력
        } else if (number == 2) {
            System.out.println("number 값은 2 입니다."); // number 값은 2 입니다. 출력
        } else {
            System.out.println("number 값은 모르는 값입니다."); // 미출력
        }

        // 중첩 조건문
        flag = true;
        number = 2;
        if (flag) {
            if (number == 1) {
                System.out.println("flag 값은 true, number 값은 1 입니다."); // 미출력
            } else if (number == 2) {
                System.out.println("flag 값은 true, number 값은 2 입니다."); // flag 값은 true, number 값은 2 입니다. 출력
            }
        } else {
            if (number == 1) {
                System.out.println("flag 값은 false, number 값은 1 입니다."); // 미출력
            } else if (number == 2) {
                System.out.println("flag 값은 false, number 값은 2 입니다."); // 미출력
            }
        }

        // 조건문으로 가위바위보 만들기
        // 입/출력 예시
        // A 입력 : 가위
        // B 입력 : 보
        // A 가 이겼습니다.
        Scanner sc = new Scanner(System.in);

        System.out.print("A 입력 : ");
        String aHand = sc.nextLine(); // A 입력

        System.out.print("B 입력 : ");
        String bHand = sc.nextLine(); // B 입력

        // 값을 비교하는 Objects.equals() 메서드 사용
        // 오버라이딩 해서 쓰는데 클래스로 선언하지 않아서 object를 쓴 것 같다.
        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A 와 B 는 비겼습니다."); // A 와 B 의 입력값을 비교해서 결과 출력
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B 가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A 가 이겼습니다.");
            } else {
                System.out.println(" B 유저 값을 잘못 입력하셨습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 와 B 는 비겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B 가 이겼습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A 와 B 는 비겼습니다.");
            }
        }

    }
}


