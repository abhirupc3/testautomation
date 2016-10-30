package misc;

public class Top2MostPopularNumberInAnArray {

	private static int popular ;
	private static int c;
	private static int popular2 ;
	private static int c2;
	public static void main(String[] args) {

		int[] i = {12,23,1,2,34,44,57,95,67,67,67,67,67,33,22,22,22,22,21};
		popular(i);
	}

	private static void popular(int[] i) {
		for(int k:i)
		{
			int count=0;
			for(int l:i)
			{
				if(k==l){
					count ++;
				}
			}
			if(count>c){
				c=count;
				popular=k;
			} 
			else if(count<c && count>c2){
				c2=count;
				popular2=k;
			}
		}
		System.out.println("Most popular number is : "+popular);
		System.out.println("Number of occurance is :"+c);
		System.out.println("2nd Most popular number is : "+popular2);
		System.out.println("Number of occurance is :"+c2);
	}

}
