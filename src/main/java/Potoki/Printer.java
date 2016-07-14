package Potoki;

/**
 * Created by Java on 29.06.2016.
 */
public class Printer {

    public synchronized  void print(){
        System.out.println("print");
        while (true);
    }
}
