public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Der Herr der Ringe 1", "J.R.R. Tolkien","9788845292613");
        Book book2 = new Book("Der Herr der Ringe 2", "J.R.R. Tolkien","9788845292613");
        Book book3 = new Book("Der Herr der Ringe 3", "J.R.R. Tolkien","9788845292613");



        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        library.addBook(new Book("Bibel","Jesus", "000-000-001"));
        library.displayBooks();
        library.deleteBook(book1);
        library.displayBooks();
    }
}
