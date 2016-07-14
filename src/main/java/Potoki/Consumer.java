package Potoki;

/**
 * Created by Java on 29.06.2016.
 */
public class Consumer implements  Runnable {
   private  Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while(true){
            store.remove();
        }
    }
}
