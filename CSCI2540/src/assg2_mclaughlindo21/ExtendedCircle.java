package assg2_mclaughlindo21;

public class ExtendedCircle extends Point {
	
	private double radius;
	private Point center;
	
	//Constructors
	ExtendedCircle(){
		this.radius = 1;
		this.center = new Point(0,0);
	}
	
	ExtendedCircle(double radius){
		this.radius = radius;
		this.center = new Point(0,0);
	}
	
	ExtendedCircle(double radius, Point center){
		this.radius = radius;
		this.center = center;
	}
	// get/set
	public double getRadius() {
		return this.radius;
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public void setCenter(Point newCenter) {
		this.center = newCenter;
	}
	public double compArea() {
		return Math.PI * radius * radius;
	}
	
	//compCircumference()
	public double compCircumference() {
		return 2*Math.PI*radius;
	}
	//toString()
	public String toString() {
		return "Radius: " + this.radius + "\n" +  "Center: " + this.center;
	}
	//positionToCircle()
	public int positionToCircle(Point pt) {
		
		
		if(pt.getX() < this.radius) {
			return -1;
		}else if(pt.getX() == this.radius) {
			return 0;
		}else {
			return 1;
		}
		
	}
	//Shift()
	
	ExtendedCircle shift(int paramX,int paramY) {
		
		return new ExtendedCircle(this.radius, new Point(center.getX() + paramX, center.getY() + paramY));
		
	}
	
	//Scale()
	ExtendedCircle scale(double scaleFactor) {
		
		return new ExtendedCircle(this.radius * scaleFactor);
		
	}
	//overlap()
	boolean overalap(ExtendedCircle temp) {
		
		double value = center.distance(temp);
		double sum = this.radius + temp.radius;
		
		System.out.println(sum);
		
		return (value < sum) ?  true :  false;
	}
	
	//equals()
	public boolean equals(Object other) {		
		  if (other == this) {
	            return true;
	        }
	        if (other == null || other.getClass() != this.getClass()) {
	            return false;
	        }
	        
	       if(other instanceof ExtendedCircle) {
	    	   ExtendedCircle test = (ExtendedCircle) other;
	    	   if(test.radius == this.radius && test.center == this.center) {
	    		   return true;
	    	   }
	       }
	       
	       return false;
	}
	/*	Testing REMOVE	*/
	public void printInfo() {
		System.out.println(this.radius + " " + this.center);
	}
	
	
}
