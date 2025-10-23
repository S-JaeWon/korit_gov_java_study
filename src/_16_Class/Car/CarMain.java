package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Sonata", 2025, "검정");
        System.out.println("");
        Car car2 = new Car("Audi", 2020, "빨강");
        System.out.println("");

        Car car3 = new Car();
        System.out.println("");

        car3.carName = "Santafe";
        car3.carYearModel = 2019;
        car3.carColor = "파랑";

        car1.showInfo();
        System.out.println("");
        car3.showInfo();

        car1.startCar();

    }
}