package area.total;

class RectAngle {
	public int height;
	public int width;
	
	public RectAngle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public RectAngle(int width) {
		this.width=width;
	}
	
	public int getArea() {
		return width*height;
	}
}
