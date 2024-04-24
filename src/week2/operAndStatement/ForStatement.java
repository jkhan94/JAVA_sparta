package week2.operAndStatement;

public class ForStatement {
    public static void main(String[] args) {
        // for 문
        // 출력: 0번째 출력, 1번째 출력, 2번째 출력, 3번째 출력
        for (int i = 0; i < 4; i++) { // 변수 i 값은 0 ~ 3 까지 반복
            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
        }

        // 향상된 for 문
        // 출력: 3 6 9 12 15
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        // 만약 기존 for 문으로 구현한다면?
        for (int i = 0; i < numbers.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
            System.out.println(numbers[i]);
        }

        // while 문
        // 출력 : 1출력 2출력 3출력
        int number = 0;
        while (number < 3) {
            number++;
            System.out.println(number + "출력");
        }

        // do-while 문
        // 출력 : 4출력
        number = 4;
        do {
            System.out.println(number + "출력");
        } while (number < 3); // 연산을 한번 수행 후 조건문 체크


        // break 명령
        // 출력 : 1출력
        number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                break;  // 2일때 반복 중단
            }
            System.out.println(number + "출력");
        }

        // break 명령 범위: break가 속한 반복문을 탈출.
        /* 출력
        i: 0 // 바깥 반복문 부터 수행 시작
        j: 0 // 안쪽 반복문 1회차 수행
        j: 1
        j: 2 // j 가 2일때 안쪽 반복문 break;
        i: 1 // 바깥 반복문은 아직 break; 호출이 안됬으므로 다음 반복수행
        j: 0 // 안쪽 반복문 2회차 수행
        j: 1
        j: 2 // j 가 2일때 안쪽 반복문 두번째 break;
        i: 2 // i 가 2일때 바깥 반복문도 break; 호출되어 종료*/
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
        }


        // continue 명령
        // 출력: 1출력, 3출력
        number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                continue;  // 2일때 반복 패스 = 출력 패스.
            }
            System.out.println(number + "출력");
        }


    }
}
