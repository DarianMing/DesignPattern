package pattern.adapter.singleton;

import java.util.Vector;

/*单例对象的属性更新同步 采用"影子实例"的办法
 * https://www.ibm.com/developerworks/cn/java/l-singleton/
 * 具体说，就是在更新属性时，直接生成另一个单例对象实例，这个新生成的单例对象实例
 * 将从数据库或文件中读取最新的配置信息；然后将这些配置信息直接赋值给旧单例对象的属性。
 */
public class GlobalConfigOne {
    private static GlobalConfigOne instance = null;
    private Vector properties;
    private GlobalConfigOne(){
        //Load configuration information from DB or file
        //Set values for properties
    }

    private static synchronized void syncInit(){
        if (instance == null) {
            instance = new GlobalConfigOne();
        }
    }

    private static GlobalConfigOne getInstance(){
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public Vector getProperties(){
        return properties;
    }

    public void updateProperties (){
        //Load updated configuration information by new a GlobalConfig object
        GlobalConfigOne shadow = new  GlobalConfigOne();
        properties = shadow.getProperties();
    }
}
