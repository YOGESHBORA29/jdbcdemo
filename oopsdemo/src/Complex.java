
public class Complex {
	double image;
	double real;
	void complex(double r,double i)
	{
		image=r;
		real=i;
		
	}
	void add_complex(Complex obj)
	{this.image+=obj.image;
	this.real+=obj.real;
		
	}
	void Display()
	{
		System.out.println("image="+this.image+"real"+this.real);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex c=new Complex();
		Complex c1=new Complex();

	}
	}



