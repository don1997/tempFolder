package assg2_mclaughlindo21;

public class ExtendedCircleTest {

	public static void main(String[] args) {

		Point alpha = new Point(3,3);
		Point beta = new Point(5,5);
		
		System.out.println(alpha.toString());
		System.out.println(beta.toString());

		alpha.printInfo();
		beta.printInfo();
		
		System.out.println(alpha.equals(beta));

		System.out.println(alpha.distance(beta));
		
		ExtendedCircle delta = new ExtendedCircle(3);
		
		System.out.println(delta.compArea());
		System.out.println(delta.compCircumference());

		System.out.println(delta.toString());
		
		Point test = new Point(3,3);
		
		System.out.println(delta.positionToCircle(test));
		
		
		ExtendedCircle temp;
		temp = delta.scale(2);
		System.out.println(temp.toString());
		
		Point gamma = new Point(6,6);
		
		ExtendedCircle epsilon = new ExtendedCircle(100, gamma);
		
		System.out.println(epsilon.toString());
		epsilon.printInfo();
		
		ExtendedCircle shifted = epsilon.shift(6, 6);
		shifted.printInfo();
		
		Point zeta = new Point(20,20);
		ExtendedCircle kilo = new ExtendedCircle(3, zeta);
		
		Point another = new Point(100,100);

		ExtendedCircle hotel = new ExtendedCircle(3, another);

		System.out.println(kilo.overalap(hotel));
		
		ExtendedCircle car = new ExtendedCircle(3, another);
		
		System.out.println(car.equals(hotel));
		
		//TEST ALL METHODS
		//AND ALL POSSIBLE RETURNS
		//NO USER INPUT
		//USE JAVADOC ONTOP OF EVERY FILE
	}

}
