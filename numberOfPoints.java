import java.util.Scanner;
import java.math.BigInteger;

public class numberOfPoints{
	public static void main(String[] args){
		Scanner vvod = new Scanner(System.in);
		int square = 0, pointOnBoard = 0;

		int n = Integer.parseInt(vvod.nextLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++){
			String[] current = vvod.nextLine().split(" ");
			x[i] = Integer.parseInt(current[0]);
			y[i] = Integer.parseInt(current[1]);
		}
		int ymin = 0;
		for (int i = 0; i < n; i++){
			if (i == 0){
				square += x[i] * (y[n -1] - y[1]);
			}
			else if (i == n - 1){
				square += x[i] * (y[n - 2] - y[0]);
			} else{
				square += x[i] * (y[i - 1] - y[i + 1]);
			}
		}
		for (int i = 0; i < n; i++){
			int j = i + 1;
			if (j == n)
				j = 0;
			int dx = x[i] - x[j];
			int dy = y[i] - y[j];
		}
	}
}