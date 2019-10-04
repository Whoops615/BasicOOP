package by.htp.bouquet.main;

import by.htp.bouquet.controller.Controller;

public class Main {

	public static void main(String[] args) {

		Controller cont = new Controller();

		String s = cont.doAction("addCover type=PAPER color=black");
		String s1 = cont.doAction("addFlower type=ALOE color=green");
		String s2 = cont.doAction("addFlower type=CHAMOMILE color=red");
		String s3 = cont.doAction("addFlower type=CHAMOMILE color=red");
		String s4 = cont.doAction("addFlower type=ROSE color=orange");
		String s5 = cont.doAction("addFlower type=CARNATION color=blue");
		String s6 = cont.doAction("addFlower type=TULIP color=white");
		String s7 = cont.doAction("cost");

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

	}

}
