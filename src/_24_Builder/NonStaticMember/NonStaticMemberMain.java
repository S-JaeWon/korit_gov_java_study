package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        // 스태틱 메서드 이므로 객체 생성 없이 클래스.메서드로 호출 가능
        NonStaticMember nonStaticMember = NonStaticMember.builder()
                .name("철수")
                .age(12)
                .email("user@naver.com")
                .build();
    }
}
