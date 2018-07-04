package pattern.singletonPattern;

/**
 * 双检锁/双重校验锁
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class Singleton4 {
    private volatile static Singleton4 singleton;
    private Singleton4(){}
    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
