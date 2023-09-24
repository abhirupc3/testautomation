package may2023.revision;

/**
 * @author achatterjee ON 6/10/23
 * @project testautomation
 */
public class SearchInArray {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        SearchInArray siA = new SearchInArray();
        siA.search(a,5);
    }

    private void search(int[] a, int i) {
        int left=0;
        int right=a.length-1;
        int mid = (left+right)/2;

        while(left<=right)
        {
            mid=(left+right)/2;
            if(i<a[mid] && i<a[left])
            {
                left=mid+1;
            } else if(i>a[mid])
            {
                left=mid+1;
            }
            else if(i<a[mid] && i>a[left])
            {
                right=mid-1;
            }
            else if(i==a[mid])
            {
                System.out.println("Match found in index "+mid);
                break;
            }
        }

    }
}
