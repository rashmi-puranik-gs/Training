package B;

import java.math.BigInteger;
import java.util.Scanner;

public class My_KYC_App extends KYC implements New_KYC {

	@Override
	public void apply_KYC(String adhar) {
		System.out.println("KYC Done Using Adhar Number :"+adhar);
		
	}
	
	public static void main(String[] args) {
	
		My_KYC_App k=new My_KYC_App();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1. KYC Uding Old ID Proof(PAN and PassBook)");
		System.out.println("2. KYC Uding New ID Proof (Adhar Number)");
		System.out.println("Select your choice 1 or 2 :");
		int n=sc.nextInt();
		
		switch (n) {
		case 1: {
			k.apply_KYC("hdj667676", "H68539");
			break;	
		}
		case 2: {
			k.apply_KYC("648383483838");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
		
	}
}