package _17_Inheritance.Shipment;

public class TruckShipment extends Shipment {
    public TruckShipment(String origin, String destination) {
        super(origin, destination);
    }

    @Override
    public int calcFee(int weight, int distance) {
        if(weight < 0 ) {
            weight = 0;
        }
        if (distance < 0) {
            distance = 0;
        }
        return 5000 + weight * 40 + distance * 30;
    }

}
