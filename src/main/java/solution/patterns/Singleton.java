package solution.patterns;

public class Singleton {
    private Singleton() {System.out.println("Singleton");}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args){
        Singleton s = new Singleton();
        Singleton t = new Singleton();
        s.getInstance();
        t.getInstance();
    }
}
