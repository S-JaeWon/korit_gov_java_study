package _16_Class.Waterbottle;

public class WaterBottle {
    private  int currentWater;

    WaterBottle (int currentWater) {
        this.currentWater = currentWater;
    }

    public void fill(int water) {
        if(currentWater + water > 1000) {
            System.out.println("용량 초과");
        } else {
            currentWater += water;
        }
    }

    public void drink(int water) {
        if(currentWater  < water){
            System.out.println("남은 물 없음");
        } else {
            currentWater -= water;
        }
    }

    public int getWaterBottle() {
        return currentWater;
    }
}
