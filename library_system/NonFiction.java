package library_system;

public class NonFiction extends Book implements Borrowable {
    public void read() {
        System.out.println("This is a non fiction book");
    }
}
