package week4.genericTest;

// 1.클래스 || 메서드에 사용.
//<>안에 들어가야 할 타입 명시.
//타입 변수 T. T를 쓰는 이유는 컨벤션. T,U,V, E도 사용 가능.
public class Generic<T> {
    // 2. 타입 변수는 클래스 내에서 자료형 자리에 쓰임.
    // private 프로퍼티인 t의 자료형으로 T를 씀.
    private T t;

    // 3. 메서드의 리턴 타입
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4. 제네릭을 통해 구현한 클래스를 사용하는 부분.
        // 인스턴스를 만들 때 타입 변수에 들어갈 실제 자료형을 지정. 여기서는 String.
        Generic<String> stringGeneric = new Generic<>();

        // 5. 타입 변수 T = String.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
