package A;
public class ICICI extends Bank
{
    public String CurrentAccount(float a)
    {   if(a>450000){
        return "You Can Create Current Account in ICICI";
        }
        else
        {
        return "You cant create Current Account in ICICI due to anual package limit";
        }
    }
    
    public String SavingAccount()
    {
        return "You Can Create Saving Account in ICICI";
    }
    
    public void Loan()
    {
        System.out.println("Take Loan From ICICI Bank");
    }
    
}