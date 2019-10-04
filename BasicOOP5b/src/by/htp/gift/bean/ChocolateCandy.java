package by.htp.gift.bean;

public class ChocolateCandy extends Sweetness {

	private String tupeChocolate;
	private String filling;

	public ChocolateCandy() {

	}

	public ChocolateCandy(String title, int weight, int price, int calories, String tupeChocolate, String filling) {
		super(title, weight, price, calories);
		this.tupeChocolate = tupeChocolate;
		this.filling = filling;
	}

	public String getTupeChocolate() {
		return tupeChocolate;
	}

	public void setTupeChocolate(String tupeChocolate) {
		this.tupeChocolate = tupeChocolate;
	}

	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}

	@Override
	public String toString() {
		return "ChocolateCandy [tupeChocolate=" + tupeChocolate + ", filling=" + filling + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((filling == null) ? 0 : filling.hashCode());
		result = prime * result + ((tupeChocolate == null) ? 0 : tupeChocolate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChocolateCandy other = (ChocolateCandy) obj;
		if (filling == null) {
			if (other.filling != null)
				return false;
		} else if (!filling.equals(other.filling))
			return false;
		if (tupeChocolate == null) {
			if (other.tupeChocolate != null)
				return false;
		} else if (!tupeChocolate.equals(other.tupeChocolate))
			return false;
		return true;
	}

}
