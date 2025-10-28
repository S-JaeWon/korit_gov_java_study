package _23_Static.Person;

public class Person {
    public static int population = 0;
    final String country1 = "korea";
    static final String country2 = "한국";

    public Person(){
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구 수 : " + population);
    }
}
