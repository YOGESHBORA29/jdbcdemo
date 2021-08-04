class Test
{ 
	public void finalize()
	{
	System.out.println("OBJECT DISTROY ");
	}
	}
public class Distructor_Demo {

	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t2=new Test();
		t1=null;
		t2=null;
		System.gc();//invoed finalized method
		System.out.println("MAIN MEATHOD");

	}

}
