package OOPSDEMO3;

public class Rectangle implements Shape {
double length;
double breath;

	public Rectangle(double length, double breath) {
	this.length = length;
	this.breath = breath;
}

	@Override
	public void draw() {
		System.out.println("DRAW RECTANGLE");
		
	}

	@Override
	public double getarea() {
		
		return (this.length*this.breath);
	}

}
