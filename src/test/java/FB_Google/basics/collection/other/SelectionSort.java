package FB_Google.basics.collection.other;

import java.util.Arrays;

/**
 * @author achatterjee ON 3/10/22
 * @project testautomation
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {3,4,2,31,500,79,1,2349,12};
        selSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {};
        selSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {7};
        selSort(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {-1, -7, 0, 11, 102, -11};
        selSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));
    }

    private static void selSort(int[] a, int i, int i1) {

        for(int p=0;p<a.length;p++)
        {
            int temp=0;
            for(int q=p+1;q<a.length;q++) {
                if (a[p] > a[q]) {
                    temp = a[p];
                    a[p] = a[q];
                    a[q] = temp;
                }
            }

        }
    }
}
