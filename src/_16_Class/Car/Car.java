package _16_Class.Car;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    // 생성자
    Car() {
        //NoArgsConstructor, 속성 값이 없는 생성자
        System.out.println("객체 생성");
    }

    Car(String carName, int carYearModel, String carColor) {
        // RequiredArgsConstructor, 속성 값이 다 있다면 AllArgsConstructor

        // this -> 생성된 객체를 의미함.
        // this.속성 = 매개변수
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
        System.out.println(carYearModel + "연식 " + carColor + "색 " + carName + " 출고");
    }

    public void startCar() {
        System.out.println(carName + "의 시동 걸기");
    }

    public void drive() {
        System.out.println(carName + " 전진");
    }

    public void stop() {
        System.out.println(carName + " 정지");
    }

    public void showInfo() {
        System.out.println("차 이름: " + carName + "\n" + "연식: " + carYearModel + "\n" + "색상: " + carColor);
    }
}
