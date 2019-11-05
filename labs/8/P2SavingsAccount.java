//package lab3;
import java.util.Date;

public class P2SavingsAccount extends P2Accounts
{
    private int savingsId;
    private double savingsBalance = 0;
    private Date dateCreated ;
    
    P2SavingsAccount(){
      this.savingsId = 1;
      this.savingsBalance = 0.0;
      this.dateCreated = new Date();
       
    }
    P2SavingsAccount(int id, double balance){
      this.savingsId = id;
      this.savingsBalance = balance;
      this.dateCreated = new Date();
    }
    public int getSavingsId()
    {
        return this.savingsId;
    }
    public void setSavingsId(int i)
    {
        this.savingsId = i;
    }
    public double getSavingsbalance()
    {
        return this.savingsBalance;
    }
    public double setSavingsbalance(double bal)
    {
        return this.savingsBalance = bal;
    }
    @Override
    public Date getdateCreated()
    {
        return this.dateCreated;
    }
    @Override
    public String toString(){
      return "Your Savings account with id: "+getSavingsId()+" has balance "+getSavingsbalance()
                + " was created on"+ getdateCreated();
    }
    @Override
    public void deposit(double amt){
    	savingsBalance = getbalance() + amt;
      }
    @Override
      public void withdraw(double amt){
    	if((getSavingsbalance()>0)&&(amt<=getSavingsbalance())) {
          savingsBalance = getSavingsbalance() - amt;
          System.out.println("Now your balance is:"+getSavingsbalance()+" after withdrawing "+amt);
        }
        else 
            System.out.println("You don't have sufficient amount in your account!!!");
      }
}
