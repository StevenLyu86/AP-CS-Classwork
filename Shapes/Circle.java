public class Circle extends Shapes{
	private double radius;
	public Circle(double r) {
		this.radius=r;
	}
	
	public boolean equals(Circle c) {
		return this.radius==c.radius;		
	}
	
	public String toString() {
		return ""+radius;
	}
	
	public double area(){
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	public double getPerimeter() {
		return Math.PI*this.radius*2;
	}
}
