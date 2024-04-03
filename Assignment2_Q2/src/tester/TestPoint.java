package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1=new Point2D();
		Point2D p2=new Point2D(3,4);
		
		System.out.println("co-ordinate 1st is: "+p1.getDetails());
		System.out.println("co-ordinate2nd is: "+p2.getDetails());
		System.out.println("co-ordinate is equal: "+p1.isEqual(p2));
		p1.calculateDistance(p2);
	}

}
