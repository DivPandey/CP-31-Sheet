
import java.util.Scanner;

/**
 * A_Grasshopper_on_a_Line
 */
public class A_Grasshopper_on_a_Line {

    public static void solve(int x, int k){
        if(x%k !=0 ) {
            System.out.println(1);
            System.out.println(x);
        }else{
            System.out.println(2);
            System.out.println(x-1 + " " + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            solve(x, y);
        }
    }
}