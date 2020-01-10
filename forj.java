import java.math.BigInteger;


public class forj {
    public static void main(String[] args) {

        int n = 1000;

        BigInteger sum= BigInteger.valueOf(1);
        for (int i=1;i<=n;i++) {
            sum =sum.multiply(BigInteger.valueOf(i));
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
