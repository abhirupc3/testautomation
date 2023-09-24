package may2023.newexcercises;

/**
 * @author achatterjee ON 5/2/23
 * @project testautomation
 * //https://youtu.be/nIVW4P8b1VA
 */

/**
 * Original Array {1,2,3,4,5} after rotation {3,4,5,1,2} , output: 1
 * Find minimum of Rotated sorted array, use O(log(n)) complexiety;
 */
public class MinOfRotatedSortedArray {
    public static void main(String[] args) {
        MinOfRotatedSortedArray m = new MinOfRotatedSortedArray();
        int[]a = {3,4,5,1,2};
        m.findMin(a);
    }

    private void findMin(int[] a) {
        int l=0;int r=a.length-1;
        int result=0;
        while(l<=r)
        {
            if(a[l]<a[r]) {
                result = a[l];
                break;
            }
          int mid = (l+r)/2;
            result = Integer.min(result,a[mid]);
            if(a[l]<a[mid])
            {
                l=mid+1;
            } else
            {
                r=mid;
            }
        }
        System.out.println("The value of the min value is: "+result);
    }
}
