package pattern.adapter.singleton;

public class Singleton {
      /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载*/
//    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化*/
    private Singleton () {

    }

//    /*静态工程方法，创建实例*/
//    public static Singleton getInstance(){
//        if (instance == null){
//            return new Singleton();
//        }
//        return instance;
//    }

    /*这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，
      肯定就会出现问题了，如何解决？我们首先会想到对getInstance方法加synchronized关键字
    */
//    public static synchronized Singleton getInstance(){
//        if (instance == null) {
//            return new Singleton();
//        }
//        return instance;
//    }

    /*
        但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，
        事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进
     */
//    public static Singleton getInstance(){
//        if (instance == null) {
//            synchronized (instance){
//                if (instance == null) {
//                    return new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

//    public static synchronized void syncInit () {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//    }
//
//    public static Singleton getInstanceTest(){
//        if (instance == null) {
//            syncInit();
//        }
//        return instance;
//    }

    /* 此处使用一个内部类来维护单例 */
    public static class SingletonFactory {
        private static Singleton singleton = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve(){
//        return instance;
        return getInstance();
    }


}
