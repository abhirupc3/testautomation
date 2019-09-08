package amazon.my_Implementation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import collection.MapImpl.Entry;

/**
 * Given a value N, total sum you have. You have to make change for Rs. N, and there is infinite supply of each of the denominations in Indian currency, i.e., you have infinite supply of { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000} valued coins/notes, Find the
 * minimum number of coins and/or notes needed to make the change for Rs N.
 * @author 19094
 *
 */
public class MinCoins {
    
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//sc.nextInt();
		int [] coins = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000} ;
		Stack<Integer> coinStack = new Stack<Integer>();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int total=6950;
		MinCoins minC = new MinCoins();
		minC.minCoin(total, coins);
	}
	public void minCoin(int total, int coins[])
	{
		//Stack<Integer> coinStack = new Stack<Integer>();
		int count=coins.length-1;
		int rem=0;
		while(count>=0)
		{
			rem = total/coins[count];
			
			if(rem>0)
			{
				for(int p=0;p<rem;p++)
				{
					System.out.print(coins[count] + " ");
				}
				total = total%coins[count];
			}
			count--;	
		}
	}
}
