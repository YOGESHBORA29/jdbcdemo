package OOPSDEMO3;

public class Shape_test {

	public static void main(String[] args) {
		Circle c= new Circle(55);
		c.draw();
		System.out.println("AREA OF CIRCLE="+c.getarea());
		System.out.println("RADIUS="+c.getRadius());
		Shape r=new Rectangle(5,6);
		r.draw();
		System.out.println("area"+r.getarea());

	}

}
