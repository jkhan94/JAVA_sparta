package week3.interfacePolymorphism;

public class Main {
    public static void main(String[] args) {
        /*       LgTv mrc = new LgTv("LG"); // LgTv를 인스턴스화
         MultiRemoteController 대신 LgTv로 해도 정상동작함.
         그러나 LgTv로 만들 경우 SamsungTv로 못 바꿔낌.
         MultiRemoteController에 LgTv 인스턴스를 저장하면 나중에 Tv를 교체할 수 있음.*/

        // LG TV 구현체를 조작
        // 자동형변환: 인터페이스 변수 = LgTv 인스턴스화
        MultiRemoteController mrc = new LgTv("LG");
        // 아래 항목들은 Tv에서 관리. 따라서 Tv를 바꿔도 값 유지.
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown(); 
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        
        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");
        // SamsungTv가 Tv로 업캐스팅되어 getTv에 들어감.
        // getTv에선 (SamsungTv) tv = 리턴.
        // MultiRemoteController samsung = (SamsungTv) tv = SamsungTv
        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();
        SamsungTv samsungTv = (SamsungTv) samsung; // MultiRemoteController를 SamsungTv로 형변환
        samsungTv.turnOnOff();


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();
        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}