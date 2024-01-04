package design_patterns.creational;

public class Singleton {
    private static Singleton singleInstance = null;

    public String s;

    private Singleton() {
        s = "I am string part of singleton class";
    }

    public static synchronized Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

class Execution {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("x point to memory locaion: " + x.hashCode());
        System.out.println("y point to memory locaion: " + y.hashCode());
        System.out.println("z point to memory locaion: " + z.hashCode());
    }
}
