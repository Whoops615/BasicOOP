package by.htp.gift.bean;

import java.util.ArrayList;
import java.util.List;

public class Gift {

	private Cover cover;
	private List<Sweetness> sweetness;

	public Gift() {
		sweetness = new ArrayList<Sweetness>();
	}

	public Gift(Cover cover, List<Sweetness> sweetness) {

		this.cover = cover;
		this.sweetness = sweetness;
	}

	public void add(Sweetness s) {
		sweetness.add(s);
	}

	public Sweetness getSweetneesID(int index) {
		return sweetness.get(index);
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public List<Sweetness> getSweetness() {
		return sweetness;
	}

	public void setSweetness(List<Sweetness> sweetness) {
		this.sweetness = sweetness;
	}

	@Override
	public String toString() {
		return "Gift [cover=" + cover + ", sweetness=" + sweetness + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + ((sweetness == null) ? 0 : sweetness.hashCode());
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
		Gift other = (Gift) obj;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (sweetness == null) {
			if (other.sweetness != null)
				return false;
		} else if (!sweetness.equals(other.sweetness))
			return false;
		return true;
	}

}
