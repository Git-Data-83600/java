package com.app.fruits;

public class Orange extends Fruit
{
	@Override
	public String taste() 
	{
		return "sour";
	}

	public Orange(double weight, String color, String name) 
	{
		super(weight,color,true,name);
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}
}