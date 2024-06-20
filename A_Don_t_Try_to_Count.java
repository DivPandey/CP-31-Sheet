
import java.util.*;

/**
 * A_Don_t_Try_to_Count
 */
public class A_Don_t_Try_to_Count {
    public static int Count(String x, String s){
        int count = 0;
        for(int i = 0; i < 7; i++){
            if(x.contains(s)){
                return count;
            }
            x = x+x;
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            System.out.println(Count(x, s));
        }
    }
}