package oopsdemo2;
class Doctor
{int idnum;
String name;
String address;
public Doctor(int idnum, String name, String address) {
	this.idnum = idnum;
	this.name = name;
	this.address = address;
}
void display() {
    System.out.println("********* Doctor Details ***********");
        System.out.println("The name is :" + name);
        System.out.println("The number is :" + idnum);
        System.out.println("The address is :" + address);
    }
}
class specialist extends Doctor
{
String speciality;
	public specialist(int idnum, String name, String address,String sp) {
		super(idnum, name, address);
		speciality=sp;
	
	}
	void display() {
	    super.display(); // call base class method
	    System.out.println("The speciality is :" + speciality);
	    }
	
}

class non_specialist extends Doctor
{

	public non_specialist(int idnum, String name, String address) {
		super(idnum, name, address);//invoke base class constructor
	
	}
	}


public class TestDoctor {

	public static void main(String[] args) {
		specialist s=new specialist(100,"marry","new york","cardiyologist");//invoke chile class
		s.display();
		System.out.println("********************************************************************************************************");
		non_specialist s1=new non_specialist(584,"yogesh","delhi");
		s1.display();
	

	}

}
