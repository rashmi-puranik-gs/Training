package C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class RemoveDuplicates {
    public void AddElement(){
        ArrayList<Integer> l =new ArrayList<>();
        Iterator<Integer> itr=l.listIterator();

            l.add(1);
            l.add(2);
            l.add(3);
            l.add(2);
			/*
			 * while (itr.hasNext()){ for (int i = 0; i < l.size()-1; i++){ if
			 * (itr.next().equals(l.get(i))) { itr.remove(); } } }
			 */
            
           // Above commented code gives ConcurrentModificationException .
         System.out.println("List Entered "+l);
         
         Set<Integer> s=new HashSet<>(l);
         System.out.println("List After Removing Duplicate :"+s);
        
        }

    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        r.AddElement();
    }

}