package _24_Builder.StaticMember;

public class StaticMemberMain {
    public static void main(String[] args) {
        StaticMember staticMember = new StaticMember.Builder()
                .name("영희")
                .age(14)
                .email("user@naver.com")
                .build();

        /*
        * Builder 패턴
        * 1. 필요한 필드 데이터만 설정 가능
        * 2. 유연성 확보
        * 3. 가독성 향상
        * 4. 변경 가능성을 최소화
        * */


    }


}
