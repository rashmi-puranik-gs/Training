public class duplicate_element {
    public static boolean check(String s)
    {
       for (int i = 0;i<s.length();i++)
       {
            for(int j = i+1 ;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                   //System.out.println("There are dublicate elements");
                   return true;
                }
            }
        }
        //System.out.println("There are not dublicate elements");
        return false;
    }
    
    public static void main(String args[])
    {
        String s = "Laboratory";
        System.out.println(s + " "+check(s));
        s = "Gslab";
        System.out.println(s + " "+check(s));
    }
}




