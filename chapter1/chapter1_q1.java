public class chapter1_q1 {
	public static void main(String[]args) {

		String str1;
		String str2;
		
		str1="100";
		str2="200";
		
		System.out.println("str1="+str1+" "+"str2="+str2);
		
		System.out.println("");
		
        String str3=str2;
               str2=str1;
               str2=str3;
        
		System.out.println("str1="+str3+" "+"str2="+str1);

	}

}
