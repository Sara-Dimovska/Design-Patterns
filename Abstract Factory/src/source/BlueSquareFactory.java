package source;

public class BlueSquareFactory implements ColorShapeFactory{

	@Override
	public Shape getShape() {
		
		return new Square();
	}

	@Override
	public Color getColor() {
		
		return new Blue();
	}

}
