package _17_Inheritance.Shipment;

public class Main {
    public static void main(String[] args) {
        BikeShipment bike = new BikeShipment("한국", "중국");

        bike.route();
        System.out.println(bike.calcFee(50, 100));


    }
}
