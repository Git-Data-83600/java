package com.app.fruits;

public class Mango extends Fruit 
{
	@Override
	public String taste() 
	{
		return "sweet";
	}

	public Mango(double weight, String color, String name) 
	{
		super(weight,color,true,name);
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}
}