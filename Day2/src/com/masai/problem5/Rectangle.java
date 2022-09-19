package com.masai.problem5;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle(double widthOfRectangle, double lengthOfRectangle) {
		
		if(widthOfRectangle<0 && widthOfRectangle<0) {
			this.width=0;
			this.length=0;
		}
	    else if(widthOfRectangle<0) {
			this.width=0;
			this.length=lengthOfRectangle;
			
		}
		else if(lengthOfRectangle<0) {
			this.length=0;
			this.width=widthOfRectangle;
		}
		else {
			this.width=widthOfRectangle;
			this.length=lengthOfRectangle;
		}
		
     	
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	 
	public double getArea() {
		return this.length*this.width;
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5,5);
		System.out.println(rectangle.getArea());
	}
}
