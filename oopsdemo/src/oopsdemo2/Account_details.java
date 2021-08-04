package oopsdemo2;

public class Account_details extends  saveings_bank {
int withdraw,deposite;

public Account_details(int accno, String name, int mb, int b, int withdraw, int deposite) {
	super(accno, name, mb, b);
	this.withdraw = withdraw;
	this.deposite = deposite;
}
void display()
{
        super.display();
        System.out.println ("Deposit: "+deposite);
        System.out.println ("Withdrawals: "+withdraw);
}
}
