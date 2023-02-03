public class chapter2_q4 {
	public static void main(String[]args) {

	Sum ans1=new Sum(2,3);
	int sum=ans1.sum();
    System.out.println(sum);

    Minus ans2=new Minus(3,2);
    int minus=ans2.minus();
    System.out.println(minus);
    
    Product ans3=new Product(3,2);
     int product=ans3.product();
    System.out.println(product);
    
    Round ans4=new Round(10,2);
    int round=ans4.round();
    System.out.println(round);
    
   }
}

class Sum{
	private int num1;
	private int num2;

	public Sum(int newNum1,int newNum2) {
		 num1=newNum1;
		 num2=newNum2;
	}

	  public int sum() {
		  return num1+num2;
	  }

}


class Minus{
	private int num3;
	private int num4;

	public Minus(int newNum3, int newNum4) {
		num3=newNum3;
		num4=newNum4;
	}

	public int minus() {
		return num3-num4;
	}
}

class Product{
	private int num5;
	private int num6;

	public Product(int newNum5, int newNum6){
		num5=newNum5;
		num6=newNum6;
	}

	public int product() {
		return num5*num6;
	}
}

class Round{
	private int num7;
	private int num8;
	
	public Round(int newNum7, int newNum8) {
		num7=newNum7;
		num8=newNum8;
	}
	
	public int round() {
		return num7/num8;
	}
}
