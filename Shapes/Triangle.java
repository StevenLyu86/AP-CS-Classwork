
public class Triangle extends Shapes{
	private double a,b,c;
	
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public boolean equals(Triangle t) {
		return this.a==t.a&&this.b==t.b&&this.c==t.c;
	}
	
	public String toString() {
		return "\na: "+a+"\nb: "+b+"\nc: "+c;
	}
	
	public double area() {
		double p=(this.a+this.b+this.c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public double getPerimeter() {
		return this.a+this.b+this.c;
	}

}
