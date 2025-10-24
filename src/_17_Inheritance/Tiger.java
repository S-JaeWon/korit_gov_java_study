package _17_Inheritance;

public class Tiger extends Animal {

    /*
    * super는 부모 클래스에게 접근할 수 있는 키워드
    * super를 사용하는데 두가지 방식
    * 1. super() : 부모 클래스의 생성자 호출, 만약 부모 클래스가 NoArg생성자라면 super() <-> AllArg생성자라면 super(필드값)
    * 2. super.메서드명() : 부모 클래스의 메서드 호출
    * 3. super.필드명 : 부모 클래스의 필드 속성 값 불러오기
    * */

    // 부모 클래스의 속성 필드 값 외에 따로 추가 가능
    private boolean isStriped; // 자식 클래스 tiger 만의 필드 속성 값

    Tiger(String animalName, int animalAge, boolean isStriped) {
        super(animalName, animalAge);
        this.isStriped = isStriped;
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    // 오버라이딩
    // 상속 관계에서 자식 클래스가 부모 클래스의 메서드를 수정하는 것
    // 자식 클래스에 맞게 다르게 동작 시켜야 할 때

    @Override
    public void move() {
        super.move(); // 오버라이딩을 통해 수정은 했지만 부모 클래스의 메서드를 사용 할 때는 super.[메서드]; 로 호출
        System.out.println("안 움직이기");
    }

    public void hunt() {
        System.out.println(getAnimalName() + "이(가) 사냥을 합니다.");
    }


}
