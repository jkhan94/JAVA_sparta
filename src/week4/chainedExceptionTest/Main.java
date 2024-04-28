package week4.chainedExceptionTest;

// 연결된 예외
// 출력 : Caused by: java.lang.NullPointerException: 진짜 예외이유
public class Main {

    public static void main(String[] args) {
        try {
            // 예외 생성
            NumberFormatException ex = new NumberFormatException("가짜 예외이유");

            // 원인 예외 설정(지정한 예외를 원인 예외로 등록)
            // 원인 예외: NullPointerException = 진짜 이유
            ex.initCause(new NullPointerException("진짜 예외이유"));

            // 예외를 직접 던집니다.
            throw ex;
        } catch (NumberFormatException ex) {
            // 예외 로그 출력
//            ex.printStackTrace();
            // 예외 원인 조회 후 출력
//            ex.getCause().printStackTrace();

            // 원인 예외 반환
            System.out.println(ex.getCause());
            // 예외 메시지 출력
            System.out.println(ex.getMessage());
        }

        // 런타임 에러로 묶음.
        // checked exception 을 unchecked exception으로 래핑.
        throw new RuntimeException(new Exception("이것이 진짜 예외 이유 입니다."));
    }
}


