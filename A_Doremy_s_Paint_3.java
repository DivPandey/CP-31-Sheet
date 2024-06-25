import java.util.*;

/**
 * A_Doremy_s_Paint_3
 */
public class A_Doremy_s_Paint_3 {
    public static void check(int arr []){
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(Map.containsKey(arr[i])){
                Map.put(arr[i],Map.get(arr[i])+1);
            }else{
                Map.put(arr[i], 1);
            }
        }
        if(Map.size()==1) {
            System.out.println("Yes");return;}
        if(Map.size()>2) {System.out.println("No"); return;}
        // if(Map.size() == 2){
        //     if(arr.length == 2){
        //         System.out.println("Yes");
        //         return;
        //     }
            Collection<Integer> frequencies = Map.values();
            List<Integer> frequencyList = new ArrayList<>(frequencies);
            
            // Store the frequencies in separate variables
            int frequency1 = frequencyList.get(0);
            int frequency2 = frequencyList.get(1);

            if(frequency1 == frequency2 || Math.abs(frequency1-frequency2) == 1) System.out.println("Yes");
            else{
                System.out.println("No");
            }
        }
    // }

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
