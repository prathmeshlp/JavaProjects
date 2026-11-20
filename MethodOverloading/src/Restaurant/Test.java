package Restaurant;

public class Test {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();
		restaurant.order("MargaRita");
		restaurant.order("CheeseNCorn", 2);
		restaurant.order("CheeseBurst", 3, true);

	}

}
