import java.util.Scanner;

/**
 * A_Doremy_s_Paint_3
 */
public class A_Doremy_s_Paint_3 {
    public static void check(int arr []){
        int a = arr[0];
        int b = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            if(a == arr[i+1]){
                while(a == arr [i+1]){
                    a = arr[i+1];
                    i++;
                }
            }
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
