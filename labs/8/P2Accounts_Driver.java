package lab3;
import java.util.Scanner;
public class P2Accounts_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the amount you want to deposit for opening"
				+ " the Checking Account:");
		double checkdeposit = input.nextDouble();
		P2CheckingAccount ca = new P2CheckingAccount(123,checkdeposit);
		System.out.println(ca.getCheckingbalance());
		System.out.println(ca.toString());
		System.out.println("Please Enter the amount you want to deposit for opening"
				+ " the Savings Account:");
		double savingdeposit = input.nextDouble();
		P2SavingsAccount sa = new P2SavingsAccount(121,savingdeposit);
		System.out.println(sa.getSavingsbalance());
		System.out.println(sa.toString());
		boolean flag = true;
		do {
		System.out.println("Please enter the amount you want to withdraw from your Savings account");
		double savingwithdraw = input.nextDouble();
		sa.withdraw(savingwithdraw);
		}
		while(flag!=false);
	}

}
