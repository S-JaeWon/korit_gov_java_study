package _27_Generic;

public class Main {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData();
//        responseData.setData1("데이터1");
//        responseData.setMessage("String 데이터 메세지");
//        System.out.println(responseData.toStringStr());

        ResponseData<String> responseData1 = new ResponseData<>(); // String 타입 데이터
        ResponseData<Integer> responseData2 = new ResponseData<>(); // Integer 타입 데이터

        Integer num1 = 123;
        int num2 = 123;
        System.out.println(num1);
        System.out.println(num2);

    }
}
