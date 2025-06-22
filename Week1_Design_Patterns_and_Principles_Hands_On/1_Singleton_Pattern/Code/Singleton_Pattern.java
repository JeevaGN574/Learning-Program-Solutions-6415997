public class Singleton_Pattern {

    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            System.out.println("Singleton instance created!");
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        if (obj1 == obj2) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
