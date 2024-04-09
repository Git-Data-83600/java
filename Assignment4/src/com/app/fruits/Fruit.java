package com.app.fruits;

public class Fruit {
	private double weight;
	private String color;
	private boolean isfresh;
	private String name;

	public Fruit() {
		super();
	}

	public Fruit(double weight, String color, boolean isfresh, String name) {
		super();
		this.weight = weight;
		this.color = color;
		this.isfresh = isfresh;
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isIsfresh() {
		return isfresh;
	}

	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [weight=" + weight + ", color=" + color + ", isfresh=" + isfresh + ", name=" + name + "]";
	}

	public String taste() {
		return "no specific taste";
	}
}
