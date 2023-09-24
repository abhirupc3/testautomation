package FB_Google.basics.Revision.may;
import java.util.*;
/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class kthClose {
    public static void main(String[] args) {
        int x[][] = {{3,3},{-2,4},{5,-1}};
        kthClose kc = new kthClose();
        kc.close(x);
    }

    private void close(int[][] x) {
        List<Element> li = new ArrayList<Element>();
       for(int k=0;k<x.length;k++)
        {
          int dist = x[k][0]*x[k][0] +x[k][1]*x[k][1];
          li.add(new Element(x[k][0],x[k][1],dist)) ;
        }
       Collections.sort(li);
       for(Element e: li)
       {
           System.out.println(e.x+ "  "+e.y+"  Distance"+ e.dist);
       }
    }

    class Element implements Comparable<Element>{
        int x;
        int y;
        int dist;
        public Element(int x, int y, int dist)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
        }

        @Override
        public int compareTo(Element o) {
            return this.dist-o.dist;
        }
    }
}
