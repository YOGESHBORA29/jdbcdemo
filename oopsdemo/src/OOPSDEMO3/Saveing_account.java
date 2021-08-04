package OOPSDEMO3;

public class Saveing_account extends Account
{double intrestrate;

public Saveing_account(String name, double balance, double intrestrate)
{
	super(name, balance);
	this.intrestrate = intrestrate;
}

}

  class checkingAccount extends Account
{double overDraft;

	public checkingAccount(String name, double balance,double od) {
		super(name, balance);
		this.overDraft=od;
	}

	@Override
	void withdraw(double amt) {
		super.withdraw(amt);
		System.out.println("Overdraft Amount: " + overDraft);
	       if (amt <= balance) {
	          balance -= amt;
	          System.out.println("Withdrawing: " + amt);
	        } else if ((amt > balance) && (amt > (balance + overDraft))) {
	           System.out.println("Sorry! You cannot withdraw");
	        } else {
	           double result = amt - balance;
	           overDraft -= result;
	           balance = 0;
	 
	           System.out.println("Withdrawing: " + amt);
	           System.out.println("Current Overdraft Amount: "
	           + overDraft);
	}
	
	}
}
