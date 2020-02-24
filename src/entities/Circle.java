package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	
	@Override
	public double area() {
		return 0;
	}

}
