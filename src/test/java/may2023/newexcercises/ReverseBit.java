package may2023.newexcercises;

/**
 * @author achatterjee ON 5/3/23
 * @project testautomation
 * https://youtu.be/UcoN6UjAI64
 */
public class ReverseBit {
    public static void main(String[] args) {
        int in = 00000000000000000000000000001011;
        ReverseBit rb = new ReverseBit();
        rb.reverse(in);
    }

    private void reverse(int in) {
        System.out.println(in);
        int k = in>>1;
        System.out.println(in>>1);

    }
}
