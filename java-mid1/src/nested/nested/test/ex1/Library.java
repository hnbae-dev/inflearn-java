package nested.nested.test.ex1;

public class Library {

    private Book[] books;
    private int maxBookCount;
    private int currentBookCount;

    public Library(int bookCount) {
        this.books = new Book[bookCount];
        this.maxBookCount = bookCount - 1;
    }

    private class Book {
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        if (currentBookCount > maxBookCount) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[currentBookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.printf("도서 제목: %s, 저자: %s\n", book.title, book.author);
        }
    }
}
