import java.util.Scanner;

//program for the constructurs


class person
{int age;
String name,consistency;
Scanner s;
	person()
	{
		age=0;
		name="";
		consistency="delhi";
		s=new Scanner(System.in);
		
	}
	public person(int age, String name) {
		this.age = age;
		this.name = name;
		consistency ="goa";
	}
	void input()
	{
		System.out.println("enter the name ");
		name=s.nextLine();
		System.out.println("ENTER THE AGE");
		age=s.nextInt();
	}
	void print()
	{
		System.out.println("Name ="+name);
		System.out.println("AGE="+age);
		System.out.println("consistancy"+consistency);
	}
	

	
	}
public class PersonTest {
PersonTest()
{
	}
	public static void main(String[] args) {
		person p=new person();
		p.input();
		p.print();
		System.out.println("--------------------------------------------------------------");
		person p1=new person(20,"mike");
		p1.print();

	}

}
