package _28_WildCard;

public class LowerBounded {
    // 하한경계 와일드카드
    // <? super U>
    // 하위 클래스 제한 (U 포함 그 부모들까지만 가능), 하한이 U
    // 쓰기o, 읽기는 가능하나 안전x
    public static void putDog(Box<? super Dog> box) {
//        box.setValue(new Dog());
//        box.setValue(new Corgi());
//        Dog d = box.getValue(); 컴파일 에러, 안에 있는 내용물이 dog 일지 object 일지 animal일지 모름
        Object d = box.getValue(); // 하지만 Object로 사용시 읽기 가능
    }
}
