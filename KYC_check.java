package KYC_methodCheck;

import java.math.BigInteger;
import java.util.Scanner;

public class KYC_check extends Old_KYC implements New_KYC {

    @Override
    public void apply_KYC(BigInteger Aadhar) {
        System.out.println("KYC Done Using Adhar Number :" + Aadhar);

    }

    public static void main(String[] args) {

        KYC_check k = new KYC_check();
        Scanner sc = new Scanner(System.in);

        System.out.println("Select option 1 or 2 for KYC document:");
        System.out.println("1. KYC using old method Pancard Number");
        System.out.println("2. KYC Uding new method Aadhar Number");

        int n = sc.nextInt();

        switch (n) {

            case 1: {
                int n1 = 3;
                System.out.println("Enter PAN card Id :");
                // String pan=sc.nextLine();

                // System.out.println("Enter Passbook Id:");
                // String pass =sc.nextLine();
                String[] docs = new String[10];
                for (int i = 0; i < n1; i++) {
                    docs[i] = sc.nextLine();
                }

                k.apply_KYC(docs[1], docs[2]);
                break;
            }
            case 2: {
                System.out.println("Enter Your Adhar Card Number :");
                BigInteger adhar = sc.nextBigInteger();
                k.apply_KYC(adhar);
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected value: " + n);
        }
    }

}
