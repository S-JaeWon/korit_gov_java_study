package _28_WildCard;

public class UpperBounded {
    // 상한경계 와일드카드
    // <? extends U>
    // 상위 클래스 제한 (U를 포함 해서 그 자식들까지만 가능), 상한이 U
    // 읽기o 쓰기x
    public static void inspect(Box<? extends Dog> box) {
        Dog d = box.getValue();
        System.out.println(d);
    }
}
