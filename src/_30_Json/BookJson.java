package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString

class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        Map<String, String> map;

        Book book = new Book("978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");

        String bookJson;

        bookJson = gson.toJson(book);
        System.out.println(bookJson);

        map = gson.fromJson(bookJson, Map.class);
        System.out.println(map);

        bookJson = gson1.toJson(map);
        System.out.println(bookJson);

        Book book1;
        book1 = gson1.fromJson(bookJson, Book.class);
        System.out.println(book1);

    }
}
