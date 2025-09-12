public class SingletonClass {

    // Static reference to the single instance
    private static SingletonClass singletonClass;

    // Private constructor
    private SingletonClass() {

    }

    // Public static method to get the instance
    public static SingletonClass getSingletonClassInstance() {
        if(singletonClass!=null) {
            return singletonClass;
        } else {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
