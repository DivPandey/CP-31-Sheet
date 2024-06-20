import java.util.Scanner;

/**
 * A_Doremy_s_Paint_3
 */
public class A_Doremy_s_Paint_3 {
    public static void check(int arr []){
        if(arr.length == 2){
            System.out.println("Yes");
            return;
        }
        if(arr.length == 3){
            if(arr[0] == arr[1] || arr[0]==arr[2] || arr[1]==arr[2]){
                System.out.println("Yes");
                return;
            }
        }
        
        for(int i = 1; i<arr.length; i++){
            if(arr[0] != arr[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            int [] num = new int[n];
            for(int j = 0; j < n; j++){
                num[j] = sc.nextInt();
            }
            check(num);
        }
    }
}