package by.htp.bouquet.bean;

public enum FlowerType {

	ROSE, TULIP, CHAMOMILE, ALOE, CARNATION;

	private int price;

	static {
		ROSE.price = 200;
		TULIP.price = 170;
		CHAMOMILE.price = 50;
		ALOE.price = 400;
		CARNATION.price = 100;
	}

	public int getPrice() {
		return price;
	}

}
