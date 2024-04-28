package week4.exceeptionTest;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        try {
            // 1. 예외를 throws 할 수 있는 위험한 메소드의 실행 시도.
            // "시도" 해보는 코드가 들어가는 블럭.
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            // 2. 예외가 발생하면, "잡아서" handling.
            // 예외가 발생하는경우 "handling" 하는 코드가 들어가는 블럭.
            // 즉 try 블럭 내의 구문을 실행하다가 예외가 발생하면
            // 예외가 발생한 줄에서 바로 코드 실행을 멈추고
            // 여기 있는 catch 블럭 내의 코드가 실행됨.
            System.out.println(e.getMessage());
        } finally {
            // 3. 예외의 발생 여부와 상관없이 무조건 실행시켜야 하는 코드.
            // 무조건 실행되는 코드가 들어가는 블럭.
            System.out.println("우리는 방금 예외를 handling 했습니다! 예외가 발생했든, 정상 실행했든 여기는 반드시 실행되는 구문.");
        }

    }
}