package B;

import java.math.BigInteger;
import java.util.Scanner;

public class My_KYC_App extends KYC implements New_KYC {

	@Override
	public void apply_KYC(BigInteger adhar) {
		System.out.println("KYC Done Using Adhar Number :["+adhar+"]");
		
	}
	
	public static void main(String[] args) {
	
		My_KYC_App k=new My_KYC_App();
		Scanner sc =new Scanner(System.in);
		System.out.println("********* WELCOME TO KYC CENTER *********");
		System.out.println("------------------------------------------");
		System.out.println("1. KYC Using Old ID Proof(PAN and PassBook)");
		System.out.println("2. KYC Using New ID Proof (Adhar Number)");
		System.out.println("Select your choice 1 or 2 :");
		int n=sc.nextInt();
		
		switch (n) {
		case 1: {
			int n1 =3;
			 System.out.println("Enter PAN card Id and PassBook Id :"); 
			 String[] docs =new String[5];
			 for(int i=0; i<n1; i++) {
				 docs[i]=sc.nextLine();
			 }
			 
			k.apply_KYC(docs[1],docs[2]);
			break;	
		}
		case 2: {
			System.out.println("Enter Your Adhar Card Number :");
			BigInteger adhar=sc.nextBigInteger();
			k.apply_KYC(adhar);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
		
	}
}
