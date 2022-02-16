package newPreperation;

public class ArrayRotate {
	
	static int i[] = {1,2,3,4,5,6,7,8};
	static int r[]=new int[i.length];
	static int diff=2;
	static int delta = i.length-diff-1;
	static int[] q;
	public static void main(String[] args) {
	
	rightShift(i, diff);
}
 
  public static void rightShift(int[] p,int diff)
  {
	 q =new int[diff];
	 for(int k=0;k<diff;k++)
	 {
		q[k]=p[k]; 
	 }
	 int c=0;
	 for(int m=diff;m<p.length;m++)
	 {
		r[c] = p[m];
		c++;
	 }
	 for(int co=0;co<q.length;co++)
	 {
		 r[++delta]=q[co];
	 }
	 
	 for(int i:r)
	 {
		 System.out.println(i);
	 }
  }
}
