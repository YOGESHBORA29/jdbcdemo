package oopsdemo2;

public class ADDITION {
	public void Add()
	{
		System.out.println("Meathod overloading");
	}
	public void Add(int a,int b)

	{
		System.out.println("ADDITION OF TWO NUMBER"+(a+b));
	}
	public void Add(float a,float b)
	{
		System.out.println("ADDITION OF TWO FLOAT NUMBER"+(a+b));
	}
	public void Add(int a,int b,int c)
	{
		System.out.println("ADDITION OF 3 NUMBER"+(a+b+c));
	}
	public void Add(String a,String b )
	{
		System.out.println("concatition of the string"+a+","+b);
	}

}
