
import java.util.*;

/**
 * A_Buttons
 */
public class A_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b || (a==b && a == c)){
                if((a+b+c)%2 == 0){
                    System.out.println("Second");
                }else{
                    System.out.println("First");
                }
            }else{
                if(a>b){
                    System.out.println("First");
                }else{
                    System.out.println("Second");
                }
            }
        }
    }
}