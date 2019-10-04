package by.htp.shop.main;

import by.htp.shop.bean.Payment;

import by.htp.shop.service.PaymentService;

public class Main {

	public static void main(String[] args) {

		Payment p = new Payment();
		PaymentService ps = new PaymentService();

		p.add(p.new Product("milk", 500));
		p.add(p.new Product("coffe", 1200));
		p.add(p.new Product("cat", 5000));
		p.add(p.new Product("tea", 600));

		System.out.println(ps.costPayment(p));

	}

}
