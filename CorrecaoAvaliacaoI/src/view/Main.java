package view;

import model.Circle;
import model.Rect;
import model.Square;
import model.Triangle;
import model.Shape;

public class Main {

	public static void main(String[] args) {
		Shape q1 = new Square(10);
		Shape r1 = new Rect(10, 5);
		Shape c1 = new Circle(3);
		Shape t1 = new Triangle(2, 5);

		Canvas c = new Canvas();
		c.addSHape(q1);
		c.addSHape(r1);
		c.addSHape(c1);
		c.addSHape(t1);
		
		c.printShape();
	}

}
