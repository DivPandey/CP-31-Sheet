/**
 * A_Ambitious_Kid
 */
import java.util.*;
public class A_Ambitious_Kid {

    public static int solve(int [] arr){
        int min = (int)(1e5);
        for(int a : arr){
            if(Math.abs(a)<min) min = Math.abs(a); 
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr [] = new int[N];
        for(int i =0 ; i< N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
}