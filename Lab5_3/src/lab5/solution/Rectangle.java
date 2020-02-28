package lab5.solution;

public final class Rectangle implements IShape{

	private final double width;
	
	private final double length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		return width * length;
	}
}