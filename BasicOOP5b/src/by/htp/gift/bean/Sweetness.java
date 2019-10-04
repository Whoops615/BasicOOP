package by.htp.gift.bean;

public class Sweetness {

	private String title;
	private int weight;
	private int price;
	private int calories;

	public Sweetness() {

	}

	public Sweetness(String title, int weight, int price, int calories) {
		this.title = title;
		this.weight = weight;
		this.price = price;
		this.calories = calories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Sweetness [title=" + title + ", weight=" + weight + ", price=" + price + ", calories=" + calories + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweetness other = (Sweetness) obj;
		if (calories != other.calories)
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}
