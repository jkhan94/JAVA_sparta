package week3.interfaceTest;

public class StaticMain implements AAA {

    @Override
    public void a() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        StaticMain main = new StaticMain();
        main.a();
        main.aa();
        System.out.println();

        // static 메서드 aaa() 호출
        AAA.aaa();
    }
}

interface AAA {
    void a();
    default void aa() {
        System.out.println("AA");
    }
    static void aaa() {
        System.out.println("static method");
    }
}