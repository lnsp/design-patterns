public class Chocolate extends IngredientDecorator {
	Drink drink;

	public Chocolate(Drink drink) {
		this.drink = drink;
	}

	public String getDescription() {
		return drink.getDescription() + ", chocolate";
	}

	public double price() {
		return 0.2 + drink.price();
	}
}
