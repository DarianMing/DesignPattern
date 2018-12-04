package pattern.adapter.singleton;

import java.util.Vector;

/*单例对象的属性更新同步 参照读者/写者的处理方式
 * https://www.ibm.com/developerworks/cn/java/l-singleton/
 */
public class GlobalcConfig {
    private static GlobalcConfig instance = null;
    private Vector properties = null;
    private boolean isUpdating = false;
    private int readCount = 0;
    private GlobalcConfig(){
        //Load configuration information from DB or file
        //Set values for properties
    }

    public static synchronized void syncInit () {
        if (instance == null) {
            instance = new GlobalcConfig();
        }
    }

    public static GlobalcConfig getInstance(){
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public synchronized  void update (String p_data) {
        syncUpdateIn();
        //Update properties
    }

    private synchronized void syncUpdateIn(){
        while (readCount > 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){

            }
        }
    }

    private synchronized void syncReadIn(){
        readCount++;
    }

    private synchronized void syncReadOut(){
        readCount--;
        notifyAll();
    }
    public Vector getProperties(){
        syncReadIn();
        //Process data
        syncReadOut();
        return properties;
    }
}
