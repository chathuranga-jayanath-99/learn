package library_system;

public class Fiction extends Book implements Borrowable {
    public void read() {
        System.out.println("This is a fiction book");
    }
}
