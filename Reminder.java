import java.util.Scanner;

public class Reminder{
    public static void main(String[] args){
        int size = 3;
        Scanner vvod = new Scanner(System.in);
        int[] current = new int[3];
        for (int i = 0; i < 3; i++){
            current[i] = vvod.nextInt();
        }
        int N = vvod.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = vvod.nextInt();
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
            System.out.print(array[1][1]);
        
    }
}