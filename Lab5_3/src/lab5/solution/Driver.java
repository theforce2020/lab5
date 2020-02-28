package lab5.solution;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<IShape> shapes = new ArrayList<>();
		shapes.add(new Triangle(3, 4));
		shapes.add(new Triangle(2, 3));
		shapes.add(new Triangle(3, 6));
		
		shapes.add(new Rectangle(3, 4));
		shapes.add(new Rectangle(2, 3));
		shapes.add(new Rectangle(3, 5));

		shapes.add(new Circle(10));
		shapes.add(new Circle(2));
		shapes.add(new Circle(5));
		
		double sumOfAreas = 0;
		
		for (IShape shape : shapes) {
			sumOfAreas += shape.computeArea();
		}
		System.out.print("Sum of Areas = " + sumOfAreas);
	}
}