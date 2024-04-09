package com.app.fruits;

public class Apple extends Fruit{

    @Override
	public String taste() 
	{
		return "sweet n sour";
	}

	public Apple(double weight, String color, String name) 
	{
		super(weight,color,true,name);
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}
}
