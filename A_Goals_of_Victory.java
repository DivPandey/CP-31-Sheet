
import java.util.Scanner;

/**
 * A_Goals_of_Victory
 */
public class A_Goals_of_Victory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int [] eff = new int[n-1];
            int ans = 0;
            for(int val = 0; val < n-1; val++){
                eff[val] = sc.nextInt();
                ans+=eff[val];
            }
            System.out.println(ans*-1);
        }
    }
}