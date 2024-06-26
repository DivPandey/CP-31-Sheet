
import java.util.Scanner;

/**
 * B_Blank_Space
 */
public class B_Blank_Space {

    public static int Spaces(int n, int [] arr){
        int ans = 0;
        for(int i =0; i < n; i++){
            int count = 0 ;
            while(i<n && arr[i]==0){
                count++;
                i++;
            }
            if(count>ans) ans = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int arr [] = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(Spaces(n, arr));
        }
    }
}