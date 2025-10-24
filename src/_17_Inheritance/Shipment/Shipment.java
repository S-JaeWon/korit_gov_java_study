package _17_Inheritance.Shipment;

public class Shipment {
    private String origin;
    private String destination;

    public Shipment(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void route() {
        System.out.println(origin + " -> " + destination);
    }

    public int calcFee(int weight, int distance) {
        return 0;
    }
}
