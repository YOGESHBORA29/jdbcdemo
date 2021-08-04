package OOPSDEMO3;

public class Directer extends Employee {
int Transportallowance;
	public Directer(String name, double basic, String address,int ta) {
		super(name, basic, address);
		this.Transportallowance=ta;
	
	}
	void show() {
        super.show();
        System.out.println("Transport Allowance: \t" + Transportallowance);
    }
	@Override
	double Totalpay() {
		
		double totalAmount = 0;
	       double houseRentAllowance = (basic * 0.20);
	       double dearnessAllowance = (basic * 0.5);
	       double medicalAllowance = 4500;
	       double entertainmentAllowance = 5000;
	       totalAmount = basic + houseRentAllowance + dearnessAllowance
	             + medicalAllowance + entertainmentAllowance +Transportallowance ;
	       return totalAmount;
	}
	

}
