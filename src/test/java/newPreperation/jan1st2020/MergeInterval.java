package newPreperation.jan1st2020;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a set of time intervals in any order, merge all overlapping
 *  intervals into one and output the result which should have only mutually 
 *  exclusive intervals. Let the intervals be represented as pairs of integers
 *   for simplicity.
For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }.
 The intervals {1,3} and {2,4} overlap with each other, so they should be 
 merged and become {1, 4}. Similarly {5, 7} and {6, 8} should be merged and 
 become {5, 8}
 Algorithm:
 
  1. Sort the intervals based on start time.(Use comparable)
  2. Store th 1st element in stack.
  3. loop through 2nd to last element and if last element in stack is less than current last element then push the current last element to stack;
 * @author 19094
 *
 */
class Interval implements Comparable<Interval>
{
	public Integer startInd;
	public int getStartInt() {
		return startInd;
	}
	public int getEndInd() {
		return endInd;
	}
	public Integer endInd;
	public int compareTo(Interval o) {
		
		return (this.startInd.compareTo(o.startInd));
	}
	public Interval(int startInd, int endInd)
	{
		this.startInd=startInd;
		this.endInd=endInd;
	}
	
}
public class MergeInterval {

	
	public static void main(String[] args) {
		Interval[] intVal = new Interval[6];
		intVal[0]= new Interval(1, 2);
		intVal[1]= new Interval(3, 5);
		intVal[2]= new Interval(8, 10);
		intVal[3]= new Interval(14, 18);
		intVal[4]= new Interval(9, 12);
		intVal[5]= new Interval(10, 15);
		Arrays.sort(intVal);
		for(Interval i:intVal)
		{
			System.out.println(i.getStartInt()+","+i.getEndInd());
		}
		Stack<Interval> st = new Stack<Interval>();
		st.push(intVal[0]);
		for(int q=1;q<intVal.length;q++)
		{
			if(st.peek().getEndInd()>intVal[q].getStartInt())
			{
				Interval tmp = new Interval(st.peek().getStartInt(),intVal[q].getEndInd());
				st.pop();
				st.push(tmp);
				
			} else if(st.peek().getEndInd()<intVal[q].getStartInt())
			{
				st.push(intVal[q]);
			}
		}
		System.out.println("After merge");
		for (Interval interval : st) {
			System.out.println(interval.getStartInt()+","+interval.getEndInd());
		}
		
	}
}
