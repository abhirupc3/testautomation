package newPreperation.mustDetele;

public class ArrayRev {
 public static void main(String[] args) {
	int i[] = {1,2,3,4,5,6,7,8,9};
	for (int j : i) {
		System.out.println(j);
	}
	reverse(i);
	for (int j : i) {
		System.out.println(j);
	}
}

private static void reverse(int[] i) {
	int p=0;
	int q=i.length-1;
	while(p<q)
	{
		int temp = i[p];
		i[p]=i[q];
		i[q]=temp;
		p++;
		q--;
	}
	
}
}
