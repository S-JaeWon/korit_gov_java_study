package _19_Interface.TVRemoteController;

public class PowerButton extends Button {
    private boolean status;

    @Override
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("Power Off");
        } else {
            status = true;
            System.out.println("Power On");
        }
    }

}
