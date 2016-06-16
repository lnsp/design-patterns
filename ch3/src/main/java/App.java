public class App {
	public static void main(String[] args) {
		Drink drink = new Espresso();
		System.out.println(drink);

		Drink drink2 = new DarkRoast();
		drink2 = new Chocolate(drink2);
		drink2 = new Chocolate(drink2);
		drink2 = new Froth(drink2);
		System.out.println(drink2);

		Drink drink3 = new HouseBlend();
		drink3 = new Soja(drink3);
		drink3 = new Chocolate(drink3);
		drink3 = new Froth(drink3);
		System.out.println(drink3);
	}
}
