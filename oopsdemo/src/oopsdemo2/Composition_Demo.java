package oopsdemo2;
class Honda extends CAR 
{public void hondaStart()
	{
	Engin e=new Engin();
	e. Startengin();
	}
	}

public class Composition_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h =new Honda();
		h.setColour("black");
		h.setMax(60);
	System.out.println("**************************************************************HONDA DEATAILS*******************************");
System.out.println("COLOUR"+h.getColour());
System.out.println("speed"+h.getMax());
	}

}
