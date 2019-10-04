package by.htp.gift.bean;

public class SugarCandy extends Sweetness {

	private String taste;

	public SugarCandy() {

	}

	public SugarCandy(String title, int weight, int price, int calories, String taste) {
		super(title, weight, price, calories);
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "SugarCandy [taste=" + taste + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
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
		SugarCandy other = (SugarCandy) obj;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		return true;
	}

}
