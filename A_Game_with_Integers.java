/**
 * A_Game_with_Integers
 */
import java.util.*;
public class A_Game_with_Integers {

    public static void check_Win(int n){
        if(n%3 == 0) System.out.println("Second");
        else{
            System.out.println("First");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            check_Win(n);
        }
    }
}