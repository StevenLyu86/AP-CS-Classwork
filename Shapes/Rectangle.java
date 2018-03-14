
public class Rectangle extends Shapes{

	private double length,width;
	
	public Rectangle(double l,double w) {
		this.length=l;
		this.width=w;
	}
	
	public String toString() {
		return "\nlength: "+length+"\nwidth: "+width;
	}
	public boolean equals(Rectangle r) {
		return this.length==r.length&&this.width==r.width;
	}
	
	public double area() {
		return this.length*this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
}
