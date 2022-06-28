import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public void is_Strings_Are_Anagram()
    {
        System.out.print("Enter first String: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        System.out.print("Enter second String: ");
        String s2 = input.nextLine();
        
        if(s1.length() == s2.length()) 
        {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
      
            if(result)
            {
              System.out.println( "Strings are anagram.");
            }
            else
            {
              System.out.println( "Strings are not anagram.");
            }
          }
           
          else 
          {
            System.out.println( "strings are not anagram.");
          }
      
          input.close();
        }
    public static void main(String[] args)
    {
        anagram an = new anagram();
        an.is_Strings_Are_Anagram();
    }
}


    

