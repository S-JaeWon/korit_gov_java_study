package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        /*
        * 변수명은 직관적이고 한눈에 알아볼 수 있게
        * 공백x, 숫자가 먼저 x
        * 단어조합시 두번째 단어부터 구분 ex)firstName
        * 예약어 사용 x
        * */
        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carEnginType = "electric";
        String carColor = "red";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        // boolean
        boolean isEmpty = false;

        // 상수, 변수 앞 final -> 이후 변수 변경 불가
        final String COUNTRY_CODE = "KR"; // 상수는 대문자 + '_' 조합
        // COUNTRY_CODE = "US"; <- X

        // 생년월일 -> 상수선언, 이름 -> 변수 선언
        final String BIRTH_DATE = "1996년 05월 07일";
        String name = "심재원";
        System.out.println("제 이름은 " + name + " 입니다. 생년월일은 " + BIRTH_DATE + " 입니다.");
    }
}
