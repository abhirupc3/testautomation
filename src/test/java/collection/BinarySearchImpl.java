package collection;

public class BinarySearchImpl {

	private static int i[] = {7,8,9,10,11,12,13,14,15,16};
	public static void main(String[] args) {
		
		binSearch(11);
	}

	private static void binSearch(int key) {

		int first=0;
		int last = i.length-1;
		int middle = (first+last)/2;
		while(first<=last)
		{
			if(key<i[middle]){
				last=middle-1;
			} else if(key>i[middle])
			{
				first=middle+1;
			} else if(i[middle]==key)
			{
				System.out.println("Match Found");
				break;
			}
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println("No Match Found");
	}
}
