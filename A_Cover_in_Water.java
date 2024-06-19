
import java.util.Scanner;

/**
 * A_Cover_in_Water
 * 
 *    . Empty
 *    # Blocked
 */
public class A_Cover_in_Water {
    public static int Water_fill_operation(String condition){
        int n = condition.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            int Empty = 0;
            char ch = condition.charAt(i);
            if(ch == '.'){
                while(i<n && condition.charAt(i) == '.' ){
                    Empty++;
                    i++;
                    count++;
                }
                if(Empty >= 3) return 2;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(Water_fill_operation(s));
        }
    }
}