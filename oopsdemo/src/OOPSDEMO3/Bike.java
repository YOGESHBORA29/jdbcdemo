package OOPSDEMO3;
/*The major use of abstract classes and methods is to achieve abstraction in Java.

Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary
details and only show the needed information. */
public abstract class Bike {
Bike()
{System.out.println("BIKE is created");
	}
abstract void run();
void changeGear()
{System.out.println("gear change");
	}

}
class Honda extends Bike
{

	@Override
	void run() {
		System.out.println("honda bike is RUNING BIKE");
		
	}
	
	
	}
