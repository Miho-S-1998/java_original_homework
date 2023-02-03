public class chapter1_q4 {
	public static void main(String[]args) {
	
	int[]number=new int[101];
		
	for(int i=1;i<=100;i++) {
		number[i]+=i;
		if(number[i]%2==0) {
			System.out.println(number[i]);
		}
		
	}
	
	}
}
