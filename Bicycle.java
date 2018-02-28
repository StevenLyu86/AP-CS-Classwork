
public class Bicycle {
	private double mass;
	private int color;
	private int type;
	private int condition;
	private boolean bell;
	public Bicycle() {
		mass=10;
		color=0;
		type=0;
		condition=2;
	}
	public Bicycle(double m,int c,int t,int con) {
		this.mass=m;
		this.color=c;
		this.type=t;
		this.condition=con;
	}
	public String color() {
		if(color==0)
			return "Yellow";
		if(color==1)
			return "Blue";
		if(color==2)
			return "Red";
		if(color==3)
			return "Green";
		return "Black";
	}
	public String type() {
		if(type==0)
			return "OFO";
		if(type==1)
			return "Mobike";
		return "Own Bicycle";
	}
	public String condition() {
		if(condition==0)
			return "Bad Condition";
		if(condition==1)
			return "Silght Bad Condition";
		return "Good Condition";
	}
	public String bell() {
		if(bell==false)
			return "No Bell";
		return "Have a Bell";
	}
	public double getmass() {
		return mass;
	}
}
