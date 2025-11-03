package _29_Collections.Set;


import java.util.*;

public class languageSet {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C");
        strList.add("Python");
        strList.add("Java");
        strList.add("Java");
        strList.add("C++");
        strList.add("C#");
        strList.add("C");
        strList.add("Java");
        System.out.println(strList);

        Set<String> strSet = new HashSet<>(strList);

        System.out.println(strSet);
        List<String> strList1 = new ArrayList<>();
        strList1.addAll(strSet);
        System.out.println(strList1);
        int search = Collections.frequency(strList, "Java"); // 특정 값 갯수
        System.out.println(search);
        Collections.replaceAll(strList1, "C", "Java");
        System.out.println(strList1);

        int count = 0;

        for (String s : strList1) {
            if (s.contains("Java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
