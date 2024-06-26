import java.util.Scanner;

/**
 * A_Array_Coloring
 */
public class A_Array_Coloring {

    public static void check(int arr []){
        int count = 0;
        for(int a : arr){
            if(a%2 == 1) count++;
        }
        if(count%2 == 0) System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int N = sc.nextInt();
            int [] arr = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            check(arr);
        }
    }
}