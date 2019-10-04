package by.htp.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private List<Product> basket;

	public Payment() {
		basket = new ArrayList<Product>();
	}

	public void add(Product newProduct) {
		basket.add(newProduct);
	}

	public List<Product> getBasket() {
		return basket;
	}

	public  class Product {
		private String title;
		private int price;
		
		public Product() {
			
		}

		public Product(String title, int price) {
			this.title = title;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}

}
