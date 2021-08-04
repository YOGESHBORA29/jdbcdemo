package OOPSDEMO3;

public class Circle implements Shape {
double radius;

	public Circle(double radius) {
	this.radius = radius;
}

	public void draw()
	{
		System.out.println("Draw circle");

	}

	@Override
	public double getarea() {
		return(Math.PI*this.radius);
		
	}

	public double getRadius() {
		return radius;
	}
	

}
