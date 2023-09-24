package FB_Google.basics.Revision.may;

/**
 * @author achatterjee ON 5/16/22
 * @project testautomation
 */
public class BnSearch {

    public static void main(String[] args) {
        int[] i  = {1,3,5,7,9,11,33};
        BnSearch bs = new BnSearch();
        bs.search(i,19);
    }

    private void search(int[] i,int key) {

        int st=0;
        int nd=i.length-1;
        int mid= (st+nd)/2;
        boolean found =false;
        while(st<=nd)
        {
            if(key<i[mid])
            {
                nd=mid-1;
                mid=(st+nd)/2;
            } else if(key>i[mid])
            {
                st=mid+1;
                mid=(st+nd)/2;
            } else{
                found=true;
                break;
            }
        }

        System.out.println("The status of search is: "+found);
    }
}
