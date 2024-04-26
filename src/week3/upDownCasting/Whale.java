package week3.upDownCasting;

class Whale extends Mammal {
    // 고래는 포유류 이면서 바다에 살며 수영이 가능하다.
    public void swimming() {
        System.out.println("수영하다.");
    }

    @Override
    public void feeding() {
        System.out.println("고래는 모유수유를 합니다.");
    }
}
