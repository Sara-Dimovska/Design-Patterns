package source;

public class GreenRectangleFactory implements ColorShapeFactory{

	@Override
	public Shape getShape() {
		return new Rectangle();
	}

	@Override
	public Color getColor() {
		return new Green();
	}

}
