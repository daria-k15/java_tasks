import java.util.Scanner;

public class Dublicate_s{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String before = input.nextLine();
		String after = before.trim().replaceAll(" +", " ");

		System.out.println(after);
	}
}