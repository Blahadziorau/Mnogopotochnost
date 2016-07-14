package Potoki;

import java.util.Random;

/**
 * Created by Java on 29.06.2016.
 */
public class Producent implements Runnable {
private Store store;

    public Producent(Store store) {
        this.store = store;
    }

    public void run() {
        Random random= new Random();
        while (true){
            store.add(random.nextInt());
        }
    }
}
