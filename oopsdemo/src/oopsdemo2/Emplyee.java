package oopsdemo2;

public class Emplyee {
	int id;
	String name ;
	public Emplyee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println("********************************Emplyee Details**************************************************");
		System.out.println("id "+id);
		System.out.println("name="+name);
	}

}
