package assg2_mclaughlindo21;

public class Point {
	private int x;
	private int y;
	
	//Constructors
	
	/**
	 * Class Constructor
	 * Default Constructor
	 */
	Point(){
		x = 0;
		y = 0;
	}
	/**
	 * Class Constructor
	 * @param x, y
	 */
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// get/set methods
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	//toString()
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	//distance()
	public double distance(Point otherPt) {
		
		return Math.hypot(this.x - otherPt.x, this.y - otherPt.y);
	
	}
	//equals()
	public boolean equals(Object other) {		
		  if (other == this) {
	            return true;
	        }
	        if (other == null || other.getClass() != this.getClass()) {
	            return false;
	        }
	        
	       if(other instanceof Point) {
	    	   Point test = (Point) other;
	    	   if(test.x == this.x && test.y == this.y) {
	    		   return true;
	    	   }
	       }
	       
	       return false;
	}
	
	/*	Testing	REMOVE */
	public void printInfo() {
		System.out.println(this.x + " " + this.y);
	}
}
