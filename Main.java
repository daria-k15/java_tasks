import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int railroadsCount = 0;

        int townsNumber = Integer.parseInt(in.nextLine());
        String[] townsString = new String[townsNumber];
        for (int i = 0; i < townsNumber; i++) {
            townsString[i] = in.nextLine();
        }

        for (int i = 0; i < townsNumber - 1; i++) {
            townsString[i] = townsString[i].substring(i + 1);
            String currentString = townsString[i].replaceAll("1", "");
            railroadsCount += (townsString[i].length() - currentString.length());
        }

        out.println(railroadsCount);
        out.flush();
    }
}