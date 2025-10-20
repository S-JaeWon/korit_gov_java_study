package _12_Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열
        // 자료형[] 배열이름 = new 자료형[n]; n = 할당할 공간 수
        // 혹은, 자료형 배열이름[] = new 자료형[n]; n = 할당할 공간 수
        int[] numbers/*[]*/ = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers); // 배열안에 있는 값이 아닌, 배열의 주소

        // 자료형[] 배열이름 = new 자료형 [] {값1, 값2, ...};
        String[] countries = new String[] {"Korea", "Japan", "China", "UK", "USA"};

        // 자료형 [] 배열이름 = {값1, 값2, ...};
        String[] name = {"철수", "영희", "민수"};

        //배열 값의 변경
        countries[0] = "Swiss";
        System.out.println(countries[0]);

        // 배열이름.length, 배열의 길이
        System.out.println(numbers.length);
    }
}
