import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number ");
		num=sc.nextInt();
		
		System.out.println("Binary is: "+Integer.toBinaryString(num));
		System.out.println("Octal is: "+Integer.toOctalString(num));
		System.out.println("Hexadecimal is: "+Integer.toHexString(num));
		sc.close();
		
	}

}
