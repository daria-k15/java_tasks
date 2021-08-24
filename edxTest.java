import java.util.Scanner;

public class edxTest{
	public static void main(String[] args){
		Scanner vvod = new Scanner(System.in);
		System.out.print("List of operations: add substract multiply divide alphabetize\n");
		System.out.print("Enter an operation:\n");
		String value = vvod.nextLine();
		if (value.equals("add")){
			System.out.print("Enter two integers:\n");
			int x = vvod.nextInt();
			int y = vvod.nextInt();
			System.out.printf("Answer: %d\n", x + y);
		}
		else if (value.equals("multiply")){
			System.out.print("Enter two doubles:\n");
			Double x = vvod.nextDouble();
			Double y = vvod.nextDouble();
			System.out.printf("Answer: %.2f\n", x * y);
		}
		else if (value.equals("substract")){
			System.out.print("Enter two integers:\n");
			int x = vvod.nextInt();
			int y = vvod.nextInt();
			System.out.printf("Answer: %d\n", x - y);
		} else if (value.equals("divide")){
			System.out.print("Enter two doubles:\n");
			Double x = vvod.nextDouble();
			Double y = vvod.nextDouble();
			System.out.printf("Answer: %.2f\n", x / y);
		} else if (value.equals("alphabetize")){
			System.out.print("Enter two words:\n");
			String x = vvod.nextLine();
			String y = vvod.nextLine();
			if (x.compareTo(y) > 0)
				System.out.printf("%s comes before %s alphabetically\n", x, y);
			else
				System.out.printf("%s comes before %s alphabetically\n", y, x);
		}
		else
			System.out.print("Invalid input entered. Terminating...\n");
	}
}