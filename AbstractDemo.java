import java.util.*;
abstract class Laptop
{
abstract String genration();
public boolean hasCpu()
{
return true;
}
}
class Hp extends Laptop
{
String genration()
{
if(hasCpu())
{
return "i3";
}
return "Error";
}
}
class Lenovoe extends Laptop
{
String genration()
{
if(hasCpu())
{
return "i7";
}
return "Error";
}
}
class Dell extends Laptop
{
String genration()
{
if(hasCpu())
{
return "i8";
}
return "Error";
}
}
class AbstractDemo
{
public static void main(String args[])
{
Hp hp =new Hp();
String res=hp.genration();
System.out.println(res);
Lenovoe l =new Lenovoe();
String res1=l.genration();
System.out.println(res1);
Dell d= new Dell();
String res2=d.generation();
System.out.println(res2);
}
}



}

