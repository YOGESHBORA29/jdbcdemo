package Eception_Demo;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello world";
		String str2=null;
		try
		{
		System.out.println(str1.length());
		System.out.println(str2.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			
		}
		finally
		{
			System.out.println("Finally block");
		}
		

	}

}
