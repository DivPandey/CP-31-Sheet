
import java.util.Scanner;

/**
 * A_Line_Trip
 */
public class A_Line_Trip {
    public static int Min_Tank_Size(int [] stations, int des){
        int diff = 2*(des - stations[stations.length-1]);
        diff = Math.max(stations[0]-0,diff);
        for(int i = 0 ; i <stations.length-1; i++ ){
            int a = stations[i+1]-stations[i];
            if(a>diff) diff = a;
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int [] stations = new int[n];
            for(int j = 0; j < n; j++){
                stations[j] = sc.nextInt();
            }
            System.out.println(Min_Tank_Size(stations, x));
        }
    }
}