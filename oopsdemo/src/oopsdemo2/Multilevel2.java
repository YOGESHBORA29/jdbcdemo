package oopsdemo2;


class staff
{int empid;
String Name;
float salary,hra;
public staff(int empid, String name, float salary) {
	this.empid = empid;
	Name = name;
	this.salary = salary;
}
void getHRA()
{
	hra=(salary*60)/100;
	System.out.println("HRA="+hra);
	
}
void display()
{
	System.out.println(empid+""+ Name+""+ salary);
}
}
class manager extends staff
{float DA;

	public manager(int empid, String name, float salary) {
		super(empid, name, salary);
	}
	void getDA()
	{
		DA=(salary*80)/100;
		System.out.println("DA:"+DA);
		
	}
	
		
		
	}
class director extends manager
{float gross;
float TA;

	public director(int empid, String name, float salary)
	{
		super(empid, name, salary);
	}
	void getTA()
	{
		TA=(salary*30)/100;
		System.out.println("TA:"+TA);
		
	}
	void getgross()
	{
		gross=salary+hra+DA+TA;
		System.out.println("GROSS"+gross);
		
	}
	public void TA() {
		// TODO Auto-generated method stub
		
	}
	}

	






public class Multilevel2 {

	public static void main(String[] args)
	{// for the derector
		director d=new director (101,"yogesh",50000);
		d.display();
		d.getHRA();
		d.getTA();
		d.getDA();
		d.getgross();
		
	}

}
