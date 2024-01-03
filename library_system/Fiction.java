package library_system;

public class Fiction extends Book implements Borrowable {
    public void read() {
        System.out.println("This is a fiction book");
        System.out.println("title: " + this.getName());
    }

    public void read(String pageContent) {
        System.out.println("title: " + this.getName());
        System.out.println(pageContent);
    }

    @Override
    public void printInfo() {
        System.out.println("this is a fiction book");
    }

    @Override
    public void totalCopiesCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalCopiesCount'");
    }

    @Override
    public void borrowedCopiesCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrowedCopiesCount'");
    }
}
