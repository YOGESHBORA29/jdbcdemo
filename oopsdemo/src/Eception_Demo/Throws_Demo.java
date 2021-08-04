package Eception_Demo;

public class Throws_Demo {
	void Division()
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);      
  }

	public static void main(String[] args)
	{
		 Throws_Demo T = new Throws_Demo();
         try
         {
             T.Division();
         }
         catch(ArithmeticException Ex)
         {
             System.out.print("\n\tError : " + Ex.getMessage());
         }
         System.out.print("\n\tEnd of program.");

	}

}
