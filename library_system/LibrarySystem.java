package library_system;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Fiction();
        Book book2 = new NonFiction();

        book1.read();
        book2.read();
    }
}
