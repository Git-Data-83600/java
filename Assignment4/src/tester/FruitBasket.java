package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket
{

	public static void main(String[] args)
	{
		
		
		int ch,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the basket");
		ch=sc.nextInt();
		int index=0;
		Fruit basket[]=new Fruit[ch];
		do
		{
		System.out.println("0.EXIT  1.ADD MANGO  2.ADD ORANGE  3.ADD APPLE  4.DISPLAY NAMES OF ALL FRUITS IN THE BASKET");
		System.out.println("5.DISPLAY FRESH FRUITS  6.DISPLAY TASTE OF ALL STALE FRUITS  7.MARK A FRUIT AS STALE  8.MARKS ALL SOUR FRUIT AS STALE");
		System.out.println("enter choice");
		choice=sc.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("thanks");
			break;
			
        case 1://add mango
        {
        	if(index<ch)
        	{
        		basket[index]=new Mango(2, "yellow", "MANGO");
        		index++;
        	}
        	else
        		System.out.println("basket is full");
        }
			break;
			
		case 2:
	       {
	        	if(index<ch)
	        	{
	        		basket[index]=new Orange(1, "orange", "ORANGE");
	        		index++;
	        	}
	        	else
	        		System.out.println("basket is full");
	        }
			break;
	
		case 3:
	    {
        	if(index<ch)
        	{
        		basket[index]=new Apple(4, "red", "APPLE");
        		index++;
        	}
        	else
        		System.out.println("basket is full");
        }
			break;
			
		case 4:
		{
			for (int i = 0; i < index; i++) 
			{
				System.out.println("NAME  : "+basket[i].getName());
				
				System.out.println("******************************");
			}
		}
			break;
			
			
		case 5:
			
		{
			for (int i = 0; i < index; i++)
			{
				if(basket[i].isIsfresh()==true)
				{
					System.out.println("name : "+basket[i].getName()+"   color : "+basket[i].getColor()+"   weight : "+basket[i].getWeight());
					 
//					if(basket[i].isIsfresh())
//						System.out.println("Fruit is fresh");
				}
			}
		}
			break;
			
			
		case 6:
		{
			for (int i = 0; i < index; i++)
			{
				if(basket[i].isIsfresh()==false)
				{
					System.out.println("name : "+basket[i].getName()+"  taste :"+basket[i].taste());
				}
			}
		}
			break;
			
			
		case 7:
		{
			System.out.println("enter the index");
			int ix=sc.nextInt();
			if(ix<index)
			{
					basket[ix].setIsfresh(false);
			}
		}
			break;
			
			
		case 8:
		{
			for (int i = 0; i < index; i++)
			{
				if(basket[i].taste()=="sour")
				{
					basket[i].setIsfresh(false);
				}
			}
		}
			break;

		default:
			System.out.println("enter a valid choice");
			break;
		}
		}while(choice!=0);
	}

}