import java.util.Scanner;

public class Railway_sum{
    public static void main (String[] args){
        Scanner vvod = new Scanner (System.in);
        int N = vvod.nextInt();
        int[][] array = new int[N][N];
        int res = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                array[i][j] = vvod.nextInt();
            }
        }
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (array[i][j] == 1)
                    res++;
            }
        }
        System.out.printf("%d\n", res / 2);
    }
}