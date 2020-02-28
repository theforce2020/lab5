package lab5.solution;

public final class Circle implements IShape {

	private final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return 3.14 * radius * radius;
	}
}