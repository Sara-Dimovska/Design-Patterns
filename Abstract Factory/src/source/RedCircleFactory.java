package source;

public class RedCircleFactory implements ColorShapeFactory{

	@Override
	public Shape getShape() {
		
		return new Circle();
	}

	@Override
	public Color getColor() {
		
		return new Red();
	}

}
