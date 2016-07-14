package Potoki;

/**
 * Created by Java on 29.06.2016.
 */
public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try{
                sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+i);
        }
    }

}
