package misc;

public class MostPopularNumberInAnArray {

	private static int popular ;
	private static int c;
	public static void main(String[] args) {

		int[] i = {12,23,1,2,34,44,57,95,67,33,22,22,22,22,21};
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
		}
		System.out.println("Most popular number is : "+popular);
		System.out.println("Number of occurance is :"+c);
	}

}
