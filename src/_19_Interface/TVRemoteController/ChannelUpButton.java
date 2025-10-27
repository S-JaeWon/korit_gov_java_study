package _19_Interface.TVRemoteController;

public class ChannelUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("채널 올리기");
    }

    // 일반 메서드 재정의
    @Override
    public void onUp() {
        System.out.println("채널 계속 올리기");
    }
}