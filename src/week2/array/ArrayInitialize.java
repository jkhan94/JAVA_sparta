package week2.array;

import java.util.Arrays;

// 배열 초기화
public class ArrayInitialize {
    public static void main(String[] args) {
        //1. 배열에 특정값 대입하며 선언
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        //2. for문을 통해 값을 대입
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        //향상된 for문을 통한 배열 출력
        for (int i : intArray) {
            System.out.print(i); // 01234
        }
        System.out.println(); // 줄바꿈

        //3. 배열의 주소를 모두 같은값으로 초기화
        Arrays.fill(intArray, 1);//배열의 모든 값을 1로 초기화
        for (int i : intArray) {
            System.out.print(i);  // 11111
        }
        System.out.println();

        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a; // 얕은 복사
        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)
        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.

        // 깊은 복사 for문
        a[0] = 1;
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]; // 깊은 복사
        }
        c[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)
        System.out.println(a[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

        // 깊은 복사 메서드
        // 1. clone() 메서드 : 가장 간단하지만 2차원이상 배열에서는 얕은 복사로 동작
        int[] d = a.clone();
        for(int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }
        System.out.println();

        // 2. Arrays.copyOf() 메서드
        int[] e = Arrays.copyOf(a, a.length); // 배열과 함께 length도 줌.
        for(int i = 0; i < e.length; i++) {
            System.out.print(e[i]);
        }
        System.out.println();
    }
}

