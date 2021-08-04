package Java_New_Feautures;

import java.time.LocalDate;

interface my_Interface
{public void square(int a);
	
default void  dispaly(String a)
{System.out.println("Hello"+a);
	}
static void print()
{System.out.println("Today date"+LocalDate.now());
	}
}
 class Defaultmeathod implements my_Interface
{

	@Override
	public void square(int a) {
		System.out.println("The square of number");
		
	}
	}

public class DefaultMeathodDemo {

	public static void main(String[] args) {
		Defaultmeathod d1= new Defaultmeathod();
		d1.square(5);
		//default meathod 
		
		d1.dispaly("word");
		my_Interface.print();
		

	}

}
