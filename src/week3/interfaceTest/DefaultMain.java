package week3.interfaceTest;

public class DefaultMain implements AA {

    @Override
    public void a() {
        System.out.println("A");
    }


    public static void main(String[] args) {
        DefaultMain main = new DefaultMain();

        // 오버라이딩 된 메소드 a
        main.a();

        // 디폴트 메서드 AA : 재정의 없이 바로 사용가능.
        main.aa();
    }
}

interface AA {
    void a();

    default void aa() {
        System.out.println("AA");
    }
}