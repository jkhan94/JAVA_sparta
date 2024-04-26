package week3.interfaceTest;

public class InterfaceMain extends D implements C {

    // 인터페이스 C의 추상메소드 구현
    @Override
    public void a() {
        System.out.println("A");
    }
    @Override
    public void b() {
        System.out.println("B");
    }

    // 부모클래스 함수 오버라이딩
    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        InterfaceMain main = new InterfaceMain(); // Main클래스 내의 멤버 메소드를 쓰기 위해 변수 main이란 Main 객체 생성.
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}