package _33_Exception;


import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String str = scanner.nextLine();
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("숫자가 아닌 값 입력");
        }
    }
}
