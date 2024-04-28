package week4.exceeptionTest;

// 2. 우리의 메서드가 위험하다고 알리기(throw, throws)
class OurClass {
    private final Boolean just = true;

    // throws:예외를 던지다, 발생시키다.
    public void thisMethodIsDangerous() throws OurBadException {
        if (just) {
            // throw : 예외 객체를 던져서 처리.
            // just=true면 OurBadException 던진다.
            // 메소드 내에서 던지려면 메소드 이름 뒤에 throws가 있어야 한다.
            throw new OurBadException();
        }
    }
}
