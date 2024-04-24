package week2.operAndStatement;

public class Operator {
    public static void main(String[] args) {
// 연산자, 피연산자
        int x = 5;
        int y = 10;
        int z = x + y;  // 5(피연산자) +(연산자) 10(피연산자) 계산
        System.out.println(z);  // 출력값 : 15

// 사칙 연산 : + - * / %
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        // 덧셈
        c = a + b;
        System.out.println(c); // 30

        // 뺄셈
        c = a - b;
        System.out.println(c); // 10

        // 곱셈
        c = a * b;
        System.out.println(c); // 200

        // 나눗셈 (몫)
        c = a / b;
        System.out.println(c); // 2

        // 나눗셈 (나머지) = 나머지 연산
        c = a % b;
        System.out.println(c); // 0

// 비교 연산자 (참이면 true, 거짓이면 false) :  > < >= <= == !=
        System.out.println(10 > 9); // 10 는 9 보다 크다 (참이면 true, 거짓이면 false)
        System.out.println(10 >= 9); // 10 는 9 보다 크거나 같다 (true)
        System.out.println(10 < 9); // 10 는 9 보다 작다 (false)
        System.out.println(10 <= 9); // 10 는 9 보다 작거나 같다 (false)
        System.out.println(10 == 10); // 10 는 10 와 같다 (true)
        System.out.println(10 == 9); // 10 는 9 과 같다 (false)
        System.out.println(10 != 10); // 10 는 10 와 같지 않다 (false)
        System.out.println(10 != 9); // 10 는 9 과 같지 않다 (true)

// 논리 연산자 && || !
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false

        // 피연산자 중 하나라도 true 이면 true
        System.out.println(flag1 || flag2); // true
        System.out.println(flag1 || flag2 || flag3); // true
        // 피연산자 모두 true 이면 true
        System.out.println(flag1 && flag2); // true (flag1, flag2 모두 true 라서)
        System.out.println(flag1 && flag2 && flag3); // false (flag3은 false 라서)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3 은 1 보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나, 3 은 1 보다 작다 (false)

        // 비교연산은 한 번에 두 개만 가능함.
        // 1<3 && 3<5 로 써야 함.
        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!flag1); // false (flag1 값의 반대)
        System.out.println(!flag3); // true (flag3 값의 반대)
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

// 대입 연산자 += -= *= /= =
        int number = 10;
        number = number + 2;
        System.out.println(number); // 12

        number = number - 2;
        System.out.println(number); // 10

        number = number * 2;
        System.out.println(number); // 20

        number = number / 2;
        System.out.println(number); // 10

        number = number % 2;
        System.out.println(number); // 0

        number = number++;
        System.out.println(number); // 2

        number = number--;
        System.out.println(number); // 0

// 복합 대입 연산자
        number = 10;

        number += 2;
        System.out.println(number); // 12

        number -= 2;
        System.out.println(number); // 10

        number *= 2;
        System.out.println(number); // 20

        number /= 2;
        System.out.println(number); // 10

        number %= 2;
        System.out.println(number); // 0

// 대입 증감 연산자
        int e = 10;
        int f = 10;
        int val = ++e + f--; // a 는 연산전에 +1, b 는 연산후에 -1

        System.out.println(e); // 11
        System.out.println(f); // 9
        System.out.println(val); // 21
        // 11 + 9 가 왜 21이 나오는 이유
        // e는 1 더하고 연산. f는 연산 후 1 빼기
        // 따라서 val = 11 + 10 = 21

        int g = e--; // g 에 e 값 대입 후 e-1  (즉, e=10, g=11)
        int h = ++f; // f 값 +1 후에 h 에 대입 (즉, f=10, h=10)
        int val1 = g-- * ++h; // g 는 연산후에 -1, h 는 연산전에 +1

        System.out.println(e); // 10
        System.out.println(f); // 10
        System.out.println(g); // 11
        System.out.println(h); // 10
        System.out.println(val1); // 11 * 11 = 121
        // g는 11로 계산 후 1 뺴기. h는 1 더해서 11로 계산.
        // 따라서 val1 = 11*11 = 121

// 형변환 연산자
        int intNumber = 93 + (int) 98.8; // 93 + 98
        double doubleNumber = (double) 93 + 98.8; // 93.0 + 98.8

// 삼항 연산자
        int xx = 1;
        int yy = 9;

        boolean i = (xx == yy) ? true : false;
        System.out.println(i); // false

        String s = (xx != yy) ? "정답" : "땡";
        System.out.println(s); // 땡

        int max = (xx > yy) ? xx : yy;
        System.out.println(max); // 9

        int min = (xx < yy) ? xx : yy;
        System.out.println(min); // 1

// 연산자 우선순위
        x = 2;
        y = 9;
        z = 10;

        boolean result = x < y && y < z; // <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // true

        result = x + 10 < y && y < z; // +10 산술연산자 계산 후 <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // false

        result = x + 2 * 3 > y; // 산술연산자 곱센 > 덧셈 순으로 계산 후 > 비교연산자 계산
        System.out.println(result); // false (8>9)

        result = (x + 2) * 3 > y; // 괄호안 덧셈 연산 후 괄호 밖 곱셈 계산 후 > 비교연산자 계산
        System.out.println(result); // true (12>9)

// 산술변환
        short j = 10;
        int k = 20;
        int l = j + k; // 결과값은 더 큰 표현타입인 int 타입의 변수로만 저장할 수 있습니다.
        long lx = 30L;
        long lz = l + lx; // 결과값은 더 큰 표현타입인 long 타입의 변수로만 저장할 수 있습니다.

        float fx = j; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fy = k; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float fz = l; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);

// 비트 연산
        // 3의 이진수값은 11(2). 12의 이진수값은 1100(2).
        // (2) 표기는 이 숫자가 이진수값이라는 표식.

        System.out.println(3 << 2);
        // 3의 이진수값인 11(2) 에서 왼쪽으로 2번 옮겨져서 1100(2) 인 12값이 됩니다.


        System.out.println(3 >> 1);
        // 3의 이진수값인 11(2) 에서 오른쪽으로 1번 옮겨져서 1(2) 인 1 값이 됩니다.
        // 자릿수를 벗어난 비트는 버림.

    }
}


