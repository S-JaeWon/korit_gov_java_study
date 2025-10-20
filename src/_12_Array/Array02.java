package _12_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회
        String[] countries = new String[] {"Korea", "Japan", "China", "UK", "USA"};

        // 반복문 순회
        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]);
        }

        // enhanced for (for-each) 향상된 for 문
        for (String country : countries) {
//            System.out.println(country);
        }

        String[] foods = {"tiramisu", "gazpacho", "ratatouille", "paella", "pasta"};
        int i = 1;

        for (String food : foods) {
            System.out.println(i + "번 " + food);
            i++;
        }
    }
}
