package week2.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // 2차원 배열
        // 1. 중괄호를 사용해 초기화
        int[][] arraySample = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // 2. 반복문을 통한 초기화
        int[][] array = new int[2][3]; // 최초 선언
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
            }
        }

        // 3차원 배열의 이해
        // 중괄호 3개를 써서 3차원 배열 초기화를 할 수 있습니다.
        int[][][] MultiArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};



    }
}
