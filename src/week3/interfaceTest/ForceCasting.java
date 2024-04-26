package week3.interfaceTest;

public class ForceCasting {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        // a1은 인터페이스 A 타입 -> a()만 갖고 있음.
        // int a = 10.1111 이면 a=10임. 왜냐하면 리터럴은 더블이지만 a는 정수형이기 때문.
        // 클래스도 마찬가지다. B5객체가 생성되지만 그걸 A5타입에 저장하므로 A5타입이 쓸 수 있는 것만 사용 가능.
        A5 a1 = new B5();
        a1.a();
        // a1.b(); // 불가능

        System.out.println("\nB 강제 타입변환");
        B5 b = (B5) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A5 a2 = new C5();
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C5 c = (C5) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능

    }
}

interface A5 {
    void a();
}

class B5 implements A5 {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}

class C5 extends B5 {
    public void c() {
        System.out.println("C.c()");
    }
}