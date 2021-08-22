import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int square = 0, pointOnBoard = 0;

        int n = Integer.parseInt(in.nextLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            String[] currentPoint = in.nextLine().split(" ");
            x[i] = Integer.parseInt(currentPoint[0]);
            y[i] = Integer.parseInt(currentPoint[1]);
        }

        for (int i = 0; i < n; i++) { // площадь произвольного многоугольника
            if (i == 0) {
                square += x[i] * (y[n - 1] - y[1]);
            } else if (i == n - 1) {
                square += x[i] * (y[n - 2] - y[0]);
            } else {
                square += x[i] * (y[i - 1] - y[i + 1]);
            }
        }

        BigInteger currentGcd;
        for (int i = 0; i < n; i++) { // кол-во точек на границе многоугольника
            int j = i + 1;
            if (j == n) j = 0;
            BigInteger dx = BigInteger.valueOf(x[i] - x[j]);
            BigInteger dy = BigInteger.valueOf(y[i] - y[j]);
            currentGcd = dx.gcd(dy);
            pointOnBoard += currentGcd.intValue();
        }

        out.println(square / 2 - pointOnBoard / 2 + 1);
        out.flush();
    }
}