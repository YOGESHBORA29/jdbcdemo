package Java_New_Feautures;
interface hello
{void welcome();
	}
public class MeathodReferanceDemo {
	public static void display()
	{
		System.out.println("hello from meathod referance");
	}
	public void print()
	{
		System.out.println("hello from meathod referance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello h=MeathodReferanceDemo::display;//invoke static 
h.welcome();


MeathodReferanceDemo d1=new  MeathodReferanceDemo();
hello h1=d1::print;
	}


}
