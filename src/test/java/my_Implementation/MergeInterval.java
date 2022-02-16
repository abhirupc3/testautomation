package my_Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Interval implements Comparable<Interval>{
	public Integer getStartTime() {
		return startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	private Integer startTime;
	private Integer endTime;
	public Interval(int startTime,int endTime)
	{
		this.startTime=startTime;
		this.endTime=endTime;
	}
	public int compareTo(Interval o) {
		return this.startTime.compareTo(o.startTime);
	}
}
public class MergeInterval{
	
	public static void main(String[] args) {
		Interval i1=new Interval(1,2);
		Interval i2=new Interval(3,5);
		Interval i3=new Interval(8,10);
		Interval i4=new Interval(14,18);
		Interval i5=new Interval(9,12);
		Interval i6=new Interval(10,15);
		Interval[] intVal = new Interval[6];
		intVal[0]=i1;
		intVal[1]=i2;
		intVal[2]=i3;
		intVal[3]=i4;
		intVal[4]=i5;
		intVal[5]=i6;
		System.out.println("Before sort");
		for (Interval i:intVal) {
			System.out.println(i.getStartTime()+","+i.getEndTime());
		}
		System.out.println("After sort");
		Arrays.sort(intVal);
		for (Interval i:intVal) {
			System.out.println(i.getStartTime()+","+i.getEndTime());
		}
		Stack<Interval> st = new Stack<Interval>();
		st.push(intVal[0]);
		// creating the merge of intervals;
		int q=1;
		Interval tempInterval=null;;
		List<Interval> intList = new ArrayList<Interval>();
		while(q<intVal.length)
		{
			if(st.peek().getEndTime()>=intVal[q].getStartTime())
			{
				int et = st.peek().getEndTime()>=intVal[q].getEndTime()?st.peek().getEndTime():intVal[q].getEndTime();
				tempInterval = new Interval(st.peek().getStartTime(), et);
				st.pop();
				st.push(tempInterval);
			} else
			{
				st.push(intVal[q]);
			}
			q++;
		}
		System.out.println("after merge");
		for(Interval l:st)
		{
		  System.out.println(l.getStartTime()+","+l.getEndTime());	
		}
		
	}
}
