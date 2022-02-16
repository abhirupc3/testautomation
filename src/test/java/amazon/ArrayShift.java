package amazon;

public class ArrayShift {
 public static void main(String[] args) {
	char[] c = {'A','b','c','d','e','f'};
	System.out.println("Before");
	for (char c1 : c) {
		System.out.print(c1 +"  ");
		
	}
	System.out.println("After");
	leftShift(2,c);
	
	
}
 public static void leftShift(int shift, char[] num)
 {
	
	char[] n1 =  reverse(0,shift-1, num);
	char[] n2 =  reverse(shift,num.length-1, n1);
	char[] n3 =  reverse(0,num.length-1, n1);
	for (char c : n3) {
		System.out.print(c+ "  ");
		
	}
 }
 public static char[] reverse(int p,int q, char[] num)
 {
	 while(p<q)
	 {
		 int temp=num[p];
		 num[p]=num[q];
		 num[q]=(char)temp;
		 p++;q--;
	 }
	 return num;
 }
}
