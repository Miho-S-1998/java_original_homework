public class chapter2_q3 {
	public static void main(String[]args) {
		
		int answer_1=sum(2,3);
		int answer_2 =round(2,3);
		int answer_3=product(2,3);
		int answer_4=minus(2,3);
		
		System.out.println(answer_1);
		System.out.println(answer_2);
		System.out.println(answer_3);
		System.out.println(answer_4);
		
	}
	
	public static int sum(int a,int b) {
		int total=a+b;
		return total;
	}
	
	public static int round(int a,int b) {
		int total=a/b;
		return total;
	}
	
	public static int product(int a,int b) {
		int total=a*b;
		return total;
	}
	
	public static int minus(int a,int b) {
		int total=a-b;
		return total;
	}

}
