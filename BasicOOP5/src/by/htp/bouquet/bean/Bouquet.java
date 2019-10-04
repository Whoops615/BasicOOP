package by.htp.bouquet.bean;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	private Cover cover;
	private List<Flower> flowers;

	public Bouquet() {
		flowers = new ArrayList<Flower>();
	}

	public Bouquet(Cover cover, List<Flower> flowers) {
		this.cover = cover;
		this.flowers = flowers;
	}

	public Flower getFlower(int index) {
		return flowers.get(index);
	}

	public void setFlower(Flower Flower) {
		flowers.add(Flower);
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "Bouquet [cover=" + cover + ", flowers=" + flowers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		return true;
	}

}
