package week4.exceeptionTest;

// 1. 예외 정의
class OurBadException extends Exception {
    public OurBadException() {
        // 부모 생성자를 통해 에러 내용 정의
        super("OurBadException 처리: 위험한 행동을 하면 예외처리를 꼭 해야합니다!");
    }
}
