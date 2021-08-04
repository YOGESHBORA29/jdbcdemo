package OOPSDEMO3;

public abstract class Employee {
	String Name ;
	double basic;
	String Address;
	public Employee(String name, double basic, String address) {
		Name = name;
		this.basic = basic;
		Address = address;
	}
	void show() {
        System.out.println("Name: \t\t\t" + Name);
        System.out.println("Address: \t\t" + Address);
        System.out.println("Basic: \t\t\t" + basic);
    }
	double deduction(int leave) {
	      double lessPay;
	 
	      if (leave <= 5) {
	         lessPay = (0.25 * basic);
	      } else {
	         lessPay = (0.5 * basic);
	      }
	      return lessPay;
	    }
	abstract double Totalpay();


}
