package collection;

public class BubbleSort {
public static void main(String[] args) {
	int [] i ={11,2,1,23,7,97,89,5,6,7,8,9,0,10};
	for(int k=0;k<i.length;k++){
		int temp=0;
		for(int l=0;l<i.length;l++){
			
			if(i[k]>i[l])
			{
					temp =i[k];
					i[k]=i[l];
					i[l]=temp;
			}
			
		} 
	}for(int n : i){
		System.out.println(n);
	}
}
}
