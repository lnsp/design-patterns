public class HotMilk extends IngredientDecorator {
	Drink drink;

	public HotMilk(Drink drink) {
		this.drink = drink;
	}

	public String getDescription() {
		return drink.getDescription() + ", hot milk";
	}

	public double price() {
		return drink.price() + 0.1;
	}
}
