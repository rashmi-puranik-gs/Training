import java.util.*;
import java.util.ArrayList;
import java.util.List;
class RemoveDuplicatesNum
{
public ArrayList<Integer>removeDuplicates()
{
List<Integer>eid=new ArrayList<Integer>();
ArrayList<Integer>newlist=new ArrayList<Integer>();
eid.add(1);
eid.add(2);
eid.add(3);
eid.add(1);
eid.add(4);
Iterator<Integer>i=eid.iterator();
while(i.hasNext())
{
int val=i.next();
if(!newlist.contains(val))
{
newlist.add(val);
}
}
return newlist;
}
public static void main(String args[])
{
RemoveDuplicatesNum rd=new RemoveDuplicatesNum();
ArrayList<Integer>res=new ArrayList<Integer>();
res=rd.removeDuplicates();
System.out.println(res);
}
}

