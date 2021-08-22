import java.util.Scanner;

public class free_Space{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        char[][] array = new char[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = vvod.next().charAt(0);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i][j] == '.'){
                    count++;
                }
            }
        }
        int[] selected = new int[2];
        for (int i = 0; i < 2; i++){
            selected[i] = vvod.nextInt();
        }
        System.out.printf("%d\n", count);
    }
}