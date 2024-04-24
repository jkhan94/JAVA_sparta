package week2.array;

public class ArrayTest {
    public static void main(String[] args) {
        // 배열 생성
        //배열 생성후 초기화하면 배열의 주소가 할당된다.
        //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
        int[] intArray;
        intArray = new int[3]; // 초기값 {0,0,0}
        boolean[] boolArray = new boolean[3]; // 초기값 {false, false, false}
        String[] stringArray = new String[3]; // 초기값 {"","",""}

        // 배열에서 2번쨰 순번의 값을 출력해본다. (0부터 순번이 시작하므로 2번째 순번은 1)
        System.out.println(intArray[1]); // 0

        // 조회
        // 배열이 초기화된 값을 출력해본다.
        for (int i = 0; i < intArray.length; i++) { // .length 는 배열의 길이
            System.out.print(intArray[i] + " "); // 0 0 0
        }
        System.out.println();

        // 향상된 for문
        for (int item : intArray) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 배열 활용
        // 최대값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        // 최대값 초기값 세팅
        int max = arr[0];
        // 최대값 구하기
        for (int num : arr) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }
        System.out.println(max); // 최대값 5 출력

        // 최소값 초기값 세팅
        int min = arr[0];
        // 최소값 구하기
        for (int num : arr) {
            if (num < min) { // 반복문 돌면서 나(min)보다 값이 작으면 저장
                min = num;
            }
        }
        System.out.println(min); // 최소값 1 출력
    }
}
