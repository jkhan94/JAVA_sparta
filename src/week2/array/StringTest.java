package week2.array;

public class StringTest {
    public static void main(String[] args) {
        // 선언 후 하나씩 초기화 할 수 있습니다.
        String[] stringArray = new String[3];
        stringArray[0] = "val1";
        stringArray[1] = "val2";
        stringArray[2] = "val3";

        // 선언과 동시에 초기화 할 수 있습니다.
        String[] stringArray1 = new String[]{"val1", "val2", "val3"};
        String[] stringArray2 = {"val1", "val2", "val3"};


// String 기능 활용하기
        String str = "ABCD";

        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

        // charAt(int index) : index번째 문자
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

        // substring(int from, int to) : 인덱스 from~to까지 출력
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

        // equals(String str) : 문자열 비교. 대입 연산자 = 쓰면 주소값 비교
        String newStr = "ABCD";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true 출력

        // toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환

        // char[] -> String 으로 변환
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환
    }
}
