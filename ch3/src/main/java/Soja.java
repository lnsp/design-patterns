public class Soja extends IngredientDecorator {
	Drink drink;

	public Soja(Drink drink) {
		this.drink = drink;
	}

	public String getDescription() {
		return drink.getDescription() + ", soja";
	}

	public double price() {
		return 0.15 + drink.price();
	}
}
