package Potoki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Java on 29.06.2016.
 */
public class Store {
    private List<Integer> integers= new ArrayList<Integer>();

    public boolean add(Integer integer){
        if(integers.size() <1){
            integers.add(integer);
            return  true;
        }
        return  false;
    }

    public  boolean remove(){
        if(integers.size()>0){
            integers.remove(integers.size()-1);
            return  true;
        }
        return  false;
    }
}
