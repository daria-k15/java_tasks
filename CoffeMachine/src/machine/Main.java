package machine;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();
		while (true){
			System.out.println("Write action (buy, fill, take, remaining, exit): ");
			Scanner vvod = new Scanner(System.in);
			String action = vvod.next();
			switch(action){
				case "buy":
					machine.selectCoffee();
					break ;
				case "fill":
					machine.fill();
					break;
				case "take":
					machine.giveMoney();
					break ;
				case "remaining":
					machine.printState();
					break ;
				case "exit":
					exit(0);
			}

		}
	}
}
