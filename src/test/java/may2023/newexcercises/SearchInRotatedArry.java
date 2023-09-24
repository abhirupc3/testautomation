package may2023.newexcercises;

/**
 * @author achatterjee ON 5/2/23
 * @project testautomation
 */

/**
 * Search in a rotated Array
 * //https://youtu.be/U8XENwh8Oy8
 * Original Array {1,2,3,4,5} after rotation {3,4,5,1,2} , output: 1
 */
public class SearchInRotatedArry {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        SearchInRotatedArry srch = new SearchInRotatedArry();
        srch.find(a,2);
    }

    private void find(int[] a,int key) {
        int l= 0;
        int r = a.length-1;
        int mid = 0;
        int flag = -1;
        while(l<=r) {
            mid = (l+r)/2;
            if (key > a[mid]) {
            l=mid+1;
            } else if(key<a[mid] && key>=a[l])
            {
                r=mid-1;
            } else if(key<a[mid] && key<a[l])
               l=mid+1;
             else if(key==a[mid]) {
                {

                    System.out.println("The value exists at the index of "+mid);
                    return;
                }
            }
            }

        System.out.println("The value doesn't exists");
    }
}
