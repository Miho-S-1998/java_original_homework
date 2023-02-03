public class chapter1_q2 {

	public static void main(String[]args) {

    int[] arr1=new int[]{0,1,2,3,4,5,6,7,8,9};
    int[] arr2=new int[10];

    for(int i=0;i<arr1.length;i++) {
    	arr2[i]=arr1[9-i];
    System.out.println(arr2[i]);
    }
   }
}


