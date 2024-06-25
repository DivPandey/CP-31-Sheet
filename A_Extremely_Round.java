import java.util.*;
public class A_Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            String s = sc.next();
            int ans=s.length()*9-9+s.charAt(0)-'0';
            System.out.println(ans);
        }
        sc.close();
    }
}