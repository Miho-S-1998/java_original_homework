public class chapter2_q5 {
	public static void main(String[]args) {

   Point p1=new Point(0,5);
   Point p2=new Point(4,2);
   System.out.println(toFriend(p1,p2));

  }

	public static  double toFriend(Point p1, Point p2) {
		return Math.sqrt(p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
	}
}
class Point{
	public int x;
	public int y;

	public Point(int num1, int num2) {
		this.x=num1;
		this.y=num2;
	}
}


