package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookId(1)
                .title("수학의 정석")
                .author("홍성대")
                .isbn("9791156200291")
                .build();

        System.out.println(book);
    }
}
