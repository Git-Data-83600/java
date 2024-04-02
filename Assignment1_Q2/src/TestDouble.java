import java.util.Scanner;

public class TestDouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2,avg;
		System.out.println("Enter your 1st number: ");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			System.out.println("Enter your 2nd number: ");
			if(sc.hasNextDouble())
			{
				num2=sc.nextDouble();
				avg=(num1+num2)/2;
				System.out.println("The avarage is: "+avg);
			}
			else
			{
				System.out.println("Num2 is not double");
			}
		}
		else
		{
			System.out.println("Num1 is not doubled");
		}
		
		
	}
}
		
		

