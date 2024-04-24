package week2.array;

public class DynamicArray {
    public static void main(String[] args) {
        // 가변 배열
        // 선언 및 초기화
        int[][] array = new int[3][];
        // 배열 원소마다 각기다른 크기로 지정 가능합니다.
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        // 중괄호 초기화할때도 원소배열들의 크기를 각기 다르게 생성 가능.
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
        // 2차원 가변 배열 조회
        for (int i = 0; i < array.length; i++) { // 1차원 길이
            for (int j = 0; j < array[i].length; j++) { // 2차원 길이
                System.out.println(array[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }
    }
}
