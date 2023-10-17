package view;

import model.Shape;
import java.util.ArrayList;
import java.util.List;

public class Canvas {
	private List<Shape> shapes = new ArrayList<>();
	
	public void addSHape(Shape shape) {
		if(shape!=null)
			shapes.add(shape);
	}
	
	public void printShape() {
		for(Shape shape : shapes) {
			String s = String.format("Foema: %s - Área: %.2f", shape.name(), shape.area());
			System.out.println(s);
		}
	}
}
