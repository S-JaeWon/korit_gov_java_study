package _19_Interface.TVRemoteController;

public class Main {
    public static void main(String[] args) {
        TVRemoteController tvRemoteController = new TVRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onUpPressedChannelUpButton();
        tvRemoteController.onDownPressedVolumeDownButton();

    }
}
