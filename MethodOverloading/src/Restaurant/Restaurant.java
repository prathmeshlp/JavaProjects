package Restaurant;

public class Restaurant {

	int cheeseNCornPrice = 150;
	int margaRitaPrice = 180;
	int cheeseBurstPrice = 200;
	int cheesePrice = 50;

	public void order(String pizzaName) {
		order(pizzaName, 1, false);
	}

	public void order(String pizzaName, int quantity) {
		order(pizzaName, quantity, false);

	}

	public void order(String pizzaName, int quantity, boolean isExtraCheese) {

		int price = 0;

		if (pizzaName == "CheeseNCorn") {
			price = cheeseNCornPrice;
		} else if (pizzaName == "MargaRita") {
			price = margaRitaPrice;
		} else if (pizzaName == "CheeseBurst") {
			price = cheeseBurstPrice;
		} else {
			System.out.println("Invalid Pizza Name!");
			return;
		}

		int total = price * quantity;

		if (isExtraCheese) {
			total += cheesePrice * quantity;
		}

		System.out.println("Ordered Pizza Is: " + pizzaName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Please Pay Rs: " + total);
		System.out.println("-------------------------");
	}

}
