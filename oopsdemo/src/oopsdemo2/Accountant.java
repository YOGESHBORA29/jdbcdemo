package oopsdemo2;

public class Accountant extends Emplyee {
	String task,tech;
	
	public Accountant(int id,String name,String t1,String t2)
	{super(id,name);
	this.task=t1;
	this.tech=t2;
	
		
		
	}
	void display3()
	{
		System.out.println("Accountant task"+this.task);
		System.out.println("Accountant software"+this.tech);
	}

}
