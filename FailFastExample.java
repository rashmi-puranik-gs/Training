import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
public class FailFastExample {
 
public static void main(String[] args) {
Map month = new HashMap();
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