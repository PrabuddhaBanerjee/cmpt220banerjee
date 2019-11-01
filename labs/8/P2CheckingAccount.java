package lab3;
import java.util.Date;
public class P2CheckingAccount extends P2Accounts
{
    private int checkingId;
    private double checkingBalance = 0;
    private Date dateCreated ;

    public P2CheckingAccount()
    {
      this.checkingId = 1;
      this.checkingBalance = 0.0;
      this.dateCreated = new Date();
    }
    P2CheckingAccount(int id, double balance){
      this.checkingId = id;
      this.checkingBalance = balance;
      this.dateCreated = new Date();
    }
    public int getCheckingId()
    {
        return this.checkingId;
    }
    public void setCheckingId(int i)
    {
        this.checkingId = i;
    }
    public double getCheckingbalance()
    {
        return this.checkingBalance;
    }
    public double setCheckingbalance(double bal)
    {
        return this.checkingBalance = bal;
    }
    @Override
    public Date getdateCreated()
    {
        return this.dateCreated;
    }
    @Override
    public String toString(){
      return "Your Checking account with id: "+getCheckingId()+" has balance "+getCheckingbalance()
                + " was created on"+ getdateCreated();
    }
    @Override
    public void deposit(double amt){
    	checkingBalance = getbalance() + amt;
      }
    @Override
      public void withdraw(double amt){
         checkingBalance = getbalance() - amt;
      }
}
