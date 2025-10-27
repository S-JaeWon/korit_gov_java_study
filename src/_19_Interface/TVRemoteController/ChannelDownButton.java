package _19_Interface.TVRemoteController;

public class ChannelDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("채널 내리기");
    }

    // 일반 메서드 재정의
    @Override
    public void onDown() {
        System.out.println("채널 계속 내리기");
    }
}
