package library_system;

public abstract class Book {
    private String name;
    private Author author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void printInfo() {
        System.out.println("this is a book");
    }

    public abstract void read();
}
