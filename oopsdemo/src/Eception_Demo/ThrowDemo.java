package Eception_Demo;

public class ThrowDemo {

		public static void hello (int a)
		{
			if(a==0)
			{
				throw new AirthmaticException("e");
			}
			else
				System.out.println(a);
		}
	}
public static void main(String[] args) {
	hello(100);

}
