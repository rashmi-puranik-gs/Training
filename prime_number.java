public class prime_number{
    public static void checkPrime(int n){
        int i,j=0, count=0;
     
        if(n==0 ||n==1)
        {
            System.out.println(n+" " +"is not prime number");
        }
        else{
            for(i=2;i<j;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+ " " +"is not prime number");
                    count++;
                    break;
                }
            }
        if (count==0)
        {
            System.out.println(n+" " +"is prime number");
        }
        }
    }
    public static void main(String args[]){
        
        checkPrime(2);
        checkPrime(3);
        checkPrime(20);
    }
    }
