package OOPSDEMO3;

public class Employee_Main {

	public static void main(String[] args) {
		Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
	       double payTotal = mgrObj.Totalpay();
	       double less = mgrObj.deduction(5);
	       double netPay = payTotal - less;
	       System.out.println("\nManager Details");
	       System.out.println("===================================");
	       mgrObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);

	       Directer dirObj = new Directer("Stephen", 32400.00, "New York",8000);
	       payTotal = dirObj.Totalpay();
	       less = dirObj.deduction(5);
	       netPay = payTotal - less;
	       System.out.println("\n\nDirector Details");
	       System.out.println("============================");
	       dirObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);

	}

}
