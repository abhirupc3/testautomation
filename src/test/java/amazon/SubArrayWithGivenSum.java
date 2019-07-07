package amazon;

//Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
//Input: 1 2 3 4 5 6 7 8 9 10 And  15
// Output position 1 to position 5
// Note: since sum of numbers from pos 1 to 5 is 15.
public class SubArrayWithGivenSum {
	static int startindex, endIndex;
	static boolean matchfound = false;

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//{1,2,3,7,5};// 
		int sum = 15;// 12;//
		findSubArray1(a, sum, 0);
		if (matchfound) {
			System.out.println("StartIndex" + startindex);
			System.out.println("EndIndex" + endIndex);
		} else
			System.out.println("Not Found");
	}

	private static void findSubArray(int[] a, int sum, int init) {
		int tempSum = 0;
		boolean br = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {                  
				tempSum = tempSum + a[j];
				if (tempSum > sum) {
					tempSum = 0;
					break;
				} else if (tempSum == sum) {
					startindex = i + 1;
					endIndex = j + 1;
					matchfound = true;
					br = true;
					break;
				}
			}
			if (br)
				break;
		}
	}

	private static void findSubArray1(int[] a, int sum, int init) {
    	 int tempSum=0;boolean br=false;
    	 int startI=-1;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 //for(int j=i;j<a.length;j++)
    			 tempSum=tempSum+a[i];
    			 if(tempSum>sum)
    			 {
    				 startI=startI+1;
    				 i=startI;
    				 tempSum=0;
    			 }
    			 else if(tempSum==sum)
    			 {
    				 startindex=startI+2;
    				 endIndex=i+1;
    				 matchfound=true;
    				 br=true;
    				 break;
    			 }
     }
}
}