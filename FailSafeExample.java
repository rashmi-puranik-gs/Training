import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class FailSafeExample {
         
    public static void main(String[] args) {
        ConcurrentMap month = new ConcurrentHashMap();
        month.put("1", "January");
        month.put("2", "February");
        month.put("3","March");
         
        Iterator iterator = month.keySet().iterator();
         
        while (iterator.hasNext()) {
            System.out.println(month.get(iterator.next()));
            month.put("4", "April");
        }       
    }    
}
