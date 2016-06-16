public class Froth extends IngredientDecorator {
	Drink drink;

	public Froth(Drink drink) {
		this.drink = drink;
	}

	public String getDescription() {
		return drink.getDescription() + ", froth";
	}

	public double price() {
		return 0.1 + drink.price();
	}
}
