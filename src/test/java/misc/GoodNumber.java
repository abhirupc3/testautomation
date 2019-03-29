package misc;

import org.apache.tools.ant.Main;

public class GoodNumber {

	public static void main(String[] args) {
		new GoodNumber().findGoodNumber(410, 520, 3);
	}
	
	public void findGoodNumber(int start,int end,int index)
	{
		
		for(int i=start;i<=end;i++)
		{
			boolean isGood=true;
			int sum=0;
			int digit=0;
			int temp=i;
			int counter=0;
			while(temp!=0)
			{
				digit=temp%10;
				if(counter==0)
				{
					sum=sum+digit;
					temp=temp/10;
				}
				else if(digit>sum && digit!=index )
				{
			  sum=sum+digit;
			  temp=temp/10;
				}else{
					isGood=false;
					break;
				}
				counter++;
			}
			if(isGood)
			{
				System.out.println(i);
			}
		}
	}
}
