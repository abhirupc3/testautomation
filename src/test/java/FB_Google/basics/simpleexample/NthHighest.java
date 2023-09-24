package FB_Google.basics.simpleexample;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author achatterjee ON 5/22/22
 * @project testautomation
 */
public class NthHighest {
    public static void main(String[] args) {
        int[] i = {1,2,32,1,32,44,12,3};
        //int[] i = {11,3,2,1,15,5,4};
        NthHighest n = new NthHighest();
        int k = n.findKthMax(i,3);
        System.out.println(k);
        n.FirstKelements(i,i.length,3);
    }

    private int findKthMax(int[] i, int s) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int k=0;k<s;k++)
        {
            pq.add(i[k]);
        }
        for(int k=s;k<i.length;k++)
        {
            if(i[k]<=pq.peek() )
                continue;
            else if(!pq.contains(i[k])){
                pq.poll();
                pq.add(i[k]);
            }
        }
        return pq.peek();
    }

    public static void FirstKelements(int arr[],
                                      int size,
                                      int k)
    {

        // Creating Min Heap for given
        // array with only k elements
        // Create min heap with priority queue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k; i++)
        {
            minHeap.add(arr[i]);
        }

        // Loop For each element in array
        // after the kth element
        for(int i = k; i < size; i++)
        {

            // If current element is smaller
            // than minimum ((top element of
            // the minHeap) element, do nothing
            // and continue to next element
            if (minHeap.peek() > arr[i])
                continue;

                // Otherwise Change minimum element
                // (top element of the minHeap) to
                // current element by polling out
                // the top element of the minHeap
            else
            {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        // Now min heap contains k maximum
        // elements, Iterate and print
        Iterator iterator = minHeap.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
    }
}
