package oopsdemo2;
class bank 
{
	int getrateofintrest()
	{return(0);
	}
}
	class SBI extends bank
	{ int getrateofintrest()//method overloading in sub class
		{
		return(5);
		}
	}
	class ICIC extends bank 
	{ int getrateofintrest()//method overloading in sub class
	{
	return(10);
	}
	}
		
	
	
	
public class Override_Demo {

	public static void main(String[] args) {
SBI S= new SBI(); 
ICIC c=new ICIC();
System.out.println("RATE OF INTREST sbi"+S.getrateofintrest());
System.out.println("RATE OF INTREST icic"+c.getrateofintrest());
	}

}
	
