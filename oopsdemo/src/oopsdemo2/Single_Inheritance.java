package oopsdemo2;

public class Single_Inheritance {

	public static void main(String[] args) {
		Developer d1=new Developer(22,"RAHUL","Framewoek");
		d1.display();
		d1.display1();
		
		//we are calling accountante class;
		//**********************************************************************************************************
		Accountant a=new Accountant(56,"yogesh","codeing","Framewoek");
		a.display();
		a.display3();

	}

}
