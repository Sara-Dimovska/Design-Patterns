package source;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		ColorShapeFactory colorShape = new RedCircleFactory();
		Shape circle = colorShape.getShape();
		Color red = colorShape.getColor();
		
		circle.draw();
		red.fill();
	}

}
