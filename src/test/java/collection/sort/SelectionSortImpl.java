package collection.sort;
//https://www.youtube.com/watch?v=p2lN3HnekB0&t=164s
public class SelectionSortImpl {
 public static void main(String[] args) {
	 int [] number= {100,1,2,3,305,99,87,0,6,34,21212};
	 System.out.println("Before");
	 for (int i : number) {
		 System.out.println(i);
	}
	 int k[] = selectionSort(number,0);
	 System.out.println("After");
	 for (int i : k) {
		 System.out.println(i);
	}
}

private static int[] selectionSort(int[] num, int fixed) {
	int varPointer=fixed+1;
	 if(varPointer<num.length) {
          for(int m=varPointer;m<num.length;m++)
          {
        	  if(num[fixed]>num[m])
        	  {
        		  int temp = num[fixed];
        		  num[fixed]=num[m];
        		  num[m]=temp;
        	  }
          }
          selectionSort(num,fixed+1);
	 }
	 return num;
}
}
