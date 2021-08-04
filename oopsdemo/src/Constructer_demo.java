
public class Constructer_demo {
	int id;
	float salary;
	String name;
	Constructer_demo()   //empicit constructur
	{
		System.out.println("I am default constructer");
		id=0;
		name="";
		salary=5000.00f;
		
		
	}
	void display()
	{
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) {
	Constructer_demo c=new Constructer_demo();// invoke emlicite constructer
	Constructer_demo c1=new Constructer_demo();
	Constructer_demo c2=new Constructer_demo();
	c.display();

	}

}
