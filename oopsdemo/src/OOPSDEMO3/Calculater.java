package OOPSDEMO3;

import java.util.Scanner;

public class Calculater implements Imaths {
Scanner sc;
	@Override
	public void add() {
		sc = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a-b;
        System.out.println("Sub of "+a+" and "+b+" is "+s);
	}

	@Override
	public void mul() {
		sc = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a*b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		sc = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a/b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}
     void display()
{System.out.println("calculater design by yogesh");
	}
	public static void main(String[] args) {
		Calculater c =new Calculater();
		c.display();
		c.add();
		c.div();
		c.sub();
		c.mul();

	}

}
