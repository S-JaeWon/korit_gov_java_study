package _19_Interface.TVRemoteController;

public class VolumeDownButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("볼륨을 낮춥니다.");
    }

    @Override
    public void onDown() {
        System.out.println("볼륨을 계속 낮춥니다.");
    }
}
