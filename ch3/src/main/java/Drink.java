public abstract class Drink {
	protected String description = "Unknown drink";

	public String getDescription() {
		return description;
	}

	public abstract double price();

	public String toString() {
		return getDescription() + " (" + price() + "€)";
	}
}
