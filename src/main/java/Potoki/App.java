package Potoki;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Runnable c1 = new Consumer(store);
        Runnable c2 = new Consumer(store);
        Runnable p2 = new Producent(store);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t4 = new Thread(p2);
        t1.start();
        t2.start();
        t4.start();

    }

}
