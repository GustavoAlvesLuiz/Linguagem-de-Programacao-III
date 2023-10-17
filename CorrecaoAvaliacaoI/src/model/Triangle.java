package model;

public class Triangle implements Shape {
	private double width, heigth;

	public Triangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public String name() {
		return "Triângulo";
	}

	@Override
	public double area() {
		return (this.width * this.heigth)/2;
	}
	
	
	
	

}
