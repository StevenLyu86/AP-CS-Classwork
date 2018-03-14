
import java.util.Random;

abstract class Shapes {
	public abstract double getPerimeter();
	public abstract double area();
		
	public static void main(String[] args) {
		Random rng=new Random();
		Circle c=new Circle(rng.nextInt(100));
		Rectangle r=new Rectangle(rng.nextInt(100),rng.nextInt(100));
		Triangle t=new Triangle(rng.nextInt(100),rng.nextInt(100),rng.nextInt(100));
		System.out.println(c.area()+c.getPerimeter());
		System.out.println(r.area()+r.getPerimeter());
		System.out.println(t.area()+t.getPerimeter());
	}
}
