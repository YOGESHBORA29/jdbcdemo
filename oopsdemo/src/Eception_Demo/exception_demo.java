package Eception_Demo;
// Genrel Exception handeling
public class exception_demo {

	public static void main(String[] args) {
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(languages[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
finally
{
	System.out.println("FINALLY BLOCK");}
	}

}
