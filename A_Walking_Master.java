
import java.util.Scanner;



/**
 * A_Walking_Master
 */
public class A_Walking_Master {

    public static boolean isPossible(int a, int b , int c , int d){
        if(d<b) return false;
        if(d == b && c > a) return false;
        if(c <= (d-b)+a) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(isPossible(a, b, c, d)){
                System.out.println((d-b)*2 + (a-c));
            }else{
                System.out.println(-1);
            }
        }
    }
}