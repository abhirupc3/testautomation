package newPreperation.march2022;

/**
 * @author achatterjee ON 2/25/22
 * @project testautomation
 */
public class BinSearch {
    public static void main(String[] args) {
        int [] i = {11,12,13,14,15,16,17,28,29};
        search(i,15);
    }

    private static void search(int[] i,int key) {

        int st = 0;
        int nd = i.length-1;
        int mid = (st+nd)/2;
        boolean found = false;
        while(st<=nd)
        {
            if(key<i[mid])
            {
                nd = mid-1;
            } else if(key>i[mid])
            {
                st=mid+1;
            } else{
                System.out.println("Match found!!!");
                found=true;
                break;
            }
            mid=(st+nd)/2;
        }
        if(!found)
            System.out.println("No Match");
    }
}
