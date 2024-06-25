
import java.util.*;

/**
 * A_Coins
 */
public class A_Coins {
    public static void Check(long n , long k){
        if((n-k)%2 == 0 || n%2 == 0) System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long n = sc.nextLong();
            long k = sc.nextLong();
            Check(n, k);
        }
    }
}