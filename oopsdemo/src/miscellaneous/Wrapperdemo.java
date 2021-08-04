package miscellaneous;

public class Wrapperdemo {

	public static void main(String[] args) {
		//creating primiting data type
		int a=10;
		float b=20.5f;
//converted into the warper object
	//	Integer i=new Integer(a);
		Integer i=a;//auto boxing
		Float f=b;
		
		
		
		// wrapper class object
		Integer x=Integer.valueOf(20);
		Double y=Double.valueOf(2000000.0);
		
		//converted to primitive
		int p=x.intValue();
		Double q=y.doubleValue();
		
		System.out.println("p"+p+"q"+q);
		
		
		char e='a';//boxing
		Character obj =e;
		
		System.out.println(obj);
		System.out.println(Character.isUpperCase(e));
		
		double d=2000;
		Double obj1=d;
		System.out.println(obj1);
		System.out.println(Double.hashCode(obj1));
		System.out.println();
		
		
		
		
		
	}

}
