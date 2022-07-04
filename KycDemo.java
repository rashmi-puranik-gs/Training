import java.util.*;
class KycDemo
{
Scanner sc=new Scanner(System.in);
void proof()
{
String name;
String doc;
System.out.println("Enter Customer Name");
name= sc.nextLine();
System.out.println("Enter document for KYC process");
doc=sc.nextLine();
if(doc.equals("Pancard))
{
System.out.println(name+"\tUsing pancard for thier KYC Process");
}
}
void proof(String doc)
{
string name;
System.out.println("Enter customer name");
name=sc.nextLine();
if(doc.equals("AdharCard"))
{
System.out.println(name+"\tusing adhar Card for thier KYC Process");
}
}
void proof(String doc1,String doc2)
{
String name;
System.out.println("enter Customer name");
name=sc.nextLine();
if(doc1.equals("Pancard")||doc2.equals("AdharCard"))
{
System.out.println(name+"\tUsing both document that is Adhar card and PanCard for KYC Prcess");
}
}
public static void main(String args[])
{
KycDemo kc=new KycDemo();
kc.proof();
kc.proof("AdharCard");
kc.proof(""Pancard","AdharCard");
}
}



