package _29_Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrSet {
    public static void main(String[] args) {
        /*
        *  Set -> List 와 달리 순서 x 중복 허용 x
        *  List -> Set -> List 형변환 중요
        * */

        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Swift");
        strSet1.add("Swift");
        strSet1.add("Swift");
        strSet1.add("Swift");

        System.out.println(strSet1);

        for(String s : strSet1) {
            System.out.println(s);
        }

        strList1.addAll(strSet1); // Set -> List
        System.out.println(strList1);

    }
}
