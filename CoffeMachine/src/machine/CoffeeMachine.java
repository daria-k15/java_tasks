package machine;
import java.util.ArrayList;
import java.util.Scanner;

interface CoffeeDevice {
	public void setTypes();
	public void printState();
	public void selectCoffee();
	public void makeCoffee(CoffeeS coffee);
	public void fill();
	public void giveMoney();
}

public class CoffeeMachine implements CoffeeDevice{
	static int money = 550;
	static int water = 400;
	static int coffeeb = 120;
	static int milk = 540;
	static int cups = 9;
	static ArrayList<CoffeeS> types = new ArrayList<>();

	public void setTypes(){
		types.add(new CoffeeS(4,250, 16, 0, 1, "espresso"));
		types.add(new CoffeeS(7, 350, 20, 75, 1, "latte"));
		types.add(new CoffeeS(6, 200, 12, 100, 1, "cappuccino"));
		types.add(new CoffeeS(0,0,0,0,0, "back - to"));
	}

	public void printState(){
		System.out.println("The coffee machine has:");
		System.out.println(water + " ml of water");
		System.out.println(milk + " ml of milk");
		System.out.println(coffeeb + " g of coffee beans");
		System.out.println(cups + " disposable cups");
		System.out.println("$" + money + " of money");
	}

	public void makeCoffee(CoffeeS coffee){
		if (water >= coffee.water && milk >= coffee.milk && coffeeb >= coffee.coffee && cups > 0){
			System.out.println("I have enough resources, making you a coffee!");
			water -= coffee.water;
			milk -= coffee.milk;
			coffeeb -= coffee.coffee;
			cups -= 1;
			money += coffee.money;
		} else {
			if (water < 200) {
				System.out.println("Sorry, not enough water!");
			}else if (milk < 100){
				System.out.println("Sorry, not enough milk!");
			}else if (coffeeb < 12){
				System.out.println("Sorry, not enough coffee beans!");
			} else if(cups == 0){
				System.out.println("Sorry, not enough cups");
			}
		}
	}

	public void selectCoffee(){
		Scanner vvod = new Scanner(System.in);
		setTypes();
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to");
		String type = vvod.next();
		switch (type){
			case "1":
				makeCoffee(types.get(0));
				break;
			case "2":
				makeCoffee(types.get(1));
				break;
			case "3":
				makeCoffee(types.get(2));
				break;
			case "back - to":
				break;
		}
	}

	public void fill(){
		Scanner vvod = new Scanner(System.in);
		System.out.println("Write how many ml of water you want to add:");
		water += vvod.nextInt();
		System.out.println("Write how many ml of milk you want to add: ");
		milk += vvod.nextInt();
		System.out.println("Write how many grams of coffee beans you want to add: ");
		coffeeb += vvod.nextInt();
		System.out.println("Write how many disposable cups of coffee you want to add: ");
		cups += vvod.nextInt();

	}

	public void giveMoney(){
		System.out.println("I gave you $" + money);
		money = 0;
	}
}
