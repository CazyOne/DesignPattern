package CreationalPattern.SingletonPattern;

public class Singleton {
    //lazy loading, not safety
//    private static Singleton instance;
//    private Singleton (){}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //lazy loading, safety
//    private static Singleton instance;
//    private Singleton (){}
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    // the best choice in most of time
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Design Pattern!");
    }
    // still some way to fulfill it, and check it on internet.
}
