package A;
public class HDFC extends Bank
{
    public String CurrentAccount(float a)
    {   if(a>40000){
        return "You Can Create Current Account in HDFC";
        }else
        return "You cant create Current Account in HDFC due to anual package limit";
    }
    
    public String SavingAccount()
    {
        return "You Can Create Saving Account HDFC";
    }
    
    public void Loan()
    {
        System.out.println("Take Loan From HDFC");
    }
}