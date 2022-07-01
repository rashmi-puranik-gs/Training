package assingment3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;



public class Using_fast_safe 
{
	public static void RemoveDubfromlist()
	{
		CopyOnWriteArrayList<Integer> list   
        = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(5);
		System.out.println("the list before removing dublicates");
		Iterator<Integer> itr=list.iterator();
		
		Set<Integer> s=new HashSet<>(list);
		
		while(itr.hasNext()) 
		{
        	System.out.println(itr.next());
        	list.add(9);
		}
		System.out.println("the list after removing dublicates: "+s);
	
}
	public static void main(String[] args) 
	{
		RemoveDubfromlist();
	}
}
