package _16_Class.Waterbottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(500);

        System.out.println(waterBottle.getWaterBottle());

        waterBottle.fill(600);
        waterBottle.fill(300);

        System.out.println(waterBottle.getWaterBottle());

        waterBottle.drink(801);
        waterBottle.drink(800);

        System.out.println(waterBottle.getWaterBottle());
    }
}
