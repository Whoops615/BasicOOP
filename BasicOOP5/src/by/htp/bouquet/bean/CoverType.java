package by.htp.bouquet.bean;

public enum CoverType {

	PAPER, PLASTIC;

	private int price;
	static {
		PAPER.price = 1000;
		PLASTIC.price = 700;
	}
	public int getPrice() {
		return price;
	}

}
