//package lab3;

import java.util.Date;
public class P2Accounts{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated ;
    
    public P2Accounts()
    {
        this.id = 1;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }
    public P2Accounts(int id, double balance, double annualInterestRate)
        {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = new Date();
        }
    public int getId()
    {
        return this.id;
    }
    public void setId(int i)
    {
        this.id = i;
    }
    public double getbalance()
    {
        return this.balance;
    }
    public double setbalance(double bal)
    {
        return this.balance = bal;
    }
    public double getannualInterestRate()
    {
        return this.annualInterestRate;
    }
    public double setannualInterestRate(double rate)
    {
        return this.annualInterestRate = rate;
    }
    public Date getdateCreated()
    {
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
       
       return getannualInterestRate()/12;
    }
    public double getMonthlyInterest(){
       
       return (getbalance()*getMonthlyInterestRate())/100;
    }
    public String toString(){
      return "Your account with id: "+getId()+" has balance "+getbalance()+
              " and annual Interest rate is "+getannualInterestRate()+ "was created on"+ getdateCreated();
    }
    public void deposit(double amt){
      balance = getbalance() + amt;
    }
    public void withdraw(double amt){
      if((getbalance()>0)&&(amt<getbalance()))
      balance = getbalance() - amt;
      else 
      System.out.println("You don't have sufficient amount in your account!!!");
    }
}
