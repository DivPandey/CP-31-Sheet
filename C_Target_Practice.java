import java.util.*;

/**
 * C_Target_Practice
 */
public class C_Target_Practice {
    public static int Score(char [][] arr ){
        boolean [][] visited = new boolean[10][10];
        int score = 0;
        for(int i = 0 ; i < 10; i++){
            for(int j = 0; j < 10 ; j++){
                if((i==4 || i == 5) && (j==4 || j == 5) && arr[i][j]=='X' && visited[i][j]==false){
                    score+=5;
                    visited[i][j] = true;
                } 
                else if((i>=3 && i <= 6) && (j>=3 && j <= 6) && arr[i][j]=='X' && visited[i][j]==false) {
                    score+=4;
                    visited[i][j] = true;
                }
                else if((i>=2 && i <= 7) && (j>=2 && j <= 7) && arr[i][j]=='X' && visited[i][j]==false) {
                    score+=3;
                    visited[i][j] = true;
                }
                else if((i>=1 && i <= 8) && (j>=1 && j <= 8) && arr[i][j]=='X' && visited[i][j]==false) {
                    score+=2;
                    visited[i][j] = true;
                }
                else if((i>=0 && i <= 9) && (j>=0 && j <= 9) && arr[i][j]=='X' && visited[i][j]==false) {
                    score+=1;
                    visited[i][j] = true;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t ; i++){
            char [][] board = new char[10][10];
            for(int row = 0; row < 10; row++){
                String str = sc.nextLine();
                for(int col = 0; col < 10; col++){
                    board[row][col] = str.charAt(col);
                }
            }
            System.out.println(Score(board));
        }
    }
}