package oopsdemo2;

public class Account //base class for saving account
{
	int accno;
	String name;
	public Account(int accno, String name) {
		this.accno = accno;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("****************************************Account Details*******************************************");
		System.out.println("account no="+accno);
		System.out.println("Customer name ="+name);
		
	}
}
	
 class saveings_bank extends Account
	{int min_balance,balance;

	public saveings_bank(int accno, String name,int mb,int b)
	{
		super(accno, name);
	this.min_balance=mb;
	this.balance=b;
	}
	void display()
    {
            super.display();
            System.out.println ("Minimum Balance: "+min_balance);
            System.out.println ("Saving Balance: "+balance);
    
	}
}
	
	

