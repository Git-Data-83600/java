package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPonintArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your counts of point");
		int index = sc.nextInt();
		Point2D[] points = new Point2D[index];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point2D();
			points[i].accept();
		}
		int choice;
		do {
			System.out.println("welcome...");
			System.out.println("0 for Exit");
			System.out.println("1 for specific display");
			System.out.println("2 for all display");
			System.out.println("3 for indices for the points & validate indices");
			System.out.println("Enter your choice ");

			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank You...!");
				break;

			case 1: {
				System.out.println("Enter specific index to show specific co-ordinate");
				int sp = sc.nextInt();
				if (sp > (index-1)) {
					System.out.println("Invalid index..!!");
				} else {
					System.out.println(points[sp].getDetails());
				}
			}
				break;

			case 2:
				System.out.println("All co-ordinate are ");
				for (int i = 0; i < points.length; i++) {

					System.out.println(points[i].getDetails());
				}
				break;

			case 3:
				int str,end;
				System.out.println("Enter the index of start point");
				str=sc.nextInt();
				
				if(str>=0 && str<index)
				{
					System.out.println("Enter the index of end point");
					end=sc.nextInt();
					if(end>=0 && end<index)
					{
					  if(points[str].isEqual(points[end]))	
					  {
						  System.out.println("points are same hence cannot find the distance");
					  }
					  else
					  {
						  System.out.println("points are not same");
						  points[str].calculateDistance(points[end]);
					  }
					}
					else
					{
						System.out.println("enter a valid index");
					}	
				}
				else
				{
					System.out.println("enter a valid index");
				}	
				break;
				

			default:
				System.out.println("invalid choice...!!");
			}
	
		}while(choice!=0);
	}
}
