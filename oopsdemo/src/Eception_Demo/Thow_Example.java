package Eception_Demo;

public class Thow_Example {

public static void checkeligibality (int age,int weight)
{
	if (age<12 && weight<44)
	{throw new ArithmeticException("NOT ELIGIBLE");
	}
   else 
	{System.out.println("Student age"+age+"Student name"+weight);
	}

}

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	System.out.println("Student sports registration ");
	 checkeligibality(20,40);
	 System.out.println("Thnk you");
	 checkeligibality(1,2);

	}
}

