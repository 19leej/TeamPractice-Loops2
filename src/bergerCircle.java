
public class bergerCircle {
	private double radius;
	public bergerCircle(){
	radius=0.0;
	}
	public bergerCircle(double xradius){
	radius=xradius;
	}
	public double getRadius(){
		return radius;
	}
	public double getCircumference(){
		return (2.0*3.14*radius);
	}
	public double getArea(){
		return (3.14*Math.pow(radius,2.0));
	}
	public void setRadius(double enteredRadius){
		radius=enteredRadius;
}
}