package FB_Google.basics.collection.other;

import java.util.Arrays;

/**
 * @author achatterjee ON 3/10/22
 * @project testautomation
 */
public class MergeSort {
    public static void main(String[] args)
    {
        int[] arr1 = {3,4,2,31,500,79,1,2349,12};
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {7};
        mergeSort(arr3, 0, arr3.length - 1);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {-1, -7, 0, 11, 102, -11};
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));
    }
    public static void mergeSort(int[] arrToSort, int startIdx, int endIdx)
    {
        if (startIdx >= endIdx) //array contains just a single element
            return;

        int midIdx = startIdx + (endIdx - startIdx) / 2; //middle index
        mergeSort(arrToSort, startIdx, midIdx); //Divide the left half recursively
        mergeSort(arrToSort, midIdx + 1, endIdx); //Divide the right half recursively

        merge(arrToSort, startIdx, midIdx, endIdx); //merge the left and right half
    }
    public static void merge(int[] arrToSort, int startIdx, int midIdx, int endIdx)
    {
        int[] leftArr = new int[midIdx - startIdx + 1];
        int[] rightArr = new int[endIdx - midIdx];

        //Initializing the left and right arrays
        for(int i=0; i<leftArr.length; i++)
            leftArr[i] = arrToSort[startIdx + i];

        for(int i=0; i<rightArr.length; i++)
            rightArr[i] = arrToSort[midIdx + i + 1];

        //merging the left and right arrays into a single sorted array
        int leftArrIdx = 0, rightArrIdx = 0, sortedArrIdx = startIdx;
        while((leftArrIdx < leftArr.length) && (rightArrIdx < rightArr.length))
        {
            if(leftArr[leftArrIdx] < rightArr[rightArrIdx])
            {
                arrToSort[sortedArrIdx++] = leftArr[leftArrIdx++];

            }
            else
            {
                arrToSort[sortedArrIdx++] = rightArr[rightArrIdx++];

            }

        }

        //Adding the rest of the elements of left array if present
        while(leftArrIdx < leftArr.length)
        {
            arrToSort[sortedArrIdx++] = leftArr[leftArrIdx++];
        }

        //Adding the rest of the elements of right array if present
        while(rightArrIdx < rightArr.length)
        {
            arrToSort[sortedArrIdx++] = rightArr[rightArrIdx++];
        }
    }

}
