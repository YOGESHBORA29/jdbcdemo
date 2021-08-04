package oopsdemo2;

public class Student {
	int rollno;
	String name;
	Adress ad;//agggresgation has a raltionship
	public Student(int rollno, String name, address ad) {
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}
	void Display()
	{
		System.out.println("-----------------------STUDENT DETAILS--------------------------------------------");
		System.out.println("rollno"+rollno);
		System.out.println("name"+name);
		System.out.println("address"+ad);
	}
	

}
