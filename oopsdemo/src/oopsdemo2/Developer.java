package oopsdemo2;

public class Developer extends Emplyee  {
String technology;
public Developer(int id,String name,String tech)
{super(id,name);
technology =tech;
	}

void display1()
{
	System.out.println("TECHNOLOGY"+technology);
	}

}
