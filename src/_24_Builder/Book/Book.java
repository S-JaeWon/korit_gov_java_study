package _24_Builder.Book;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    private Book(Builder builder) {
        this.bookId = builder.bookId;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }

    public static class Builder {
        private int bookId;
        private String title;
        private String author;
        private String isbn;

        public Book.Builder bookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder title(String title) {
            if(title == "") {
                System.out.println("title 또는 author 필드가 비어있습니다.");
            } else {
                this.title = title;
            }
            return this;
        }

        public Builder author(String author) {
            if(author == "") {
                System.out.println("title 또는 author 필드가 비어있습니다.");
            } else {
                this.author = author;
            }
            return this;
        }

        public Builder isbn(String isbn) {
            if(isbn.length() != 13){
                System.out.println("ISBN형식이 아닙니다.");
            } else {
                this.isbn = isbn;
            }
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book(bookId = " + bookId + ", title = " + title + ", author = " + author + ", isbn = " + isbn + ")";
    }

}
