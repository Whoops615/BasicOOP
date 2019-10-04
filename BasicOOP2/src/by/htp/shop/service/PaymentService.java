package by.htp.shop.service;

import by.htp.shop.bean.Payment;
import by.htp.shop.bean.Payment.Product;

public class PaymentService {

	public int costPayment(Payment payment) {
		int cost = 0;

		for (Product p : payment.getBasket()) {
			cost = cost + p.getPrice();
		}

		return cost;
	}

}
