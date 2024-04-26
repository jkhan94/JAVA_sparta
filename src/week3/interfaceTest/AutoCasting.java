package week3.interfaceTest;

public class AutoCasting {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A4 a1 = new B4();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A4 a2 = new C4();

    }
}

interface A4 { }
class B4 implements A4 {}
class C4 extends B4 {}