package A;

import java.util.Scanner;
public class Bank_App{
public static void main(String[] args) 
        {
		float Anual_Package= 10000;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1.HDFC   2.ICICI");
		System.out.println("Select Bank To Create Account :");
		int n=sc.nextInt();
		
		switch(n){
		case 1:{
			Bank h=new HDFC();
			System.out.println(h.CurrentAccount(Anual_Package));
			System.out.println(h.SavingAccount());
			//h.Loan();
			break;
				}
		case 2:{
			Bank i=new  ICICI();
			System.out.println(i.CurrentAccount(Anual_Package));
	        System.out.println( i.SavingAccount());
	        //i.Loan();
	        break;
		}
		default:
			System.out.println("Unexpected value: " + n);
			throw new IllegalArgumentException();
		}
		        
        
        }
    
}