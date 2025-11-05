package _33_Exception;

/*
* 오류
* Error: 시스템적 오류
* -> OutOfMemory, StackOverFlowError
*
* Exception: 코딩 오류
* -> NullPointException, IOException
* 프로그램 실행 중 발생할 수 있는 상황을 객체로 표현
* */

public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int result = a / b;
//        System.out.println(result); // 연산 오류

        // 예외처리 필요성
        // 자바의 특성상 컴파일 중 예외가 발생하면 전체 실패로 간주

        /*
        * try - catch - finally / throws
        *
        * try {
        *   예외가 발생 할 수 있는 코드
        * } catch (Exception e) {
        *   예외 발생시 실행할 코드
        * } finally {
        *   예외 발생 여부와 상관없이 무조건 실행되는 코드
        * }
        *
        * */

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("연산 오류: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage()); // string이 아니라 e가 들어간다면 cause, 연속 예외 터짐
            // throw 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역활
        } finally {
            System.out.println("프로그램 종료");
        }

        int[] numbs = {1, 2, 3};

        try {
            System.out.println(numbs[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
