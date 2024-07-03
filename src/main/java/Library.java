import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void displayBooks() {
        System.out.println("Library information's: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book delete: " + book);
        } else {
            System.out.println("book not found: " + book);
        }
    }
}
