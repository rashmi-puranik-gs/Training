package assingment3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Using_fail_fast 
{
	public  static void checkDuplicate(){
	        List<Integer> l =new ArrayList<>();
	        l.add(1);
	        l.add(2);
	        l.add(3);
	        Iterator<Integer> itr= l.iterator();
	         while(itr.hasNext()) 
	         {
	        	System.out.println(itr.next());
	        	l.add(3);
	         }
}
	 public static void main(String[] args) 
	 {
		 checkDuplicate();
	 }

}
