package area.total;

class Square extends RectAngle{
	public Square(int width) {
	super(width);
	}
	
	public int getArea() {
		return width*width;
	}
}
